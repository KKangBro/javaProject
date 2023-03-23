package com.shinhan.day06;

public class OuterClass {
	// 1.field (instance field, static field)
	int a = 10;
	static int b = 20;

	// 2. 생성자..default제공
	// 3. 메서드 (instance method, static method)
	void method1() {
		System.out.println("OutterClass..instance method");
	}

	static void method2() {
		System.out.println("OutterClass..static method");
	}
	// 4. block (instance block {} , static block: static {} )
	// 5. inner class: 3가지, instance, class, local

	int score = 100;

	class InstanceInnerClass {
		int score = 200; // field
		String s1 = "InstanceInnerClass임";
		static String s2 = "InstanceInnerClass임";

		void method3() { // 매개변수도 지역변수
			int score = 300; // 지역변수: 함수 내의 변수
			System.out.println("InnerClass..instance method");
			System.out.println("외부의 instance field접근: " + a);
			System.out.println("외부의 static field접근: " + b);
			System.out.println("지역변수 score= " + score);
			System.out.println("멤버변수 this.score= " + this.score);
			System.out.println("OuterClass.this.score= " + OuterClass.this.score);
			System.out.println("--------------------");
		}

		static void method4() {
			System.out.println("InnerClass..static method");
//			System.out.println("외부의 instance field접근불가: " + a);
			System.out.println("외부의 static field접근: " + b);
			System.out.println("--------------------");
		}
	}

	static class StaticInnerClass {
		String s1 = "StaticInnerClass임";
		static String s2 = "StaticInnerClass임";

		void method3() {
			System.out.println("StaticInnerClass..instance method");
//			System.out.println("외부의 instance field접근불가: " + a);
			System.out.println("외부의 static field접근: " + b);
			System.out.println("--------------------");
		}

		static void method4() {
			System.out.println("StaticInnerClass..static method");
//			System.out.println("외부의 instance field접근불가: " + a);
			System.out.println("외부의 static field접근: " + b);
			System.out.println("--------------------");
		}
	}

	void f1() {
		// static에서 non-static 호출불가
		// LocalClass는 함수 내에 있는 class, static 불가
		// 지역변수는 내부class에서 사용하면 final특성을 가진다.
		int max = 100;
//		max++;
		class LocalClass {
			String s3 = "LocalClass임";
			static String s4 = "LocalClass static임";

			void method5() {
				System.out.println("LocalClass..instance method");
				System.out.println(s3);
				System.out.println(s4);
				System.out.println(a);
				System.out.println(b);
				System.out.println(max);
//				max = 200;
				System.out.println("-----");
			}

			static void method6() {
				System.out.println("LocalClass..static method");
//				System.out.println(s3);
				System.out.println(s4);
//				System.out.println(a);
				System.out.println(b);
				System.out.println("-----");
			}
		}
		LocalClass local = new LocalClass();
		System.out.println(local.s3);
		System.out.println(LocalClass.s4);
		local.method5();
		LocalClass.method6();
	}
}
