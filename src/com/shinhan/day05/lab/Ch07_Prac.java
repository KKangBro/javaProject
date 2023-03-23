package com.shinhan.day05.lab;

public class Ch07_Prac {

	public static void main(String[] args) {
		method8();
	}

	public static class A {
		public void method1() {
			System.out.println("A-method1()");
		}
	}

	public static class B extends A {
		public void method1() {
			System.out.println("B-method1()");
		}
	}

	public static class C extends A {
		public void method1() {
			System.out.println("C-method1()");
		}

		public void method2() {
			System.out.println("C-method2()");
		}
	}

	public static void action(A a) {
		a.method1();
		if (a instanceof C c) {
			c.method2();
		}

	}

	private static void method12() {
		action(new A());
		action(new B());
		action(new C());
	}

	// 11
	public static class Activity {
		public void onCreate() {
			System.out.println("기본적인 실행 내용");
		}
	}

	public static class MainActivity extends Activity {
		@Override
		public void onCreate() {
			super.onCreate();
			System.out.println("추가적인 실행 내용");
		}
	}

	private static void method10() {
		// 추상클래스를 상속받으면 추상메서드를 반드시 구현해야함.
	}

	private static void method9() {
		// 2번
	}

	public static class Tire {
		public void run() {
			System.out.println("일반 타이어가 굴러갑니다.");
		}
	}

	public static class SnowTire extends Tire {
		@Override
		public void run() {
			System.out.println("스노우 타이어가 굴러갑니다.");
		}
	}

	private static void method8() {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;

		snowTire.run();
		tire.run();

	}

	public static class Parent {
		public String nation;

		public Parent() {
			this("대한민국");
			System.out.println("Parent() call");
		}

		public Parent(String nation) {
			this.nation = nation;
			System.out.println("Parent(String nation) call");
		}
	}

	public static class Child extends Parent {
		public String name;

		public Child() {
			this("홍길동");
			System.out.println("Child() call");
		}

		public Child(String name) {
			this.name = name;
			System.out.println("Child(String name) call");
		}
	}

	private static void method7() {
		Child child = new Child();
	}
	
	// 6
	public static class Parent6 {
		public String name;
		
//		public Parent6() {}	// 1. 부모 클래스에서 default 생성자를 만든다
		public Parent6(String name) {
			this.name = name;
		}
	}
	
	public static class Child6 extends Parent6 {
		public int studentNo;

		public Child6(String name, int studentNo) {
			super(name);
			// 자식 클래스에서 현재 부모 클래스의 생성자를 따라 super(name);하고 뒤에 생성자 마저 완성한다.
			this.studentNo = studentNo;
		}
	}
}
