package com.shinhan.day02;

import java.util.Scanner;

public class Ch04LAB1 {

	public static void main(String[] args) {
//		method4('$', 3, false);
//		method4('#', 5, true);
		method5();
	}

	public static void method5() {
		// 입력 받은 수 만큼 ‘*’로 직각 역삼각형을 출력하는 프로그램을 작성하십시오.
		Scanner sc = new Scanner(System.in);
		System.out.print("직각 역삼각형을 출력할 줄 수: ");
		int num = sc.nextInt();
		String str = "";
		for (int i = 0; i < num; i++) {
			str += "*";
		}

		for (int i = num; i > 0; i--) {
			System.out.println(str.substring(0, i));
		}
		sc.close();
	}

	private static void method4(char cell, int size, boolean isRect) {
//		cell 문자와 size 값을 이용하여 특정 모양을 출력한다.
//		isRect 값이 true 이면 사각형 모양을 출력하고, false 이면 삼각형을 출력한다. 
//		● hokeyGraphics(‘*’, 3, true)
//		***
//		***
//		***
//		● hokeyGraphics(‘&’, 3, false)
//		&
//		&&
//		&&&
		String str = "";
		for (int i = 0; i < size; i++) {
			str += cell;
		}

		for (int i = 1; i <= size; i++) {
			if (isRect) {
				System.out.println(str.substring(0, i));
			} else {
				System.out.println(str);
			}
		}

	}

	public static void method3() {
//		a. 입력 받은 숫자가 홀수인 경우에는, 0 부터 입력 값까지 홀수의 합을 출력합니다.
//		- 예제 : 입력이 7 이면 16을 출력 ( 1 + 3 + 5 + 7 = 16 ) 
//		b. 입력 받은 숫자가 짝수인 경우에는, 0 부터 입력 값까지 짝수의 합을 출력합니다.
//		- 예제 : 입력이 10 이면 30을 출력 ( 2 + 4 + 6 + 8 + 10 = 30 )
		// 숫자를 입력하세요. : 7
		// 결과 값 : 16

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요. : ");
		int input = sc.nextInt();
		int result = 0;
		while (input > 0) {
			result += input;
			input -= 2;
		}
		System.out.println("결과 값 : " + result);
	}

	public static void method2() {
		// 입력 받은 문자열을 한 글자씩 증가시키며 출력하는 프로그램입니다. (단, 대문자로 출력해야 합니다.)
		// 문자열을 입력하세요. : Bat Man
		String inputStr = "";
		String str = "";
		Scanner sc = new Scanner(System.in);

		System.out.print("문자열을 입력하세요. : ");
		inputStr = sc.nextLine();

		for (int i = 0; i < inputStr.length(); i++) {
			str += inputStr.charAt(i);
			System.out.println(str.toUpperCase());
		}

		// substring을 사용하는 방법도 있음.
	}

	public static void method1() {
//		초기값을 정수로 입력하세요. : 1
//		마지막 값을 정수로 입력하세요. : 10
//		증가분을 정수로 입력하세요. : 1
//		총합은 55 입니다.

		int start, end, jump, sum = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("초기값을 정수로 입력하세요. : ");
		start = sc.nextInt();

		System.out.print("마지막 값을 정수로 입력하세요. : ");
		end = sc.nextInt();

		System.out.print("증가분을 정수로 입력하세요. : ");
		jump = sc.nextInt();

		for (int i = start; i <= end; i += jump) {
			sum += i;
		}

		System.out.println("총합은 " + (sum > 1000 ? sum + 2000 : sum) + " 입니다.");
		sc.close();
	}

}
