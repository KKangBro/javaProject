package com.shinhan.day11;

public class Person {
	public void action1(Workable workable) {
		workable.work("홍길동", "프로그래밍");
	}

	public void action2(Speakable speakable) {
		String rst = speakable.speak("너 지금 뭐하묘");
		System.out.println(rst);
	}
}
