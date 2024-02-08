package com.example.blins.cassandra.impl;

import com.example.blins.cassandra.PDOs.CardPojo;
import com.example.blins.cassandra.service.CardService;
import org.springframework.stereotype.Service;

@Service
public class CardServiceImpl implements CardService {
    @Override
    public String addCard(CardPojo request) {
        return null;
    }

    @Override
    public CardPojo getAllCards() {
        return null;
    }

    @Override
    public CardPojo getCard(Long account) {
        return null;
    }
}
