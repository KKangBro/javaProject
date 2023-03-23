package com.shinhan.day09;

import com.shinhan.day05.Account;

import lombok.AllArgsConstructor;

// 공유자원으로 이용할 class
// 2개의 계좌가 있다.
@AllArgsConstructor
public class SharedArea {
	Account sung;
	Account lee;

	// synchronized block이용
	void transfer() {
		synchronized (this) {
			// 출금
			lee.withdraw(1_000_000);
			System.out.print("LEE계좌: 100만원 인출, ");
			// 입금
			sung.deposit(1_000_000);
			System.out.println("SUNG계좌: 100만원 입금.");

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	// 메서드의 활용방법이용: synchronized
	synchronized void printBalance() {
		int sum = lee.getBalance() + sung.getBalance();
		System.out.println("계좌 잔액 합계: " + sum);

		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
