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
	private String transaction_date;

	@NotNull
	private int amount;

	public Transaction(Long id, Person person, String transaction_date, int amount) {
		this.id = id;
		this.person = person;
		this.transaction_date = transaction_date;
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

	public Person getPerson_id() {
		return person;
	}

	public void setPerson_id(Person person) {
		this.person = person;
	}

	public String getTransaction_date() {
		return transaction_date;
	}

	public void setTransaction_date(String transaction_date) {
		this.transaction_date = transaction_date;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
}
