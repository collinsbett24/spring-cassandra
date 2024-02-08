package com.example.blins.cassandra.service;

import com.example.blins.cassandra.PDOs.CardPojo;
import org.springframework.stereotype.Service;


public interface CardService {
    public String addCard(CardPojo request);

    CardPojo getAllCards();

    CardPojo getCard(Long account);
}
