package com.shinhan.day09;

public class PrintThread extends Thread {
	SharedArea sharedArea;

	public PrintThread(SharedArea sharedArea) {
		this.sharedArea = sharedArea;
	}

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			sharedArea.printBalance();
		}
	}

}
