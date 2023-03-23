package com.shinhan.day07;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Properties;
import java.util.Set;

// 명령행 매개변수 > java ObjectTest3 100 200
public class ObjectTest3 {

	public static void main(String[] args) throws IOException {
		f5();
//		f3(args);
		System.out.println("main end~");
	}

	private static void f5() {
		String os = System.getProperty("os.name");
		System.out.println(os);

		Properties ps = System.getProperties();
		Set<Object> keys = ps.keySet();
		for (Object k : keys) {
			System.out.println(k + " : " + System.getProperty((String) k));
		}
	}

	private static void f4() {
//		long startTime = System.currentTimeMillis();
		long startTime = System.nanoTime();
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
		}
//		long endTime = System.currentTimeMillis();
		long endTime = System.nanoTime();
		System.out.println("걸린시간: " + (endTime - startTime));
	}

	private static void f3(String[] arr) {
		if (arr.length == 0) {
			// 1. 함수 빠지기
			System.out.println("명령행 매개변수가 없다");
//			return;
			// 2. 프로그램 당장 종료
			System.exit(0); // 정상 종료는 0
		}
		System.out.println("매개변수: " + Arrays.toString(arr));
	}

	private static void f2() throws IOException {
		// 3. in: 표준 입력(default : 키보드)

		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		int i;
		while ((i = isr.read()) != 13) {
			System.out.print((char) i);
		}
		System.out.println();
	}

	private static void f1() {
		// System class
		// 1. out: 표준 출력(모니터 출력)
		// 2. err: 에러 출력
		PrintStream ps = System.out;
		ps.print(false);
		ps.printf("%10d", 100);
		ps.printf("%-10d", 200);
		ps.println("자바");
		ps.println("---");
	}

}
