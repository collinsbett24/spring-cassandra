package com.example.blins.cassandra.entity;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table
public class Cards {
    @PrimaryKey
    private Long accountNumber;
    private String name;
    private String type;
    private int balance;
}
