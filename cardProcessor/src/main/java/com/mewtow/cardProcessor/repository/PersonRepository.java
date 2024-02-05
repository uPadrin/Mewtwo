package com.mewtow.cardProcessor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mewtow.cardProcessor.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
