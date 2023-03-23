package com.shinhan.day09;

import lombok.NoArgsConstructor;

// 멀티쓰레드 만드는 방법
// 1. extends Thread... run()메서드 재정의하여 구현한다.
@NoArgsConstructor
public class MyThread1 extends Thread {

	public MyThread1(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (char i = 'A'; i <= 'Z'; i++) {
			System.out.println("[" + getName() + "] i = " + i);
		}
	}

}
