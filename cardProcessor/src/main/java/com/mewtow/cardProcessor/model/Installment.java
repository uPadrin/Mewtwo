package com.mewtow.cardProcessor.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_istallment")
public class Installment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long id;
	
	@NotNull
	private Long installment_number;
	
	@NotNull
	private BigDecimal value;
	
	@ManyToOne
	@JsonIgnoreProperties("installment")
	private Transaction transaction;

	public Installment(Long id, Long installment_number, BigDecimal value, Transaction transaction) {
		this.id = id;
		this.installment_number = installment_number;
		this.value = value;
		this.transaction = transaction;
	}

	public Installment() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getInstallment_number() {
		return installment_number;
	}

	public void setInstallment_number(Long installment_number) {
		this.installment_number = installment_number;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}
}
