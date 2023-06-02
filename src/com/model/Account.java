package com.model;

public class Account {
	private int balance = 4000;

	public int getBalance() {
		return balance;
	}

	public void withdraw(int amount) {
		balance = balance - amount;

	}
}
