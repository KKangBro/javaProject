package com.shinhan.day03;

public class PersonTest {
	public static void main(String[] args) {
		System.out.println("전체 인구 수: " + Person.getPopulation());

		Person[] persons = new Person[3];

		persons[0] = new Person();
		persons[1] = new Person(27, "김경윤");
		persons[2] = new Person(20, "홍길동");

		for (Person p : persons) {
			p.selfIntroduce();
		}

		System.out.println("전체 인구 수: " + Person.getPopulation());

	}
}
