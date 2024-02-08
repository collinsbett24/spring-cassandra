package com.example.blins.cassandra.repository;

import com.example.blins.cassandra.entity.Cards;
import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;
import reactor.core.publisher.Flux;

public interface CardsRepository extends ReactiveCassandraRepository<Cards, Long> {
    @AllowFiltering
    Flux<Cards> findbyAccountNumber(Long accountNumber);
}
