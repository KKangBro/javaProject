package com.shinhan.day03;

import java.util.Arrays;
import java.util.Scanner;

public class Ch05_Prac {

	public static void main(String[] args) {
		method5_9();
	}

	private static void method5_9() {
		int[] scores = new int[3];

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------------------------------------");
			System.out.print("선택> ");
			int menu = Integer.parseInt(sc.nextLine());

			switch (menu) {
			case 1:
				System.out.println(scores.length);
				break;
			case 2:
				System.out.print("scores[0]> ");
				scores[0] = Integer.parseInt(sc.nextLine());
				System.out.print("scores[1]> ");
				scores[1] = Integer.parseInt(sc.nextLine());
				System.out.print("scores[2]> ");
				scores[2] = Integer.parseInt(sc.nextLine());
				break;
			case 3:
				System.out.printf("scores[0]: %d\nscores[1]: %d\nscores[2]: %d\n", scores[0], scores[1], scores[2]);
				break;
			case 4:
				int max = 0;
				double sum = 0;
				for (int i : scores) {
					max = i > max ? i : max;
					sum += i;
				}
				System.out.printf("최고 점수: %d\n평균 점수: %.1f\n", max, sum / scores.length);
				break;
			case 5:
				System.out.println("프로그램을 종료합니다..");
				System.exit(0);
			}
		}

	}

	private static void method5_8() {
		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };

		int cnt = 0, sum = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
				cnt++;
			}
		}
		System.out.println("합: " + sum);
		System.out.println("평균: " + sum / (cnt * 1.0));
	}

	private static void method5_7() {
		int[] array = { 1, 5, 3, 8, 2 };

//		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		System.out.println(array[array.length - 1]);
	}

	private static void method5_6() {
		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };

		System.out.println(array.length);
		System.out.println(array[2].length);
	}

	// 5_5: 3번
	// 5_4: 2번
	// 5_3: 2번
	// 5_2: 3번
	// 5_1: 4번
}
