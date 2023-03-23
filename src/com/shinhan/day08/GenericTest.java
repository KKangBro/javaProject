package com.shinhan.day08;

import java.util.ArrayList;

import com.shinhan.day08.ch12_lab.Money;

public class GenericTest {

	public static void main(String[] args) {
//		HappyBox<String> box1 = boxing("해피박스kind");
//		HappyBox<Integer> box2 = boxing(500);
//		HappyBox<Money> box3 = boxing(new Money(200));
//		System.out.println(box1);
//		System.out.println(box2);
//		System.out.println(box3);

		method2();
	}
	
	// 제네렉타입 제한(extend, super, ?)
	private static <T> void genericExtendsMethod4(HappyBox<? super Number> box) {
		System.out.println("genericExtendsMethod..");
		System.out.println("? super Number : Number의 자신과 상위만 가능");
		System.out.println(box);
	}
	
	private static <T> void genericExtendsMethod3(HappyBox<? extends Number> box) {
		System.out.println("genericExtendsMethod..");
		System.out.println("? extends Number : Number의 자식만 가능");
		System.out.println(box);
	}
	
	private static <T> void genericExtendsMethod2(HappyBox<?> box) {
		System.out.println("genericExtendsMethod..");
		System.out.println("? 는 제한이 없다");
		System.out.println(box);
	}

	private static void method3() {
		genericExtendsMethod(new ChildA());
		genericExtendsMethod(new ChildB());
//		genericExtendsMethod(new Money(100));
		
		genericExtendsMethod2(new HappyBox<String>("사과", 0));
		genericExtendsMethod3(new HappyBox<Integer>(222, 0));
		genericExtendsMethod4(new HappyBox<Number>(333, 0));
	}

	private static <T extends Parent> void genericExtendsMethod(T param) {
		System.out.println("genericExtendsMethod..");
	}

	private static void method2() {
		int a = 10;
		int b = 10;
		System.out.println(compare(a, b));
		
		String s1 = new String("자바");
		String s2 = new String("자바");
//		System.out.println(compare(s1, s2));
	}

	// 타입에 제한걸기 : extends Number는 Number를 상속받은 하위class만 가능의 의미
	public static <T extends Number> Boolean compare(T a, T b) {
		if (a.equals(b))
			return true;
		else
			return false;
	}

//	private static <T, A, B> int boxing2(T kind, A a, B b) {
//
//		return null;
//	}

	// 제네릭 메서드
	private static <T> HappyBox<T> boxing(T kind) {
		return new HappyBox<T>(kind, 1000);
	}

	private static void f5() {
		Product<String, Integer> p1 = new Product<>("책", 1000);
		Product<String, Integer> p2 = new Product<>("책", 2000);
		System.out.println(p1);
		System.out.println(p1.equals(p2));

	}

	private static void f4() {
		ArrayList<Money> data = new ArrayList<>();
		data.add(new Money(1));
		data.add(new Money(10));
		data.add(new Money(17));
		data.add(new Money(88));
		for (Money s : data) {
			System.out.println(s);
		}
	}

	private static void f3() {
		ArrayList<String> data = new ArrayList<>();
		data.add("월");
		data.add("목");
		data.add("토");
		data.add("월");
		for (String s : data) {
			System.out.println(s);
		}
	}

	private static void f2() {
		// 제네릭스 사용. 강력한 타입 체크.
		HappyBox<String> b1 = new HappyBox<>("바나나", 100);
		HappyBox<String> b2 = new HappyBox<>("컴퓨터", 100);
		HappyBox<String> b3 = new HappyBox<>("책", 100);

		String s1 = b1.kind;
		String s2 = b2.kind;
		String s3 = b3.kind;

		HappyBox<Money> b4 = new HappyBox<>(new Money(10), 100);
		HappyBox<Money> b5 = new HappyBox<>(new Money(20), 100);
		HappyBox<Money> b6 = new HappyBox<>(new Money(20), 100);

		Money m1 = b4.kind;
		Money m2 = b5.kind;
		Money m3 = b6.kind;

		System.out.println(m1);
		System.out.println(m2.equals(m3));
	}

	private static void f1() {
		// 제네릭스 사용하지 않은 예제
		Box b1 = new Box("바나나", 100);
		Box b2 = new Box(50, 100);
		Box b3 = new Box(new Money(300), 100);

		String s1 = (String) b1.kind;
		int s2 = (int) b2.kind;
		Money m = (Money) b3.kind;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(m);
	}

}
