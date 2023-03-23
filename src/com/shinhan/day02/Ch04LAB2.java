package com.shinhan.day02;

import java.util.Scanner;

public class Ch04LAB2 {

	public static void main(String[] args) {
		method8();
	}

	private static void method8() {
		// 두 숫자의 최대 공약수를 구하는 프로그램
//		2, 5	: 1
//		5, 15	: 5
//		250, 30	: 10
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(", ");
		int num1 = Integer.parseInt(input[0]);
		int num2 = Integer.parseInt(input[1]);

		int min = num1 < num2 ? num1 : num2;
		int gcd = 1;

		for (int i = min; i >= 1; i--) {
			if (num1 % i == 0 && num2 % i == 0) {
				gcd = i;
				break;
			}
		}
		System.out.println(gcd);
	}

	private static void method7_numDay() {
		Scanner sc = new Scanner(System.in);
		System.out.print("월 입력 : ");
		int month = sc.nextInt();
		int days = 0;
		switch (month) {
		case 4, 6, 9, 11:
			days = 31;
			break;
		case 1, 3, 5, 7, 8, 10, 12:
			days = 30;
			break;
		case 2:
			days = 28;
			break;
		}

		System.out.println(days == 0 ? month + "월은 존재하지 않습니다. 다시 입력하세요." : days);
	}

	private static void method6() {
		// 윤년 체크
//		1)	4의 배수인 해는 윤년.
//		2)	4의 배수이면서 100의 배수인 해는 윤년이 아님.
//		3)	100의 배수이면서 400의 배수인 해는 윤년.
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.print(input + "년의 2월 말일은 ");
		boolean isLeapYear = false;

		if (input % 4 == 0)
			isLeapYear = true;
		if (input % 4 == 0 && input % 100 == 0)
			isLeapYear = false;
		if (input % 100 == 0 && input % 400 == 0)
			isLeapYear = true;

		System.out.println(isLeapYear ? "29일 입니다." : "28일 입니다.");
	}

	private static void method5() {
//		수열 규칙  :  1부터 시작해서 두 항의 차이가 1씩 증가
//		• 예  시  :  1 + 2 + 4 + 7 + 11 + 16 + 22 + …………
//		위의 수열에서 15번째 항까지의 합을 구하는 프로그램을 작성하십시오
		System.out.print("15번째까지의 합 : ");

		int sum = 0;
		int next = 1;
		int jump = 0;
		for (int i = 0; i < 15; i++) {
			next += jump;
			jump++;
			sum += next;
		}

		System.out.println(sum);
	}

	private static void method4() {
		// 1부터 1,000까지의 수 중에서 입력 받은 정수의 배수의 개수와 배수들의 합을 계산하십시오
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수를 입력하세요 : ");
		int input = sc.nextInt();
		int cnt = 1000 / input;
		System.out.println("7의 배수 개수 = " + cnt);

		int sum = 0;
		for (int i = 1; i <= cnt; i++) {
			sum += input * i;
		}
		System.out.println("7의 배수 합 = " + sum);
	}

	private static void method3() {
		// 팩토리얼
		Scanner sc = new Scanner(System.in);
		System.out.print("1보다 크고 10보다 작은 정수를 입력하세요. : ");
		int input = sc.nextInt();
		if (input < 2 || input > 9) {
			System.out.println("잘못된 숫자가 입력되었습니다.");
		} else {
			for (int i = 1; i <= input; i++) {
				int rst = 1;
				for (int j = 1; j <= i; j++) {
					rst *= j;
				}
				System.out.println(i + "! = " + rst);
			}
		}

	}

	private static void method2() {
		// 소수인지 판별
		Scanner sc = new Scanner(System.in);
		System.out.print("2 ~ 100사이의 정수를 입력하세요. : ");
		int input = sc.nextInt();
		boolean isPrime = true;

		for (int i = 2; i <= input - 1; i++) {
			if (input % i == 0) {
				isPrime = false;
				break;
			}
		}

		System.out.println(input + "는(은) " + (isPrime ? "소수입니다." : "소수가 아닙니다."));
	}

	private static void method1() {
		// 입력받은 숫자의 구구단 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("1보다 크고 10보다 작은 정수를 입력하세요. : ");
		int input = sc.nextInt();
		if (input < 2 || input > 9) {
			System.out.println("잘못된 숫자가 입력되었습니다.");
		} else {
			for (int i = 1; i <= 9; i++) {
				System.out.println(input + " * " + i + " = " + input * i); // 3 * 1 = 3.. 3 * 2 = 6..
			}
		}

	}

}
