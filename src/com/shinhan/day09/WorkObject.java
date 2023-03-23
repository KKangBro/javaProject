package com.shinhan.day09;

// 공유영역
public class WorkObject {
	
	public synchronized void methodA() {
		Thread t = Thread.currentThread();
		System.out.println(t.getName() + "작업 실행 A");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void methodB() {
		Thread t = Thread.currentThread();
		System.out.println(t.getName() + "작업 실행 B");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
