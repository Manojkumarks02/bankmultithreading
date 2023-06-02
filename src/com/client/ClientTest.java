package com.client;

import com.model.Account;
import com.work.AccountHolder;

public class ClientTest {
	public static void main(String[] args) {

		Account account = new Account();
		AccountHolder accountHolder = new AccountHolder(account);

		Thread t1 = new Thread(accountHolder);
		Thread t2 = new Thread(accountHolder);

		t1.setName("John");
		t2.setName("adam");

		t1.start();
		t2.start();
	}

}
