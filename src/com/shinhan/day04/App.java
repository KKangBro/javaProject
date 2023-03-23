package com.shinhan.day04;

public class App {

	public static void main(String[] args) {
//		App aa = new App(); // 객체를 만들던지, 메서드에 static을 붙이던지
		sum(1, 2);
		sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		sum(1, 2, 3, 4, 5);
		sum(1, 2, 3);
		sum(1.5, 2.5);
	}

	// 메서드 Overloading : 메서드이름은 같고 매개변수 사양이 다르다.
	// 파라메터 자동형변환된다.
	static void sum(int... a) { // int[] arr와 같다.
		int total = 0;
		for (int num : a) {
			total += num;
		}
		if (total == 0)
			return; // return: 함수중단하고 호출한곳으로 돌아간다.
		System.out.println("가변길이 매개변수: " + total);
	}

	static void sum(int a, int b) {
		System.out.println("합계int2: " + (a + b));
	}

	static void sum(double a, double b) {
		System.out.println("합계double2: " + (a + b));
	}

	static void sum(int a, int b, int c) {
		System.out.println("합계3: " + (a + b + c));
	}

	private static void f1() {
		Calculator[] arr = new Calculator[4];

		Calculator.powerOn();
		arr[0] = new Calculator("red");
		arr[0].setModel("A모델");
		arr[1] = new Calculator("black");
		arr[2] = new Calculator("B모델", "blue");
		arr[3] = new Calculator("C모델", "green", 2000);

		for (Calculator cc : arr) {
			print(cc);
		}
	}

	private static void print(Calculator cal) {
		System.out.println(cal.getModel());
		System.out.println(cal.getColor());
		System.out.println(cal.getPrice());
		Calculator.powerOn();
		cal.powerOff();
		System.out.println(cal.add(1, 2));
		System.out.println(cal.sub(1, 2));
	}

}
