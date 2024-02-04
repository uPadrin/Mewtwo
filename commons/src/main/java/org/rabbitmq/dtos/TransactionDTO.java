package org.rabbitmq.dtos;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

public class TransactionDTO implements Serializable {

    private UUID transactionId;
    private String transactionDate;
    private String id;
    private String name;
    private String age;
    private String amount;
    private String installmentNumber;

    public TransactionDTO(UUID transactionId, String transactionDate, String id, String name, String age, String amount, String installmentNumber) {
        this.transactionId = transactionId;
        this.transactionDate = transactionDate;
        this.id = id;
        this.name = name;
        this.age = age;
        this.amount = amount;
        this.installmentNumber = installmentNumber;
    }

    public TransactionDTO() {
    }

    public UUID getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(UUID transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getInstallmentNumber() {
        return installmentNumber;
    }

    public void setInstallmentNumber(String installmentNumber) {
        this.installmentNumber = installmentNumber;
    }
}
