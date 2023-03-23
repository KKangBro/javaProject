package com.shinhan.day09;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BathThread extends Thread {
	Bathroom room;
	String userName;
	
	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			room.use(userName);
		}
	}

	
}
