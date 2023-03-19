package com.rizkiaazmi.springreactivedemo.repository;

import com.rizkiaazmi.springreactivedemo.domain.Person;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Created by Rizki Abdillah Azmi on 19-Mar-23
 */
public interface PersonRepository {
    Mono<Person> getById(Integer id);
    Flux<Person> findAll();
}
