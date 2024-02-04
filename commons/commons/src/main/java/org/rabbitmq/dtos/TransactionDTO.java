package org.rabbitmq.dtos;

import java.io.Serializable;

public class TransactionDTO implements Serializable {

    private Long idTransaction;
    private String dateTransaction;
    private Long document;
    private String name;
    private int age;
    private Double value;
    private int numParcelas;

    public TransactionDTO(Long idTransaction, String dateTransaction, Long document, String name, int age, Double value, int numParcelas) {
        this.idTransaction = idTransaction;
        this.dateTransaction = dateTransaction;
        this.document = document;
        this.name = name;
        this.age = age;
        this.value = value;
        this.numParcelas = numParcelas;
    }

    public TransactionDTO() { }

    @Override
    public String toString() {
        return "JsonDTO{" +
                "idTransaction=" + idTransaction +
                ", dateTransaction='" + dateTransaction + '\'' +
                ", document=" + document +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", value=" + value +
                ", numParcelas=" + numParcelas +
                '}';
    }

    public Long getIdTransaction() {
        return idTransaction;
    }

    public void setIdTransaction(Long idTransaction) {
        this.idTransaction = idTransaction;
    }

    public String getDateTransaction() {
        return dateTransaction;
    }

    public void setDateTransaction(String dateTransaction) {
        this.dateTransaction = dateTransaction;
    }

    public Long getDocument() {
        return document;
    }

    public void setDocument(Long document) {
        this.document = document;
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

    public void setAge(int age) {
        this.age = age;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public int getNumParcelas() {
        return numParcelas;
    }

    public void setNumParcelas(int numParcelas) {
        this.numParcelas = numParcelas;
    }
}
