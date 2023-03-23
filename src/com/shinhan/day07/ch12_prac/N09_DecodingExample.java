package com.shinhan.day07.ch12_prac;

import java.io.UnsupportedEncodingException;

public class N09_DecodingExample {

	public static void main(String[] args) throws UnsupportedEncodingException {
		byte[] bytes = { -20, -107, -120, -21, -123, -107 };
		String str = new String(bytes, "utf-8");
		System.out.println("str: " + str);
	}

}
