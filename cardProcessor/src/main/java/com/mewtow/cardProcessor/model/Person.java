package com.mewtow.cardProcessor.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "tb_person")
public class Person {

    @Id
    private Long id;

    @NotNull
    private  String name;

    @NotNull
    private int age;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "person", cascade = CascadeType.REMOVE)
    @JsonIgnoreProperties("person")
    private List<Transaction> transaction;

    public Person(Long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) { this.age = age; }

    public List<Transaction> getTransaction() {
        return transaction;
    }

    public void setTransaction(List<Transaction> transaction) {
        this.transaction = transaction;
    }
}
