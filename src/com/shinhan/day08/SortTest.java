package com.shinhan.day08;

import java.util.Arrays;
import java.util.Comparator;

import com.shinhan.day08.ch12_lab.Money;

public class SortTest {

	public static void main(String[] args) {
//		f4();
//		f3();
//		f3();
		f1();
	}

	private static void f4() {
		Car[] arr = { new Car("M", 10000), new Car("G", 5000), new Car("W", 5000), new Car("L", 8000),
				new Car("B", 40000) };
		System.out.println("before: " + Arrays.toString(arr));

		Arrays.sort(arr); // Comparable 인터페이스를 구현하지 않으면 비교불가
		System.out.println("가격asc 모델desc after: " + Arrays.toString(arr));

		Arrays.sort(arr, new Comparator<Car>() {

			@Override
			public int compare(Car c1, Car c2) {
				if (c2.price != c1.price)
					return c2.price - c1.price;
				else
					return c1.model.compareTo(c2.model);
			}

		});
		System.out.println("가격desc 모델asc after: " + Arrays.toString(arr));
	}

	private static void f3() {
		Money[] arr = { new Money(10), new Money(30), new Money(20), new Money(8), new Money(2) };
		System.out.println("before: " + Arrays.toString(arr));

		Arrays.sort(arr); // Comparable 인터페이스를 구현하지 않으면 비교불가
		System.out.println("after: " + Arrays.toString(arr));

		// Comparable 인터페이스를 익명 구현
		Arrays.sort(arr, new Comparator<Money>() { 

			@Override
			public int compare(Money o1, Money o2) {
				return o2.compareTo(o1);
			}

		});
		System.out.println("after: " + Arrays.toString(arr));
	}

	private static void f2() {
		String[] arr = { "Spring", "java", "JSP", "Servlet", "HTML", "CSS", "React" };
		System.out.println("before: " + Arrays.toString(arr));

		Arrays.sort(arr);
		System.out.println("after: " + Arrays.toString(arr));

		Arrays.sort(arr, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		System.out.println("after: " + Arrays.toString(arr));
	}

	private static void f1() {
		Integer[] arr = { 100, 30, 80, 20, 99 };
		System.out.println("before: " + Arrays.toString(arr));

		Arrays.sort(arr);
		System.out.println("asc after: " + Arrays.toString(arr));

		Arrays.sort(arr, new DecendingInt());
		System.out.println("desc after: " + Arrays.toString(arr));
		
		Integer[] arr2 = { 100, 30, 80, 20, 99 };
		Arrays.sort(arr2, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
			
		});
		System.out.println("desc2 after: " + Arrays.toString(arr2));
		
	}

}
