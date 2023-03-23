package com.shinhan.day02;

public class 반복문 {

	public static void main(String[] args) {
		forTest4();
	}

	private static void forTest4() {
		// 1~10 합계
		int total = 0;
		for (int i=1; i<=10; i++) {
			if(i%2 != 0) continue;	// 참이면 아래는 실행하지않고 다음으로 진행
			
			total += i;
			
			System.out.print(i);
			System.out.print(i == 10 ? "" : " + ");
		}
		System.out.print(" = " + total);
	}

	private static void whileTest3() {
		// 1~10 출력
		int i = 100;
		do {
			System.out.print(i + " ");
			i++;
		} while (i <= 10);
		System.out.println("\nmethod end!\t" + i);

	}

	private static void whileTest2() {
		// 1~10 출력
		int i = 1;
		while (i <= 10) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println("\nmethod end!\t" + i);

	}

	private static void whileTest() {
		// 1~10 출력
		int i = 1;
		while (true) {
			if (i > 10)
				break;
			System.out.print(i + " ");
			i++;
		}
		System.out.println("\nmethod end!\t" + i);

	}

	private static void forTest2() {
		// 1~10 출력
		int i = 1;
		for (;;) {
			if (i > 10)
				break;
			System.out.print(i + " ");
			i++;
		}
		System.out.println("\nmethod end!\t" + i);

	}

	private static void forTest() {
		// 1~10 출력
		int i;
		for (i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nmethod end!\t" + i);
	}

}
