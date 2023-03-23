package com.shinhan.day04;

// class: Object를 만들기위한 틀(설계도)
// Object: class를 이용해서 만들어진 실체(instance)
public class Calculator {
	// 1. Field(특징, 속성, 변수): static(class변수), non-static(instance변수)
	private String color;
	private int price;
	private String model;
	static String company = "신한"; // static. 공유 변수.

	// 2. 생성자(new할때 자동으로 실행되는 메서드)..컴파일시 자동으로 default생성자가 제공됨.
	// 생성자의 목적은 초기화.
	// 생성자를 정의하면 default생성자가 제공X.
	// this: 이 클래스를 이용해서 만든 현재객체
	// 1. 매개변수이름과 멤버변수이름이 충돌(구분이 필요하다)
	// 2. 하나의 생성자가 다른 생성자를 호출할때 사용
	// 생성자 Overloading : 이름은 같고 매개변수사양이 다르다.
	public Calculator(String color) {
		this(null, color, 0);
	}

	public Calculator(String model, String color) {
		this(model, color, 1000);
	}

	public Calculator(String model, String color, int price) {
		this.color = color;
		this.price = price;
		this.model = model;
	}

	// 3. 일반 메서드(method)...기능(동사) : static, non-static
	// void: return 값이 없다.
	// static 메서드에서는 this 사용불가, instance생성없이 사용되는 메서드이므로 instance변수 사용 불가

	// private로 정보은닉되어있는 멤버변수들을 읽기하는 기능만들기 getter
	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}

	public int getPrice() {
		return price;
	}

	// private로 정보은닉되어있는 멤버변수들을 수정하는 기능만들기 setter
	public void setModel(String model) {
		this.model = model;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static void powerOn() {
		System.out.printf("%s 회사의 계산기 전원을 켠다.\n", company);
	}

	public void powerOff() {
		System.out.printf("%s, %s 모델의 계산기 전원을 끈다.\n", color, model);
	}

	public int add(int a, int b) {
		return a + b;
	}

	public int sub(int a, int b) {
		return a - b;
	}

	// 4. block (instance block, static block)
	{
		// instance block
		System.out.println("instance생성시마다 수행된다.\n-------------------------");
	}
	static {
		// static block
		System.out.println("1 class load시에 1회 수행된다.\n*************************");
	}
	static {
		// static block
		System.out.println("2 class load시에 1회 수행된다.\n*************************");
	}

	// 5. inner class
	class AA {

	}

}
