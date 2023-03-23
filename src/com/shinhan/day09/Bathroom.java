package com.shinhan.day09;

// 공유영역
public class Bathroom {
	boolean isFirst = true;

	public void use(String name) {
		synchronized (this) {
			if (isFirst && name.equals("김길동")) {
				try {
					wait(); // 일시정지상태로 간다. notify(), notifyAll()에 의해 신호 오기 전까지
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			isFirst = false;
			System.out.println(name + " 입장한다.");
			System.out.println(name + " 사용한다.");
			System.out.println(name + " 퇴장한다.");
			System.out.println("---------------");
			notifyAll(); // 신호를 보낸다. wait() 상태에 있는 쓰레드가 실행대기상태(Runnable)로 간다.
		}
	}

//	public synchronized void use(String name) {
//		System.out.println(name + " 입장한다.");
//		System.out.println(name + " 사용한다.");
//		System.out.println(name + " 퇴장한다.");
//		System.out.println("---------------");
//	}
}
