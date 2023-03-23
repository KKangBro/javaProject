package com.shinhan.day11;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.shinhan.day05.Account;

public class LambdaTest3 {

	public static void main(String[] args) {
		f8();
	}

	private static void f8() {
		BiFunction<String, String, Account> func2 = (no, owner) -> {
			System.out.println("계좌번호: " + no);
			System.out.println("예금주: " + owner);
			return new Account(no, owner);
		};
		System.out.println(func2.apply("111", "깡바니"));

		BiFunction<String, String, Account> func3 = Account::new;
		System.out.println(func3.apply("222", "김민재"));

	}

	private static void f7() {
//		BiFunction<Integer, Integer, Integer> func1 = (a, b) -> Math.max(a, b);
		BiFunction<Integer, Integer, Integer> func1 = Math::max;
		System.out.println("큰 값은 " + func1.apply(10, 20));
	}

	private static void f6() {
		BiFunction<Integer, Integer, Integer> func1 = (a, b) -> {
			if (a > b)
				return a;
			return b;
		};
		System.out.println("큰 값은 " + func1.apply(10, 20));
	}

	private static void f5() {
		Predicate<Integer> func1 = (a) -> a > 10;
		System.out.println(func1.test(20));

		Predicate<Account> func2 = (a) -> {
			System.out.println("---Account 잔고 조사하기---");
			System.out.println(a);
			return a.getBalance() >= 100;
		};
		System.out.println(func2.test(new Account("111", "카바니", 3000)));
	}

	private static void f4() {
		BinaryOperator<Integer> func1 = (t, u) -> t + u;
		BinaryOperator<Integer> func2 = (t, u) -> t - u;
		System.out.println(func1.apply(10, 20));
		System.out.println(func2.apply(10, 20));
	}

	private static void f3() {
		// 매개값이 있고 return도 있는 경우
		Function<String, Account> func1 = (a) -> new Account("111", a, 1000);
		BiFunction<String, String, Account> func2 = (no, owner) -> {
			System.out.println("계좌번호: " + no);
			System.out.println("예금주: " + owner);
			return new Account(no, owner, 1000);
		};

		Account acc1 = func1.apply("음라파");
		Account acc2 = func2.apply("222", "루카쿠");

		System.out.println(acc1);
		System.out.println(acc2);

	}

	// 생산자 Supplier
	private static void f2() {
		Supplier<String> a = () -> "자바";
		Supplier<String> b = () -> {
			System.out.println("--------");
			return "자바2";
		};
		String ret1 = a.get();
		String ret2 = b.get();
		System.out.println(ret1);
		System.out.println(ret2);

		Supplier<Account> c = () -> new Account();
		System.out.println(c.get());
	}

	// 소비자 Consumer
	private static void f1() {
		Consumer<Integer> f = (a) -> System.out.println(a + 200);
		Consumer<String> f2 = (a) -> System.out.println(a + 200);
		Consumer<Account> f4 = (a) -> {
			System.out.println(a);
			a.deposit(1000);
			int rst = a.withdraw(100);
			System.out.println(rst + " 출금완료");
			System.out.println(a);
		};

		f.accept(100);
		f2.accept("100");
		f4.accept(new Account("111", "홍", 2000));

		BiConsumer<String, Integer> f3 = (a, b) -> {
			System.out.println("a: " + a);
			System.out.println("b: " + b);
		};
		f3.accept("자바시험", 100);

	}

}
