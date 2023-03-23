package com.shinhan.day02;

import java.io.*;
import java.util.Scanner;
// java.lang 패키지에 있는 class는 import 없이 사용한다.

public class ScannerTest {

	public static void main(String[] args) throws IOException {
		f2();
	}

	private static void f2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수>> ");
		int score = sc.nextInt();
		System.out.print("이름>> ");
		String name = sc.next();
		System.out.print("메모>> ");
		sc.nextLine();
		String memo = sc.nextLine();
		System.out.println(name + " ==> " + score + " || " + memo);
		
		sc.close();
	}

	private static void f1() throws IOException {
		// 사용자 입력 받기
		System.out.println("f1 function");
		
		System.out.print("정수를 입력하시오>> ");
		InputStream is = System.in;
		
//		int i = is.read();
//		System.out.println((char)i);
		
		int i;
		while ((i = is.read()) != 13) {
			System.out.print((char)i);
		}
	}

}
