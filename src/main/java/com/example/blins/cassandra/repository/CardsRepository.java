package com.example.blins.cassandra.repository;

import com.example.blins.cassandra.entity.Cards;
import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.repository.CrudRepository;
import reactor.core.publisher.Flux;

public interface CardsRepository extends CrudRepository<Cards, Long> {
    @AllowFiltering
    Flux<Cards> findByAccountNumber(Long accountNumber);
}
