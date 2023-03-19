package com.rizkiaazmi.springreactivedemo.repository;

import com.rizkiaazmi.springreactivedemo.domain.Person;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Created by Rizki Abdillah Azmi on 19-Mar-23
 */
public class PersonRepositoryImpl implements PersonRepository {

    Person rizki = new Person(1, "Rizki", "Abdillah Azmi");
    Person nizam = new Person(2, "Nizam", "Salihin");
    Person yazid = new Person(3, "Yazid", "Yasykur");
    Person rais = new Person(4, "Muhammad", "Rais");
    @Override
    public Mono<Person> getById(Integer id) {
        return Mono.just(rizki);
    }

    @Override
    public Flux<Person> findAll() {
        return Flux.just(rizki, nizam, yazid, rais);
    }
}
