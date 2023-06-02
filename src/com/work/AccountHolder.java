package com.work;

import com.model.Account;

public class AccountHolder implements Runnable {
	private Account account;

	public AccountHolder(Account account) {
		this.account = account;

	}

	public void run() {
		for (int i = 1; i < 7; i++) {
			makeWithdrawal(4000);

			if (account.getBalance() < 0) {
				System.out.println("Amount is overdraw");
			}
		}
	}

	public synchronized void makeWithdrawal(int withdrawAmount) {
		if (account.getBalance() >= withdrawAmount) {
			System.out.println(Thread.currentThread().getName() + " is going to withdraw " + withdrawAmount);
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			account.withdraw(withdrawAmount);
			System.out.println(Thread.currentThread().getName() + " completed the withdrawal " + withdrawAmount);

		} else {
			System.out.println(
					"insuffient balance " + Thread.currentThread().getName() + " to withdraw  " + account.getBalance());
		}
	}
}
