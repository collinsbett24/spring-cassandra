package com.example.blins.cassandra.controller;

import com.example.blins.cassandra.PDOs.CardPojo;
import com.example.blins.cassandra.entity.Cards;
import com.example.blins.cassandra.service.CardService;
import org.springframework.http.ResponseEntity;
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
    public Mono<Cards> addCard(@RequestBody Cards request){
        return Mono.just(cardService.addCard(request));
    }

    @GetMapping("/")
    public Flux<CardPojo> getCards(){
        CardPojo cards = cardService.getAllCards();
        return Flux.just(cards);
    }
    @GetMapping("{account}/get-card")
    public Flux<ResponseEntity<Cards>> getCardByAccountNumber(@PathVariable Long account) {
        Flux<Cards> card = cardService.getCard(account);
        return card.map(p-> ResponseEntity.ok(p)).defaultIfEmpty(ResponseEntity.notFound().build());
    }
}
