package com.shinhan.day10.lab;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<Student10> treeset = new TreeSet<>();
		treeset.add(new Student10("blue", 96));
		treeset.add(new Student10("hong", 86));
		treeset.add(new Student10("blue", 96));
		
		Student10 student = treeset.last();
		System.out.println("최고 점수: " + student.score);
		System.out.println("최고 점수를 받은 아이디: " + student.id);
	}

}
