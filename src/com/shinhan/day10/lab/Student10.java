package com.shinhan.day10.lab;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Student10 implements Comparable<Student10> {
	public String id;
	public int score;

	@Override
	public int compareTo(Student10 other) {
		return score - other.score;
	}
}
