package com.example.blins.cassandra.impl;

import com.example.blins.cassandra.PDOs.CardPojo;
import com.example.blins.cassandra.entity.Cards;
import com.example.blins.cassandra.repository.CardsRepository;
import com.example.blins.cassandra.service.CardService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class CardServiceImpl implements CardService {
    private CardsRepository repository;

    public CardServiceImpl(CardsRepository repository) {
        this.repository = repository;
    }

    @Override
    public Cards addCard(Cards request) {
        return repository.save(request);
    }

    @Override
    public CardPojo getAllCards() {
        return null;
    }

    @Override
    public Flux<Cards> getCard(Long account) {
        Flux<Cards> pojo =repository.findByAccountNumber(account);
        return pojo;
    }
}
