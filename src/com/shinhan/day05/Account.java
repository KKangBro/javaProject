package com.shinhan.day05;

import java.io.Serializable;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode(of = { "accNo", "owner" })
// 부모class로 사용할 예정
public class Account implements Comparable<Account>, Serializable{
	// 1.field
	private String accNo;
	private String owner;
	private int balance;

	// 생성자
	public Account() {
	}

	public Account(String accNo, String owner) {
		this.accNo = accNo;
		this.owner = owner;
	}
	
	public Account(String accNo, String owner, int balance) {
		this.accNo = accNo;
		this.owner = owner;
		this.balance = balance;
	}

	// 메서드
	public void deposit(int amount) {
		balance += amount;
	}

	public int withdraw(int amount) {
		if (amount > balance) {
			System.out.println("잔고부족");
			return 0;
		}
		balance -= amount;
		return amount;
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public int compareTo(Account other) {
		if (this.equals(other))
			return 0;
//		return this.owner.compareTo(other.owner); // ASC
//		return this.accNo.compareTo(other.accNo);
		int rst = this.balance - other.balance;
		if (rst == 0)
			return this.owner.compareTo(other.owner);
		return rst;
	}

}
