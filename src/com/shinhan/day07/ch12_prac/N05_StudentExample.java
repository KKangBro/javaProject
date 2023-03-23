package com.shinhan.day07.ch12_prac;

import java.util.HashSet;

public class N05_StudentExample {

	public static void main(String[] args) {
		HashSet<N05_Student> hashSet = new HashSet<>();
		
		hashSet.add(new N05_Student("1"));
		hashSet.add(new N05_Student("1"));
		hashSet.add(new N05_Student("2"));
		
		System.out.println("저장된 Student 수: " + hashSet.size());
	}

}
