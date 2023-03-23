package com.shinhan.day07.ch12_prac;

public class N10_StringBuilderExample {
	
	public static void main(String[] args) {
		
		// String에 +=는 좋지 않음
//		String str = "";
//		for (int i = 1; i <= 100; i++) {
//			str += i;
//		}
//		System.out.println(str);
		
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= 100; i++) {
			sb.append(i);
		}
		System.out.println(sb);
	}

}
