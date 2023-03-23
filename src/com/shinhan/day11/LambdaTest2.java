package com.shinhan.day11;

public class LambdaTest2 {

	public static void main(String[] args) {
		new LambdaTest2().f2(100);
	}

	String subject = "\t무야호~!";

	private void f2(int su1) { // 파라메터는 지역변수
		int su2 = 200; // 지역변수
//		su1++; // 불가
//		su2++; // 불가

		// 2. 람다 이용
		Calculable2 f = (x, y) -> {
			System.out.println("람다표현식" + subject);
//			su1++; // 불가
//			su2++; // 불가
			return x + y + su1 + su2;
		};
		int rst = f.calculate(1, 2);
		System.out.println(rst);
	}

	private static void f1(int su1) { // 파라메터는 지역변수
		int su2 = 200; // 지역변수
		int su3 = 300;
		su3++;

		// 내부 클래스에서 지역 변수를 사용한다면 final의 특성을 갖는다(수정불가)
//		su1++; // 불가
//		su2++; // 불가

		// 1. 익명 구현 class
		Calculable2 f = new Calculable2() {
			@Override
			public int calculate(int x, int y) {
//				su1++; // 불가
//				su2++; // 불가
				System.out.println("--익명구현객체--");
				return x + y + su1 + su2;
			}
		};
		int rst = f.calculate(1, 2);
		System.out.println(rst);
	}

}
