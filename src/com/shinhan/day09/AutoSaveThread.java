package com.shinhan.day09;

public class AutoSaveThread extends Thread{
	public void save() {
		System.out.println("작업 내용을 저장합니데이");
	}

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				break;
			}
			save();
		}
	}
	
}
