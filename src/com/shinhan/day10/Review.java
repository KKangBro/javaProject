package com.shinhan.day10;

// ----thread.start()하면 run() 호출된다.
// 1. Thread 상속
class MyThreadA extends Thread {

	public MyThreadA(String name) {
		super(name);
//		setName(name);
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(getName() + " : " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

// 2. 이미 상속중이라면 Runnable interface 구현
class MyThreadB extends Object implements Runnable {
	@Override
	public void run() {
		for (int i = 100; i <= 110; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Review {

	public static void main(String[] args) {
		Thread t1 = new MyThreadA("[MyThreadA]");
		Runnable run = new MyThreadB();
		Thread t2 = new Thread(run);
		t2.setName("[MyThreadB]");
		t1.start();
		t2.start();

		Thread t3 = new Thread() {
			@Override
			public void run() {
				for (int i = 200; i <= 210; i++) {
					System.out.println(getName() + " : " + i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};

		Thread t4 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 300; i <= 310; i++) {
					System.out.println(Thread.currentThread().getName() + " : " + i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});

		t3.start();
		t4.start();
		System.out.println("main end~");
	}

}
