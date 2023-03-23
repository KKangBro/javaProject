package com.shinhan.day04;

public class PlayBird {

	public static void main(String[] args) {
		Duck duck = new Duck("꽥꽥이", 2, 15);
		duck.fly();
		duck.sing();
		System.out.println(duck);
		System.out.println(duck.toString());

		Sparrow sparrow = new Sparrow("짹짹", 2, 10);
		sparrow.fly();
		sparrow.sing();
		System.out.println(sparrow.toString());
	}
}

// 자바의 최상위 class : Object (toString, equals, ...)
class Duck {
	String name;
	int legs;
	int length;

	public Duck(String name, int legs, int length) {
		this.name = name;
		this.legs = legs;
		this.length = length;
	}

	public void fly() {
		System.out.printf("오리(%s)는 날지 않습니다.\n", name);
	}

	public void sing() {
		System.out.printf("오리(%s)가 소리 내어 웁니다.\n", name);
	}

	public void setName(String name) {
		this.name = name;
	}

	// Override(덮어쓰기, 재정의) : 이미 가지고 있는 기능을 재정의한다.
	// 이름, 매개변수, return type 모두 같아야 한다.
	// 단, 접근제한자는 같거나 넓어져야 한다. public > protected > (default) > private
	public String toString() {
//		System.out.printf("오리의 이름은 %s 입니다. 다리는 %d개이고 길이는 %d입니다.\n", name, legs, length);
		return "오리의 이름은 " + name + " 입니다. 다리는 " + legs + "개이고 길이는 " + length + "입니다.";
	}
}

class Sparrow {
	String name;
	int legs;
	int length;

	public Sparrow(String name, int legs, int length) {
		this.name = name;
		this.legs = legs;
		this.length = length;
	}

	public void fly() {
		System.out.printf("참새(%s)는 날아다닙니다.\n", name);
	}

	public void sing() {
		System.out.printf("참새(%s)가 소리 내어 웁니다.\n", name);
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Sparrow(참새) [name=" + name + ", legs=" + legs + ", length=" + length + "]";
	}
}