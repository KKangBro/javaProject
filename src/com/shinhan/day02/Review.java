package com.shinhan.day02;

public class Review {

	public static void main(String[] args) {
		System.out.println("main 시작");
		f1();
		System.out.println("main end");

	}

	private static void f1() {
		System.out.println("f1 function");
		// 기본형 data type: byte, short, char, int, long, float, double, boolean
		// 값을 저장, 연산, 비교
		// Wrapper class: 기본형 data type + 기능 추가
		boolean b = true;
		
		byte v1 = 100;
		int v2;
		// 1. 자동 형 변환
		v2 = v1;
		// 2. 강제 형 변환.. casting
		v1 = (byte) v2;
		
		// String은 기본형이 아님.. java.lang.String class
		String s = "100";
		int v3 = Integer.parseInt(s);
		System.out.println(v3 + 300);
	}
}
