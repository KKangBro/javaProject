package com.shinhan.day01;

public class VariableTest2 {

	public static void main(String[] args) {
		System.out.println("main 시작");
		f3();	// 함수 호출 (갔다가 돌아온다)
		System.out.println("main 끝~");
	}

	private static void f3() {
		short v1 = 32_767;
		System.out.println("v1: "+v1);
		char v2 = 'A';	// ''불가, "A"불가
		int v3 = Integer.MAX_VALUE;	// 2,147,483,647;
		System.out.println("v3: "+v3);
		long v4 = 2_147_483_648L;	// L 붙여야함.
		System.out.println("v4: "+v4);
		float v5 = 3.14f;	// f 붙여야함.
		double v6 = 3.14;
		
		char v7 = 65;
		char v8 = 0x0041;
		System.out.println(v7 +", "+ v8);
		System.out.println(++v7 +", "+ ++v8);

		boolean rst;
		rst = 10 > 20;
		System.out.println(rst);
	}

	private static void f2() {
		// 자바의 dataType :
		// 정수(byte-1, short-2, char-2, int-4, long-8)
		// 실수(float-4, double-8)
		// 논리(boolean)
		// 00000000
		// 01111111 : 127
		// 10000000 : -128
		byte v1 = 127;
		byte v2 = -128;
		System.out.println(Integer.toBinaryString(v1));
		System.out.println(Integer.toBinaryString(v2));
		v1++;
		System.out.println(v1);

		
	}

	private static void f1() {
		int a;
		System.out.println(a=10);	// a에 10을 할당
		System.out.println(a==10);	// a와 10이 isEqual?
		
	}

}
