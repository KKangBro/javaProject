package com.shinhan.day07;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

public class ObjectTest4 {

	public static void main(String[] args) throws Exception {
		f12();
	}

	private static void f15() {
		Date d1 = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd hh:mm:ss");
		System.out.println(d1);
		String rst = sdf.format(d1);
		System.out.println(rst);
	}

	private static void f14() {
		DecimalFormat df = new DecimalFormat("###,###");
//		DecimalFormat df = new DecimalFormat("000,000");
		long money = 1_000_000_000_000_000L;
		String result = df.format(money);
		System.out.println(result);
	}

	private static void f13() {
		Date d1 = new Date();
		System.out.println(d1);
		System.out.println(d1.getTime());

		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH) + 1);
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt.getYear());
		System.out.println(dt.getMonthValue());
		System.out.println(dt.getDayOfMonth());
		
	}

	private static void f12() {
		System.out.println(Math.max(10, 20));
		
		// round, ceil(올림), floor(버림)
		double c = 3.8;
		System.out.println(Math.round(c));
		System.out.println(Math.floor(c));
	}

	private static void f11() {
		Integer a = 10;
		Integer b = 10;
		System.out.println(a == b);
		System.out.println(a.intValue() == b.intValue());
	}

	private static void f10() {
		String s = "이것이자바다 12345 This is 6789 Java 55";
		StringBuilder sb = new StringBuilder();
		char[] arr = s.toCharArray();
		for (char c : arr) {
			if (Character.isDigit(c)) {
				sb.append(c);
			}
		}
		System.out.println(sb);
	}

	private static void f9() {
		String s = "이것이자바다 This is Java";
		System.out.println(s.substring(0, 1));
		System.out.println(s.charAt(0));

		char[] arr = s.toCharArray();
		for (char c : arr) {
			if (Character.isUpperCase(c)) {
				System.out.println(c + " 대문자구먼");
			} else {
				System.out.println(c + " ----------");
			}
		}
	}

	private static void f8() {
		String score = "100";
		int score2 = Integer.parseInt(score);
		System.out.println(score2 + 10);

		int su = 10;
		System.out.println(Integer.toBinaryString(su));
		System.out.println(Integer.bitCount(su)); // 2진수로 1의 갯수
	}

	private static void f7() {
		int a = 10; // 기본형(값저장, 연산, 비교)
		Integer b = 20; // 참조형(객체: 기본형+기능) auto boxing: new Integer(20);
		System.out.println(a + b + 200); // unboxing: b.intValue()

		float f = b.floatValue();

		System.out.println(Integer.MAX_VALUE);
		int su = Integer.compare(10, 5); // 빼기연산처럼 생각. > 1, = 0, < -1
		System.out.println(su);

		int[] arr = { 10, 90, 20, 70, 50 };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void f6() {
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		String[] arr1 = dt.toString().split("T");
		String[] arr2 = arr1[0].split("-");
		String[] arr3 = arr1[1].split(":");
		System.out.println(Arrays.toString(arr2) + "\n" + Arrays.toString(arr3));

		StringTokenizer st = new StringTokenizer(dt.toString(), "T-:");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

	private static void f5() {
		String fruits = "010-1234-5678 010-789-4561";
		StringTokenizer st = new StringTokenizer(fruits, "- ");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

	private static void f4() {
		String fruits = "사과,오렌지/키위 수박,참외";
		StringTokenizer st = new StringTokenizer(fruits, ",/ ");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

	private static void f3() {
		String fruits = "사과,오렌지/키위 수박,참외";
		String[] arr = fruits.split(",|/| ");
		System.out.println(Arrays.toString(arr));
	}

	private static void f2() {
		String s1 = "자바"; // 가장 일반적. String은 고정 문자열
		System.out.println(s1 + "프로그램");
		s1 = s1 + "프로그램"; // 메모리 낭비
		System.out.println(s1);

		StringBuilder sb = new StringBuilder("자바 StringBuilder");
		StringBuffer sf = new StringBuffer("자바 StringBuffer");
//		sb = sb + "aaa"; // 불가
		sb.append(" 프로그램");
		sf.append(" 프로그램");
		System.out.println(sb + "\n" + sf);

		sb.insert(2, "(JAVA)");
		sf.replace(0, 2, "Java");

		String s2 = new String(sb);
		String s3 = new String(sf);
		System.out.println(s2 + "\n" + s3);
	}

	private static void f1() throws Exception {
		String s1 = "자바"; // 리터럴을 이용. 가장 일반적
		String s2 = new String("자바");
		byte[] arr1 = new byte[] { 65, 66, 67, 97, 98, 99 };
		char[] arr2 = new char[] { 'A', 'B', 'C', 'a', 'b', 'c' };
		String s3 = new String(arr1);
		String s4 = new String(arr2);

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);

		String s5 = new String(arr1, "UTF-8");
		System.out.println(s5);
		System.out.println(s5.length());

		String s6 = "자바프로그램";
		byte[] arr3 = s6.getBytes("utf-8"); // 한글1자 -> 3byte
		byte[] arr4 = s6.getBytes("euc-kr"); // 한글1자 -> 2byte
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));

		String s7 = new String(arr3, "utf-8");
		String s8 = new String(arr4, "euc-kr");
		System.out.println(s7 + "\n" + s8);
	}

}
