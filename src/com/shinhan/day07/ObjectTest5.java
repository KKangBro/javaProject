package com.shinhan.day07;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ObjectTest5 {

	public static void main(String[] args) throws Exception {
		f7();
	}

	private static void f7() throws IOException {
		InputStream is = ObjectTest5.class.getResourceAsStream("CellPhone.class");
		int i;
		while ((i = is.read()) != -1) {
			System.out.print((char) i);
		}
		is.close();

		URL url = ObjectTest5.class.getResource("googlelogo.png");
		System.out.println("\n" + url.getPath());
	}

	private static void f6() throws Exception {
		FileReader fr = new FileReader("./src/com/shinhan/day07/CellPhone.java");
		int i;
		while ((i = fr.read()) != -1) {
			System.out.print((char) i);
		}
		fr.close();
	}

	private static void f5() throws Exception {
		Class cls = CellPhone.class;
		Class cls2 = Class.forName("com.shinhan.day07.CellPhone");
		CellPhone phone = new CellPhone("AA");
		Class cls3 = phone.getClass();

		// 생성자
		Constructor[] constructors = cls.getDeclaredConstructors();
		for (Constructor con : constructors) {
			System.out.println(con.getModifiers());
		}

		// 필드
		Field[] fs = cls.getDeclaredFields();
		for (Field f : fs) {
			System.out.print(f.getType().getSimpleName() + " : "
					+ "");
			System.out.println(f.getName());
			System.out.println("---");
		}

		// 메서드
		Method[] ms = cls.getDeclaredMethods();
		for (Method m : ms) {
			System.out.println(m.getName());
			System.out.println(m.getParameterCount() + "개 파라메터");
			System.out.println("리턴타입: " + m.getReturnType());
		}

	}

	private static void f4() {
		String p1 = "([A-Za-z0-9]+)@(\\w+)\\.(com|net{1})";
		String data = "연락처1: kky417@kakao.com연락처2: aaa@gmail.com 연락처3: aaa@daum.net";
		Pattern pattern = Pattern.compile(p1);
		Matcher matcher = pattern.matcher(data);
		while (matcher.find()) {
			System.out.println(matcher.group());
			System.out.println(matcher.group(1));
			System.out.println(matcher.group(2));
			System.out.println("----");

		}
	}

	private static void f3() {
		String p1 = "010-([1-9]{3,4})-\\d{4}";
		String data = "010-123-5678 이곳으로 연락바람 010-9876-5432 혹은 010-8888-7777";
		Pattern pattern = Pattern.compile(p1);
		Matcher matcher = pattern.matcher(data);
		while (matcher.find()) {
			System.out.println(matcher.group());
			System.out.println(matcher.group(1));
		}
	}

	private static void f2() {
		String p1 = "[A-Za-z0-9]+@\\w+\\.(com|net){1}";
		String data = "kky417@kakao.com";
		System.out.println(Pattern.matches(p1, data) ? "OK" : "NO");
	}

	private static void f1() {
		String p1 = "010-[1-9]{3,4}-\\d{4}";
		String data = "010-123-5678";
		System.out.println(Pattern.matches(p1, data) ? "OK" : "NO");
	}

}
