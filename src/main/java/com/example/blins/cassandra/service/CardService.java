package com.example.blins.cassandra.service;

import com.example.blins.cassandra.PDOs.CardPojo;
import com.example.blins.cassandra.entity.Cards;
import reactor.core.publisher.Flux;


public interface CardService {
    Cards addCard(Cards request);

    CardPojo getAllCards();

    Flux<Cards> getCard(Long account);
}
