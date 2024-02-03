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
@Getter
@Setter
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
	
}
