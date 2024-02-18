package com.example.blins.cassandra.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table
public class Cards {
    @PrimaryKey
    private Long accountNumber;
    private String name;
    private String type;
    private int balance;
}
