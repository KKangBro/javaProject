package com.shinhan.day11;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.shinhan.day05.Account;

public class StreamTest {

	public static void main(String[] args) {
		f6();
	}
	
	private static void f6() {
		Account[] arr = {
				new Account("111", "카바니"),
				new Account("222", "음라파"),
				new Account("333", "루카쿠"),
				new Account("444", "루까꿍"),
				new Account("555", "루쿠쿠"),
				new Account("666", "윌프레드 보니"),
				new Account("777", "음바페"),
				new Account("888", "비닐신")
		};
		List<Account> list = Arrays.asList(arr);
		list.parallelStream().forEach(acc -> {
			System.out.println(acc);
			System.out.println(Thread.currentThread().getName());
			System.out.println("-----------------");
		});
		
	}

	private static void f5() {
		Set<Account> set = new HashSet<>();
		set.add(new Account("111", "카바니"));
		set.add(new Account("222", "음라파"));
		set.add(new Account("333", "루카쿠"));
		set.stream().forEach(acc -> System.out.println(acc));
		set.forEach(acc -> System.out.println(acc));
	}

	private static void f4() {
		Account[] arr = {
				new Account("111", "카바니"),
				new Account("222", "음라파"),
				new Account("333", "루카쿠")
		};
		List<Account> list = Arrays.asList(arr);
		list.stream().forEach(acc -> System.out.println(acc));
		list.forEach(acc -> System.out.println(acc));
	}

	private static void f3() {
		Account[] arr = {
				new Account("111", "카바니"),
				new Account("222", "음라파"),
				new Account("333", "루카쿠")
		};
		Arrays.stream(arr).forEach(acc -> System.out.println(acc));
	}

	private static void f2() {
		// 배열
		String[] arr = { "자바", "웹", "front", "back", "framework" };
		// 1. 내부반복자를 이용하고자한다면 먼저 stream을 얻는다.
		Stream<String> st = Arrays.stream(arr);
		Consumer<String> consumerF = (s) -> {
			System.out.println(s + "~~~");
		};
		// 2. 내부반복자로 값을 처리한다.
		st.forEach(consumerF);

		Arrays.stream(arr).forEach(s -> System.out.println(s + "!!!"));

	}

	private static void f1() {
		// 1. 배열
		int[] arr = new int[] { 100, 30, 70, 20, 50 };
		Arrays.stream(arr).forEach(a -> System.out.println(a));

		// original stream
		IntStream is = Arrays.stream(arr);
		IntConsumer func1 = (a) -> {
			System.out.println("a: " + a);
		};
		is.forEach(func1);
	}

}
