package com.shinhan.day05;

import com.shinhan.day04.Phone;

// 다른 패키지 연습
public class ModifierTest extends Phone {
	void method() {
		System.out.println(model);
		f2();
	}

	public static void main(String[] args) {
		Phone p = new Phone();
		p.model = "갤럭시23";
		System.out.println(p);
		
		p.f1();
	}

}
