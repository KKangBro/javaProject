package com.shinhan.day03;

// class는 설계도, object를 만드는 틀
// object는 class를 이용해서 만든 독립된 개체(실체 instance)
public class Car {
	// 1. field (속성, 멤버변수)
	String model;
	String color;
	int price;

	// 2. 생성자 메서드 (생성시 초기화가 목적)
	// 컴파일시에 자동으로 .class에 파라메터없는 default 생성자가 만들어진다.
	// 즉, 생성자를 정의하는 것은 필수는 아님.
	// 생성자 정의하면 default생성자가 자동으로 만들어지지는 않는다.
	// 생성자는 return정의가 없다. return을 넣어주면 일반 메서드가 돼버림.
	// 생성자는 클래스 이름과 같아야함.
	public Car() {
		System.out.println("3. Car의 default생성자");
	}

	// 3. 일반 메서드 (method, 기능, 동작)
	void go() {
		System.out.println("자동차가 간다.");
	}
	// 4. block (instance block, static block)
	{
		System.out.println("2. instance block.. 생성시 마다 실행");
	}
	static {
		System.out.println("1. static block.. 클래스가 로드될 때 한 번 실행");

	}
	// 5. inner class

}
