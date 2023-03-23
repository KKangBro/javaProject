package com.shinhan.day03;

// JavaBeans기술 규격서.. field는 private(정보은닉)
public class Computer {
	private String model;
	private String os;
	private int price;
	static int count = 0; // 변수: instance변수, static변수(class변수, object공유변수)

	// 생성자 Overloading: 생성자 이름은 같고 매개변수 사양이 다르다.
	// 하나의 생성자가 다른 모양의 생성자를 호출할 수 있다.
	public Computer() {
		this("AA모델", "Mac", 500);
	}

	public Computer(String model) {
		this(model, "Mac", 500);
	}

	public Computer(String os, int price) {
		this(null, os, price);
	}

	public Computer(String model, String os, int price) {
		System.out.println("!! arg3 생성자로 생성 !!");
		this.model = model;
		this.os = os;
		this.price = price;
		count++;
	}

	// 일반 메서드
	public void computerInfoPrint() {
		System.out.println("*******************");
		System.out.println("model:\t" + model);
		System.out.println("os:\t" + os);
		System.out.println("price:\t" + price);
	}

	public String getModel() {
		return model;
	}

	public String getOs() {
		return os;
	}

	public int getPrice() {
		return price;
	}
}
