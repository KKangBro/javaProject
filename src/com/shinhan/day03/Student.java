package com.shinhan.day03;

// class = 변수 + 메서드
public class Student {
	// 1. field(변수, 속성, 특징)
	String name;
	String stdId;
	String subject;
	int score;

	// 2. Constructor(생성자)메서드..Compile시에 자동으로 default생성자가 제공된다. 정의 가능하다.
	// 생성자가 정의되면 default생성자가 만들어지지 않는다.
	// 생성자의 Overloading.. 이름은 같고 매개변수 사양이 다르다.
	Student() {
		System.out.println("3 default생성자에 의해 Student가 만들어짐");
	}

	Student(String name, String stdId, String subject, int score) {
		System.out.println("3 arg4개 생성자에 의해 Student가 만들어짐");
		// 멤버 변수(field)와 매개변수(argument)가 충돌
		// 구별 필요하다. 이 클래스로 만든 현재 객체를 this라고함.
		this.name = name;
		this.stdId = stdId;
		this.subject = subject;
		this.score = score;
	}

	// 3. 일반 메서드(행위)
	void study() {
		System.out.println(this.name + "학생이 공부합니다.");

	}

	// 4. block(instance block-객체 생성시마다 수행, static block-클래스 load시 1회 수행)
	{
		System.out.println("2 instance block");
	}
	static {
		System.out.println("1 static block");
	}

	// 5. inner class
	class Phone {

	}
}
