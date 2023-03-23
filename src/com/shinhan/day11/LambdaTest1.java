package com.shinhan.day11;

public class LambdaTest1 {

	public static void main(String[] args) {
		f5();
	}

	private static void f5() {
		Calculable2 f1 = (a, b) -> a + b;
		Calculable2 f2 = new Calculable2() {
			@Override
			public int calculate(int x, int y) {
				return x + y;
			}
		};

		int rst1 = f1.calculate(10, 20);
		int rst2 = f2.calculate(10, 20);
		System.out.println(rst1 + ", " + rst2);
		
		
		Calculable2 f3 = (a, b) -> {
			System.out.println("여러문장은 {} 필요");
			System.out.println("그리고 반드시 return 쓴다.");
			return a + b;
		}; 
		int rst3 = f3.calculate(10, 20);
		System.out.println(rst3);
	}

	private static void f4() {
		Person person = new Person();

		person.action1(new Workable() {
			@Override
			public void work(String name, String job) {
				System.out.println("이름은 " + name + ", " + job + "을 합니다.");
			}
		});

		person.action1((name, job) -> System.out.println("이름은 " + name + ", " + job + "을 합니다."));

		person.action1((name, job) -> {
			System.out.println("무야호~!");
			System.out.println("이름은 " + name + ", " + job + "을 합니다.");
		});

		Workable f = (name, job) -> {
			System.out.println("무야호~!");
			System.out.println("이름은 " + name + ", " + job + "을 합니다.");
		};
		person.action1(f);

//		person.action2(new Speakable() {
//			@Override
//			public void speak(String content) {
//				System.out.println(content + " 라고 하네요~");
//			}
//		});

//		person.action2(str -> System.out.println(str + " 라고 하네요~"));

		Speakable f2 = s -> s + "~!@";
		person.action2(f2);
	}

	public static void work(Runnable r) {
		Thread t1 = new Thread(r);
		t1.start();
	}

	private static void f3() {
//		Runnable r = () -> System.out.println("run");
//		Thread t1 = new Thread(r);

//		Thread t1 = new Thread(() -> System.out.println("run"));
//		t1.start();

		work(() -> {
			System.out.println("--LAMBDA--runA--");
		});
		work(() -> {
			System.out.println("--LAMBDA--runB--");
		});
		work(() -> {
			System.out.println("--LAMBDA--runC--");
		});
		work(() -> {
			System.out.println("--LAMBDA--runD--");
		});
		work(() -> {
			System.out.println("--LAMBDA--runE--");
		});

	}

	private static void action(Calculable func) {
		func.calculate(10, 20);
	}

	private static void f2() {
		// 2. 익명구현class 이용
//		(new Calculable() {
//			@Override
//			public void calculate(int x, int y) {
//				System.out.println("더하기: " + (x + y));
//			}
//		}).calculate(4, 17);

//		action(new Calculable() {
//			@Override
//			public void calculate(int x, int y) {
//				System.out.println("더하기: " + (x + y));
//			}
//		});

		Calculable f = new Calculable() {
			@Override
			public void calculate(int x, int y) {
				System.out.println("--익명구현class 이용--");
				System.out.println("더하기: " + (x + y));
			}
		};
		Calculable f2 = new Calculable() {
			@Override
			public void calculate(int x, int y) {
				System.out.println("--익명구현class 이용--");
				System.out.println("빼기: " + (x - y));
			}
		};
		Calculable f3 = (a, b) -> {
			System.out.println("--람다표현식 이용--");
			System.out.println("곱하기: " + (a * b));
		};
		action(f);
		action(f2);
		action(f3);
	}

	private static void f1() {
		// 1. 구현class 이용
		MyInterface a = new MyClassImplement();
		a.print();

		// 2. 익명구현class 이용
		(new MyInterface() {
			@Override
			public void print() {
				System.out.println("익명구현class에서 구현합니다..");
			}
		}).print();

		MyInterface b = new MyInterface() {
			@Override
			public void print() {
				System.out.println("익명구현class에서 구현합니다..");
			}
		};
		b.print();

		// 3. 람다식 이용..JS(=>): 화살표함수
		MyInterface c = () -> System.out.println("람다식 이용합니다..");
		c.print();
	}

}
