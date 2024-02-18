package com.example.blins.cassandra.PDOs;

import lombok.*;

@Data
@Builder
public class CardPojo {
    int accountNumber;
    private String name;
    private String type;
}
