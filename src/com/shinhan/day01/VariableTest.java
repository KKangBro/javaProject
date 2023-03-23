package com.shinhan.day01;

// class = 변수들 + 함수들
// VariableTest.java -> 컴파일 -> VariableTest.class
// 실행
// 1. JVM이 VariableTest class Loader에 의해 Load (static이 method영역에 올라간다)
// 2. 검증
// 3. main 시작

public class VariableTest {
	int score;	// 인스턴스 변수. new해서 생성해야 만들어짐.
	public static void main(String[] args) {	// 
		
		// 1. 변수 선언
		int a;	// 지역 변수
//		System.out.println(a);	// ERROR. 초기화하지 않으면 사용불가
//		System.out.println(score);	// ERROR. static이 non-static 사용불가
		
		// 2. 변수 사용
		a = 10;	// 할당
		System.out.println(a);	// 읽기
		System.out.println(a+20);	// 읽기
		
		// 3. 변수 선언+사용
		int a2 = 30;
		System.out.println(a2);	// 읽기

	}

}
