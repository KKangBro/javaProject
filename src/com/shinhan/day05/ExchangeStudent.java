package com.shinhan.day05;

import java.util.Arrays;

public class ExchangeStudent extends Student {
	String[] language;

	public ExchangeStudent(String stdId, String name, String[] language) {
		super(stdId, name); // 1. 부모에서 default생성자를 정의하면 해결됨. 2. 명시적으로 부모생성자를 호출하면 해결됨.
//		this.getStdId(stdId);
//		this.name = name;
		this.language = language;
	}

	void display() {
		System.out.println(getClass().getSimpleName() + "에서 추가된 메서드");
	}

//	@Override
//	public String toString() {
//		String str = super.toString();
//		return str + "ExchangeStudent [language=" + Arrays.toString(language) + "]";
//	}
	
	@Override
	public String toString() {
		return "ExchangeStudent [language=" + Arrays.toString(language) + ", name=" + name + ", major=" + major
				+ ", score=" + score + ", schoolName=" + schoolName + "]";
	}
	
}
