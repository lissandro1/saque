package model.entities;

import model.exceptions.DomainException;

public class Account {
	
	private Integer number;
	private String holder;
	private Double balance;
	private Double whithDrawLimit;
	
	public Account(Integer number, String holder, Double balance, Double whithDrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.whithDrawLimit = whithDrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getwhithDrawLimit() {
		return whithDrawLimit;
	}

	public void setwhithDrawLimit(Double whithDrawLimit) {
		this.whithDrawLimit = whithDrawLimit;
	}
	
	public void deposit(double amount) {
		balance += amount;
		
	}
	
	public void withDraw (double amount) {
		
		if(amount > whithDrawLimit) {
			throw new DomainException("Withdraw error: The amount exceeds withdraw limit");
		}
		if (amount > balance) {
			throw new DomainException("Withdraw error: Not enough balance");
		}
		
		balance -= amount;
	}
	
	
	
	

}
