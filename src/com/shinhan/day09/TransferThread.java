package com.shinhan.day09;

public class TransferThread extends Thread {
	SharedArea sharedArea;

	public TransferThread(SharedArea sharedArea) {
		this.sharedArea = sharedArea;
	}

	@Override
	public void run() {
		for (int i = 0; i < 12; i++) {
			sharedArea.transfer();
		}
	}

}
