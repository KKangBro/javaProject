package com.shinhan.day09;

import lombok.Setter;

@Setter
public class SafeThread extends Thread {
	private boolean stop; // false가 default

//	@Override
//	public void run() {
//		while(!stop) {
//			System.out.println("SafeThread...실행중");
//		}
//		System.out.println("자원 정리");
//		System.out.println("SafeThread 종료!");
//	}

//	@Override
//	public void run() {
//		try {
//			while (true) {
//				System.out.println("SafeThread...실행중");
//				Thread.sleep(100);
//			}
//		} catch (InterruptedException e) {
////			e.printStackTrace();
//		}
//
//		System.out.println("자원 정리");
//		System.out.println("SafeThread 종료!");
//	}

	@Override
	public void run() {
		while (true) {
			System.out.println("SafeThread...실행중");
			if (Thread.interrupted())
				break;
		}

		System.out.println("자원 정리");
		System.out.println("SafeThread 종료!");
	}
}
