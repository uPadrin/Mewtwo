package org.rabbitmq.dtos;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

public class TransactionDTO implements Serializable {

    private UUID idTransaction;
    private String dateTransaction;
    private String document;
    private String name;
    private String age;
    private String valueTransaction;
    private String numParcelas;

    public TransactionDTO(UUID idTransaction, String dateTransaction, String document, String name, String age, String valueTransaction, String numParcelas) {
        this.idTransaction = idTransaction;
        this.dateTransaction = dateTransaction;
        this.document = document;
        this.name = name;
        this.age = age;
        this.valueTransaction = valueTransaction;
        this.numParcelas = numParcelas;
    }

    public TransactionDTO() { }

    public UUID getIdTransaction() {
        return idTransaction;
    }

    public void setIdTransaction(UUID idTransaction) {
        this.idTransaction = idTransaction;
    }

    public String getDateTransaction() {
        return dateTransaction;
    }

    public void setDateTransaction(String dateTransaction) {
        this.dateTransaction = dateTransaction;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getValueTransaction() {
        return valueTransaction;
    }

    public void setValueTransaction(String valueTransaction) {
        this.valueTransaction = valueTransaction;
    }

    public String getNumParcelas() {
        return numParcelas;
    }

    public void setNumParcelas(String numParcelas) {
        this.numParcelas = numParcelas;
    }
}
