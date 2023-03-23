package com.shinhan.day07.ch12_prac;

import java.util.regex.Pattern;

public class N17_PatternMatcherExample {

	public static void main(String[] args) {
		String id = "5Angel1004";
		id = "Qw1d03wdw0eq";
		String regExp = "[a-zA-z]{1}\\w{7,11}";
		boolean isMatch = Pattern.matches(regExp, id);
		
		if(isMatch) {
			System.out.println("ID로 사용할 수 있습니다.");
		} else {
			System.out.println("ID로 사용할 수 없습니다.");
		}
	}

}
