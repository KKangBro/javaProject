package com.shinhan.day09;


// 멀티쓰레드 만드는 방법
// 2. 이미 부모class를 상속받고 있다면 Runnable interface구현한다.
public class MyThread3 extends Object implements Runnable {

	@Override
	public void run() {
		for (char i = 'a'; i <= 'z'; i++) {
			System.out.println("[" + Thread.currentThread().getName() + "] i = " + i);
		}
	}

}
