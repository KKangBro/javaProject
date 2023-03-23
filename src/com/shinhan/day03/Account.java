package com.shinhan.day03;

public class Account {
	private String accNo;
	private int balance;

	public Account() {
		this(null, 0);
	}

	public Account(String accNo, int balance) {
		this.accNo = accNo;
		this.balance = balance;
		System.out.printf("%s 계좌가 개설되었습니다.\n%s 계좌의 잔고는 %d원입니다.\n", accNo, accNo, balance);
	}

	public void deposit(int money) {
		balance += money;
		System.out.printf("%s 계좌에 %d원이 입금되었습니다.\n%s 계좌의 잔고는 %d원입니다.\n", accNo, money, accNo, balance);
	}

	public void withdraw(int money) {
		balance -= money;
		System.out.printf("%s 계좌에 %d원이 출금되었습니다.\n%s 계좌의 잔고는 %d원입니다.\n", accNo, money, accNo, balance);
	}

	// getter
	public int getBalance() {
		return balance;
	}

	public String getAccNo() {
		return accNo;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", balance=" + balance + "]";
	}
	
}
