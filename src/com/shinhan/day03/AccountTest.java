package com.shinhan.day03;

public class AccountTest {

	public static void main(String[] args) {
		Account acc1 = new Account();
		Account acc = new Account("078-3762-293", 1000000);
		acc.deposit(2000000);
		acc.withdraw(500000);
		
		System.out.println(acc.getBalance());
		System.out.println(acc.getAccNo());
		
		System.out.println(acc);
	}

}
