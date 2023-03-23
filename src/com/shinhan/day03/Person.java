package com.shinhan.day03;

public class Person {
	private static int numberOfPersons = 0; // static 변수
	private int age; // instance 변수
	private String name; // instance 변수

	public Person() {
		this(12, "Anonymous");
	}

	public Person(int age, String name) {
		this.age = age;
		this.name = name;
		numberOfPersons++;
	}

	public void selfIntroduce() {
		System.out.printf("내 이름은 %s이며, 나이는 %d살입니다.\n", name, age);
	}

	static public int getPopulation() {
		return numberOfPersons;
	}

	
}
