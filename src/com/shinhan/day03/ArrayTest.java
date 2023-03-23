package com.shinhan.day03;

import java.util.Arrays;

// cmd >> java com/shinhan/day03/ArrayTest 100 200
// 파일 우클릭 >> Run Configurations..
// 명령행 매개변수
public class ArrayTest {

	public static void main(String[] args) {
		System.out.println(args.length);

		if (args.length < 2) {
			// main 빠지기
//			return;
			// 프로그램종료
			System.exit(0);	// 0: 정상 종료. -1: 비정상 종료
		}
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println("더하기: " + (a + b));
	}

	private static void f6() {
		int[] arr1 = new int[] { 100, 90, 50, 88 };
		int[] arr2 = new int[10];
		int[] arr3 = new int[10];
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		System.arraycopy(arr1, 0, arr3, 4, arr1.length);

		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
	}

	private static void f5() {
		// 선언+생성..자동 초기화
		int[] arr = new int[5];
		// 선언+생성+초기화(길이는 반드시 생략)
		int[] arr2 = new int[] { 100, 90, 88, 100 };
		int[] arr3 = { 100, 90, 88, 100 }; // new int[] 생략 가능
		int[] arr4;
		arr4 = new int[] { 100, 90, 88, 100 }; // new int[] 생략 불가

		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));

		// 2차원배열 선언+생성+초기화
		int[][] arr5 = { { 1, 2, 3, 4 }, { 5, 6, 7 } }; // new int[][] 생략 가능
		for (int i = 0; i < arr5.length; i++) {
			System.out.println(Arrays.toString(arr5[i]));
		}

		int[][] arr6;
		arr6 = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7 } }; // new int[][] 생략 불가
		for (int[] array : arr6) {
			System.out.println(Arrays.toString(array));
		}
	}

	private static void f4() {
		int[] arr2[];
		arr2 = new int[3][];
		arr2[0] = new int[3];
		arr2[1] = new int[4];
		arr2[2] = new int[2];

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void f3() {
		// 2차원 배열: 배열의 배열
		// 1. 배열 변수 선언
		int[][] arr1;
		int[] arr2[];
		int arr3[][];

		// 2. 배열 생성...배열 길이가 필수
		arr1 = new int[3][4];
		arr2 = new int[3][];
		arr3 = new int[3][];
		// 3. 배열 사용
		System.out.println(arr1[0][0]);
		System.out.println(arr2[0]);

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.printf("%d행 %d열 = %d\n", i, j, arr1[i][j]);
			}
		}

		for (int[] array : arr1) {
			for (int num : array) {
				System.out.print(num + "  ");
			}
			System.out.println();
		}
	}

	private static void f2() {
		// 1. 배열 변수 선언
		int[] scores;
		// 2. 배열 생성...배열의 개수는 필수. 생성시 자동 초기화됨.
		// 정수: 0, 실수: 0.0, boolean: false, 객체: null
		scores = new int[26];
		// 3. 배열 사용
		scores[0] = 100;
		scores[1] = 90;
		scores[2] = 80;
		int total = 0;
		System.out.println(scores.length);

		// 일반 for문
		for (int i = 0; i < scores.length; i++) {
			System.out.println("scores[" + i + "]: " + scores[i]);
			total += scores[i];
		}
		System.out.println("총점은 " + total);

		total = 0;
		// 향상for, 확장for
		for (int score : scores) {
			total += score;
		}
		System.out.println("총점은 " + total);
	}

	private static void f1() {
		// 배열: 하나의 이름으로 같은 타입의 연속공간을 만드는 자료구조. Heap에 만들어짐.
		// 1. 배열 변수 선언
		int[] arr1 = null; // == int arr1[];
		double[] arr3;
		boolean[] arr4;
		String[] arr5;

		// 2. 배열 생성...배열의 개수는 필수. 생성시 자동 초기화됨.
		// 정수: 0, 실수: 0.0, boolean: false, 객체: null
		arr1 = new int[5];
		arr3 = new double[6];
		arr4 = new boolean[6];
		arr5 = new String[6];

		// 3. 배열 사용
		System.out.println(arr1[0]);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		System.out.println(Arrays.toString(arr5));
	}

}
