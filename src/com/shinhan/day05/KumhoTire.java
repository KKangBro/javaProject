package com.shinhan.day05;

public class KumhoTire extends Tire {
	String intro = "금호타이어무야호";

	void method2() {
		System.out.println("KumhoTire만 갖는 기능");
	}

	@Override
	void roll() {
		System.out.println("금호 타이어가 굴러갑니다.");
	}
}
