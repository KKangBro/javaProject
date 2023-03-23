package com.shinhan.day05;

public class HankookTire extends Tire {
	String info = "한국타이어최고";

	void method1() {
		System.out.println("HankookTire만 갖는 기능");
	}

	@Override
	void roll() {
		System.out.println("한국 타이어가 굴러갑니다.");
	}
}
