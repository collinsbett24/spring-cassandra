package com.example.blins.cassandra.PDOs;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class CardPojo {
    int accountNumber;
    private String name;
    private String type;
}
