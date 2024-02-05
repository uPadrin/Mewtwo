package com.mewtow.cardProcessor.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name ="tb_transaction")
public class Transaction {
	
	@Id
	private Long id;

	@ManyToOne
	@JsonIgnoreProperties("transaction")
	private Person person;

	@NotNull
	private String transactionDate;

	@NotNull
	private int amount;

	public Transaction(Long id, String transactionDate, int amount) {
		this.id = id;
		this.transactionDate = transactionDate;
		this.amount = amount;
	}

	public Transaction() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
}
