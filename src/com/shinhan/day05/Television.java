package com.shinhan.day05;

// interface 구현 클래스
public class Television implements RemoteControl {

	@Override
	public void powerOn() {
		System.out.println(getClass().getSimpleName()+"전원 켠다.");
	}

	@Override
	public void powerOff() {
		System.out.println(getClass().getSimpleName()+"전원 끈다.");
	}
	
}
