package com.shinhan.day03;

public class Ch04LAB4_01_Converter {

	public static void main(String[] args) {
		System.out.println("문자열에 특정문자 변경하는 테스트");
		System.out.println("-------------Sample 1 --------------");
		String str1 = myReplace("hello world", 'l', '*');
		System.out.println(str1);

		System.out.println("-------------Sample 2 --------------");
		String str2 = myReplace("hello world", ' ', '-');
		System.out.println(str2);

		System.out.println("-------------Sample 3 --------------");
		String str3 = myReplace("hello world", 'a', '*');
		System.out.println(str3);

	}
	
	// 함수: 여러 문장의 묶음
	// 함수 생성 이유: 반복 코드없이 함수로 만들어서 재사용한다. 모듈화.
	private static String myReplace(String string, char oldChar, char newChar) {
		// String 클래스의 replace, replaceAll 메서드와 StringTokenizer 클래스는 사용하지 말아야 합니다.
		String output = "";
		for (int i = 0; i < string.length(); i++) {
			char target = string.charAt(i);
			if (target != oldChar) {
				output += target;
			} else {
				output += newChar;
			}
		}
		
		return output;
	}

}
