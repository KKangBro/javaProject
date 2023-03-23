package com.shinhan.day09;

import lombok.Setter;

@Setter
public class User1Thread extends Thread {

	Calculator calculator;

	public User1Thread() {
		setName("User1Thread");
	}

	@Override
	public void run() {
		calculator.setMemory1(100);
	}

}
