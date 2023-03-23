package com.shinhan.day08.ch12_lab;

public class Prob1 {

	public static void main(String[] args) {
		String str = "everyday we have is one more than we deserve";
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'x') {
				sb.append('a');
			} else if (str.charAt(i) == 'y') {
				sb.append('b');
			} else if (str.charAt(i) == 'z') {
				sb.append('c');
			} else if (str.charAt(i) == ' ') {
				sb.append(' ');
			} else {
				sb.append((char) (str.charAt(i) + 3));
			}
		}
		System.out.println(sb.toString());
	}

}
