package com.shinhan.day02;

import java.util.Scanner;

public class 김경윤 {

	public static void main(String[] args) {
		method4_7();
	}

	private static void method4_7() {
		int total = 0;
		int menu;

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("-------------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("-------------------------------------");
			System.out.print("선택> ");
			menu = Integer.parseInt(sc.nextLine());

			switch (menu) {
			case 1:
				System.out.print("예금액> ");
				total += Integer.parseInt(sc.nextLine());
				break;
			case 2:
				System.out.print("출금액> ");
				total -= Integer.parseInt(sc.nextLine());
				break;
			case 3:
				System.out.print("잔고> ");
				System.out.println(total);
				break;
			case 4:
				System.out.println("프로그램을 종료합니다..");
//				return;
				System.exit(0);
			}
		}
	}

	private static void method4_6() {
//		String str = "*****";
//		for (int i = 1; i <= 5; i++) {
//			System.out.println(str.substring(0, i));
//		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void method4_5() {
		for (int x = 1; x < 10; x++) {
			for (int y = 1; y < 10; y++) {
				if (x * 4 + y * 5 == 60) {
					System.out.printf("(%d, %d)", x, y);
				}
			}
		}
	}

	private static void method4_4() {
		while (true) {
			int num1 = (int) (Math.random() * 6) + 1;
			int num2 = (int) (Math.random() * 6) + 1;
			System.out.println(num1 + ", " + num2);
			if (num1 + num2 == 5)
				break;
		}
	}

	private static void method4_3() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0)
				sum += i;
		}
		System.out.println(sum);
	}

	private static void method4_2() {
		// 교재 p.122 참고
		String grade = "B";

		int score1 = switch (grade) {
		case "A" -> 100;
		case "B" -> {
			int result = 100 - 20;
			yield result;
		}
		default -> 60;
		};
	}

	private static void method4_1() {
		// 2번
	}

	private static void method3_7() {
		double x = 5.0;
		double y = 0.0;
		double z = 5 % y;
		if (Double.isNaN(z)) {
			System.out.println("0.0으로 나눌 수 없습니다.");
		} else {
			double result = z + 10;
			System.out.println("결과: " + result);
		}

	}

	private static void method3_6() {
		int x = 10;
		int y = 5;

		System.out.println((x > 7) && (y <= 5));
		System.out.println((x % 3 == 2) || (y % 2 != 1));
	}

	private static void method3_5() {
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
//		double area = (lengthTop + lengthBottom) * height / 2.0;
		double area = (lengthTop + lengthBottom) * height * 1.0 / 2;
		System.out.println(area);
	}

	private static void method3_4() {
		int v = 356;
		System.out.println(v / 100 * 100);
	}

	private static void method3_3() {
		int pencils = 534;
		int students = 30;

		// 학생 한명이 가지는 연필 수
		int pencilsPerStudent = pencils / students;
		System.out.println(pencilsPerStudent);

		// 남은 연필 수
		int pencilsLeft = pencils % students;
		System.out.println(pencilsLeft);
	}

	private static void method3_2() {
		int score = 85;
		String result = !(score > 90) ? "가" : "나";
		System.out.println(result);
	}

	private static void method3_1() {
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		System.out.println(z);
//		System.out.println(x);
//		System.out.println(y);
	}

}
