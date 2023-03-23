package com.shinhan.day09;

import com.shinhan.day05.Account;

public class ThreadTest4 {

	public static void main(String[] args) throws InterruptedException {
		f10();
	}

	private static void f10() {
		AutoSaveThread t1 = new AutoSaveThread();
		t1.setDaemon(true); // 메인 쓰레드 종료시 Daemon이 종료
		t1.start();

		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("main end");
	}

	private static void f8f9() {
		SafeThread t1 = new SafeThread();
		t1.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t1.interrupt();
	}

	// SafeThread
	private static void f7() {
		SafeThread t1 = new SafeThread();
		t1.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t1.setStop(true);
	}

	// 쓰레드에서 다른 쓰레드에 신호 보내기 : wait(), notify()
	private static void f6() {
		WorkObject obj = new WorkObject();
		
		ThreadA t1 = new ThreadA(obj);
		ThreadB t2 = new ThreadB(obj);
		
		t1.start();
		t2.start();
	}

	// 동기화
	private static void f5() {
		SharedArea sa = new SharedArea(new Account("111", "성춘향", 10_000_000), new Account("222", "이몽룡", 20_000_000));
		TransferThread t1 = new TransferThread(sa);
		PrintThread t2 = new PrintThread(sa);
		t1.start();
		t2.start();
	}

	// 동기화
	private static void f4() {
		// 익명쓰레드 만들기
		Calculator cal = new Calculator(); // 2개의 쓰레드가 공유하는 공유영역

		User1Thread t1 = new User1Thread();
		User2Thread t2 = new User2Thread();

		t1.setCalculator(cal);
		t2.setCalculator(cal);

		t1.start();
		t2.start();

	}

	// 동기화(공유영역을 하나의 쓰레드가 사용중일때 다른쓰레드가 접근금지)
	private static void f3() {
		Bathroom bathroom = new Bathroom();
		BathThread t1 = new BathThread(bathroom, "홍길동");
		BathThread t2 = new BathThread(bathroom, "김길동");
		BathThread t3 = new BathThread(bathroom, "이길동");
		BathThread t4 = new BathThread(bathroom, "박길동");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

	// join test
	private static void f2() throws InterruptedException {
		SumThread t1 = new SumThread(1, 50);
		SumThread t2 = new SumThread(51, 100);
		t1.start();
		t2.start();
		t1.join(); // t1이 끝나면 아래를 수행함.
		t2.join();
		System.out.println(t1.getSum() + " + " + t2.getSum() + " = " + (t1.getSum() + t2.getSum()));
		System.out.println("main end..");
	}

	// yield test
	private static void f1() throws InterruptedException {
		WorkThread t1 = new WorkThread("쓰레드A");
		WorkThread t2 = new WorkThread("쓰레드B");

		t1.start();
		t2.start();

		// 5초간 일시정지
		Thread.sleep(5000);
		// t1의 work를 false... t1쓰레드가 다른쓰레드에 양보하다
		t1.work = false;
		// 10초 후 다시 true
		Thread.sleep(10000);
		t1.work = true;
	}

}
