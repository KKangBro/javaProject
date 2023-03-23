package com.shinhan.day07.ch12_prac;

import java.util.Random;
import java.util.StringTokenizer;

public class N11 {

	public static void main(String[] args) {
		String input = "아이디,이름,패스워드";
		StringTokenizer st = new StringTokenizer(input, ",");
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
	}

}
