package com.shinhan.day08.ch12_lab;

class MySum {
	int first;
	int second;

	MySum(int first, int second) {
		this.first = first;
		this.second = second;
	}

	/* 조건1 */
	// main 메소드에서 MySum 객체를 출력하면 객체 생성시에 전달한 두 정수의 덧셈 결과를 출력하도록
	// toString 메소드를 오버라이딩합니다.
	@Override
	public String toString() {
		return Integer.toString(first + second);
	}

	/* 조건2 */
	/* main 메소드에서 MySum 클래스의 equals 메소드 호출시 전달하는 매개변수가 MySum 객체를 참조하고 현재 객체의
	 * toString 메소드와 전달 객체의 toString 메소드 내용이 동일하면 true를 리턴하고 나머지 경우에는 false 를 리턴하도록
	 * equals 메소드를 오버라이딩합니다. */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MySum other = (MySum) obj;
		return this.toString().equals(other.toString());
	}
}

public class OverridingTest {

	public static void main(String args[]) {
		int i = 10;
		int j = 20;

		MySum ms1 = new MySum(i, j);
		MySum ms2 = new MySum(i, j);
		String s1 = new String("30");
		
		System.out.println(ms1);
		System.out.println(ms2);

		if (ms1.equals(ms2))
			System.out.println("ms1과 ms2의 합계는 동일합니다.");
		else
			System.out.println("ms1과 ms2의 합계는 동일하지 않습니다.");
		
		if (ms1.equals(s1))
			System.out.println("ms1과 s1의 값은 동일합니다.");
		else
			System.out.println("ms1과 s1의 값은 동일하지 않습니다.");
	}
}
