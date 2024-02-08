package com.example.blins.cassandra.controller;

import com.example.blins.cassandra.PDOs.CardPojo;
import com.example.blins.cassandra.service.CardService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("api/card")
public class CardsController {

    public CardsController(CardService cardService) {
        this.cardService = cardService;
    }

    CardService cardService;
    @PostMapping()
    public Mono<String> addCard(@RequestBody CardPojo request){
        String response = cardService.addCard(request);
        return Mono.just(response);
    }

    @GetMapping()
    public Flux<CardPojo> getCards(){
        CardPojo cards = cardService.getAllCards();
        return Flux.just(cards);
    }
    @GetMapping("{account}/get-card")
    public Mono<CardPojo> getCardByAccountNumber(@PathVariable Long account) {
        CardPojo card = cardService.getCard(account);
        return Mono.just(card);
    }
}
