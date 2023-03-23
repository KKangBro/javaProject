package com.shinhan.day06;

import java.io.*;

// Exception(예외) : 프로그래머의 노력으로 프로그램이 중단되지 않고 계속 진행하도록 할 수 있다.
public class ExceptionTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		System.out.println("main start~");
		f6();
		System.out.println("main end~");
	}

	private static void f6() throws ClassNotFoundException {
		Class cls = Class.forName("com.shinhan.day06.Book");
		System.out.println(cls.getSimpleName());
	}

	private static void f5() throws IOException {
		// 일반 Exception : 컴파일시점에 반드시 해결해야한다.
		// 2. 떠넘긴다. : 이 함수를 호출한곳에 떠넘긴다.
		FileReader fr = new FileReader("./src/com/shinhan/day06/Book.java");
		int i;
		while ((i = fr.read()) != -1) {
			System.out.print((char) i);
		}
	}

	private static void f4() {
		// 일반 Exception : 컴파일시점에 반드시 해결해야한다.
		// 1. 내가한다

		// try(){} : try종료 후 자원 자동 반납된다.
		try (FileReader fr = new FileReader("./src/com/shinhan/day06/Book.java")) {
			System.out.println("파일존재..파일 열림");
			int i;
			while ((i = fr.read()) != -1) {
				System.out.print((char) i);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void f3() {
		// 일반 Exception : 컴파일시점에 반드시 해결해야한다.
		// 1. 내가한다 2. 떠넘긴다.
		FileReader fr = null;
		try {
			fr = new FileReader("./src/com/shinhan/day06/Book.java");
			System.out.println("파일존재..파일 열림");
			int i;
			while ((i = fr.read()) != -1) {
				System.out.print((char) i);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException | NullPointerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private static void f2() {
		// if로 조건체크해서 오류가 없는 코드를 수행하지 않고 try~catch로 처리한 이유: 업무로직, 오류처리로직을 분리
		try {
			int a = 10;
			int b = 0;
//			System.out.println(a / b);

			int[] arr = new int[5];
			System.out.println(arr[0]);
//			System.out.println(arr[5]);

			Object obj = new Object();
			System.out.println(obj.toString());
//			String s = (String) obj;
//			System.out.println(s.length());

			String su = "100점";
//			int total = Integer.parseInt(su) + 200;
//			System.out.println(total);

			String s2 = null;
			System.out.println(s2.length());

			System.out.println("오류있으면 여기는 안옴");
		} catch (ArithmeticException ex) {
//			ex.printStackTrace(); // 오류과정 출력
			System.out.println(ex.getMessage());
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex.getMessage());
		} catch (ClassCastException | NumberFormatException ex) {
			System.out.println(ex.getMessage());
		} catch (Exception ex) { // catch는 하위 먼저, 상위 나중에 작성한다
			System.out.println(ex.getMessage());
		} finally {
			System.out.println("이 부분은 반드시 처리한다...일반적으로 자원 반납 코드를 쓴다. dbDisconnect, fileClose");
		}

	}

	private static void f1() {
		// 실행 예외: 컴파일시에는 오류 없음. 실행시 오류
		// 기타 예외: 컴파일시에 반드시 처리해야한다.

		// 1. ArithmeticException
		int a = 10;
		int b = 0;
//		System.out.println(a / b);

		// 2. ArrayIndexOutOfBoundsException
		int[] arr = new int[5];
		System.out.println(arr[0]);
//		System.out.println(arr[5]);

		// 3. ClassCastException
		Object obj = new Object();
		System.out.println(obj.toString());
//		String s = (String)obj;
//		System.out.println(s.length());

		// 4. NumberFormatException
		String su = "100점";
		int total = Integer.parseInt(su) + 200;
		System.out.println(total);
	}

}
