package com.shinhan.day05;

// interface 구현 클래스
public class Audio implements RemoteControl, WIFI {

	@Override
	public void powerOn() {
		System.out.println(getClass().getSimpleName()+"전원 켠다.");
	}

	@Override
	public void powerOff() {
		System.out.println(getClass().getSimpleName()+"전원 끈다.");
	}

	@Override
	public void display() {
		RemoteControl.super.display();
		System.out.println("default method 재정의");
	}
	
	public void display2() {
		System.out.println("^오^");
	}

	@Override
	public void wifiTurnOn() {
		System.out.println("wifi turn on!!");
	}
	
}
