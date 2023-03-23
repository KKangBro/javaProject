package com.shinhan.day09;

import lombok.Setter;

@Setter
public class User2Thread extends Thread {

	Calculator calculator;

	public User2Thread() {
		setName("User2Thread");
	}

	@Override
	public void run() {
		calculator.setMemory2(50);
	}

}
