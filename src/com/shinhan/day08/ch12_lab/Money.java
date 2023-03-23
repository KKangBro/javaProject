package com.shinhan.day08.ch12_lab;

import java.util.Comparator;

public class Money implements Comparable<Money> {
	int amount;

	public Money(int amount) {
		this.amount = amount;
	}

	public Money add(Money money) {
		// 더하기 구현
		return new Money(this.amount + money.amount);
	}

	public Money minus(Money money) {
		// 빼기 구현
		return new Money(this.amount - money.amount);
	}

	public Money multiply(Money money) {
		// 곱하기 구현
		return new Money(this.amount * money.amount);
	}

	public Money devide(Money money) {
		// 나누기 구현
		return new Money(this.amount / money.amount);
	}

	@Override
	public boolean equals(Object obj) {
		// Object equals 메쏘드 재정의
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Money other = (Money) obj;
		return amount == other.amount;
	}

	@Override
	public String toString() {
		return "Money [amount=" + amount + "]";
	}

	public static void main(String[] args) {
		Money five = new Money(5);
		Money two = new Money(2);
		Money three = new Money(3);
		Money ten = new Money(10);

		if (five.equals(two.add(three)) && three.equals(five.minus(two)) && ten.equals(five.multiply(two))
				&& two.equals(ten.devide(five))) {
			System.out.println("Money Class 구현을 완료 하였습니다.");
		}
	}

	@Override
	public int compareTo(Money m) {
		return this.amount - m.amount;
	}
}
