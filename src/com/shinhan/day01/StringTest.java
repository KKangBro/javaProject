package com.shinhan.day01;

public class StringTest {

	public static void main(String[] args) {
		f8();
	}

	private static void f8() {
		int a = 10;
		float b = 20.12345f;
		System.out.print("a: "+a+", b: "+b);
		System.out.println("\n-----------");
		// %-5d : -는 왼쪽정렬, d : decimal
		// %3.1f : 전체자리수.소수아래자리수 float
		System.out.printf("a: %-5d, b: %5.1f", a, b);
	}

	private static void f7() {
		int a = 100;
		{
			int b = 200;
			System.out.println(a + b);
		}
//		System.out.println(a + b);		// ERROR. block을 벗어나면 block안의 지역변수는 사용불가
		
	}

	private static void f6() {
		// 자바기본타입 : data 저장, 연산, 비교
		// byte, short, char,		int,		long, float, double, boolean
		// Wrapper Class : 자바기본타입 + 기능(함수)
		// Byte, Short, Character,	Integer,	Long, Float, Double, Boolean 
		String score = "90";
		System.out.println(score + 10);		// 문자 + 숫자 = 문자
		System.out.println(Integer.parseInt(score) + 10);
		
		int i = 100;
		String str = String.valueOf(i);
		String str2 = i + "";			// 윗줄과 같음.
	}

	private static void f5() {
		byte v1 = 100;
		byte v2 = 100;
		// 사칙연산식에서 자동으로 int로 형 변환
		byte v3 = (byte) (v1 + v2);		
		int v4 = v1 + v2;
		System.out.println(v3);
		System.out.println(v4);
		
	}

	private static void f4() {
		// 강제 형 변환... 억지로... data 손실 가능성
		// 작은방 = (작은방 타입)큰값
		byte v1 = 9;
		int v3 = 100;
		v1 = (byte)v3;
		System.out.println(v1);
	}

	private static void f3() {
		// 자동 형 변환
		// 큰방 = 작은값. OK
		// byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)
		//			 char(2)
		// boolean(1)
		
		byte v1 = 127;
		short v2 = v1;
		System.out.println(v2);
		int v3 = v1;
		System.out.println(v3);
		
		long v4 = v1;
		float v5 = v1;
		double v6 = v1;
		System.out.println(v4);
		System.out.println(v5);
		System.out.println(v6);
		
		v3 = 10000;
		v4 = v3;
		v5 = v3;
		v6 = v3;
		System.out.println(v4);
		System.out.println(v5);
		System.out.println(v6);


	}

	private static void f2() {
		String str1 = "자바 '프로그램' 완성";
		String str2 = "자바 \"프로그램\" 완성";
		System.out.println(str1+"\n"+str2);
		
		String str3 = "{ \"name\":\"홍\" \\ \"age\":20 }";	// json= Key:Value. javascript형태의 문자열
		String str4 = """
				{ "name":"홍",\t"age":20 }
				""";
		System.out.println(str3+"\n"+str4);
		// Key:Value -> python= dictionary. java= map. javascript= JavascriptObject

	}

	private static void f1() {
		// java.base 모듈 > java.lang 패키지 String.class
		// String은 기본형이 아님.
		// String : 고정문자열
		String s1 = "자바";		// 컴파일 시점에 .class의 상수pool에 리터럴을 넣어둠.
		String s2 = "자바";		// s1와 s2의 주소가 같음. 둘이 같은 녀석을 가리킴.
		
		String s3 = new String("자바");		// 실행시에 만들어짐.
		String s4 = new String("자바");
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(s1 == s2);
		
		System.out.println("\n"+System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
		
		s1 = s1 + "프로그램";	// String + String 보다는
		s2 = s2 + "프로그램";	// StringBuffer써서 append하는 것이 모바일프로그래밍에서 좋은 습관.
		System.out.println("\n"+System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(s1 == s2);
		// dangling : 가비지콜렉터가 처리해줌.
		
	}

}
