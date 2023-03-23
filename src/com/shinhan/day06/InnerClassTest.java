package com.shinhan.day06;

public class InnerClassTest {
	public static void main(String[] args) {
		f2();
	}

	private static void f4() {
		// Local class test
		OuterClass outer = new OuterClass();
		outer.f1();
		
	}

	private static void f3() {
		OuterClass.StaticInnerClass v1;
		v1 = new OuterClass.StaticInnerClass();
		System.out.println(v1.s1);
		System.out.println(OuterClass.StaticInnerClass.s2);
		v1.method3();
		OuterClass.StaticInnerClass.method4();
	}

	private static void f2() {
		// 2. instance inner class 사용
		OuterClass outer = new OuterClass();
		OuterClass.InstanceInnerClass v1 = outer.new InstanceInnerClass();
		System.out.println("OuterClass instance field: " + outer.a);
		System.out.println("InstanceInnerClass instance field: " + v1.s1);
		System.out.println("InstanceInnerClass static field: " + OuterClass.InstanceInnerClass.s2);
		
		v1.method3();
		OuterClass.InstanceInnerClass.method4();
	}
	
	private static void f1() {
		// 1. 일반적인 class 사용
		OuterClass v1 = new OuterClass();
		System.out.println("instance field: " + v1.a);
		System.out.println("static field: " + OuterClass.b);
		
		v1.method1();
		OuterClass.method2();
	}
}
