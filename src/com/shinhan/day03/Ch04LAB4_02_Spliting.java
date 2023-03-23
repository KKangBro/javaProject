package com.shinhan.day03;

public class Ch04LAB4_02_Spliting {

	public static void main(String[] args) {
		Ch04LAB4_02_Spliting p = new Ch04LAB4_02_Spliting();

		String addr = "서울시,강남구,역삼동,삼성SDS멀티캠퍼스";
		String[] addrArr = p.split(addr, ',');

		System.out.println("배열 크기 : " + addrArr.length);
		for (int i = 0; i < addrArr.length; i++) {
			System.out.print(addrArr[i] + " ");
		}
	}

	public String[] split(String str, char separator) {
		// String 클래스의 split() 메소드를 사용하지 말고 직접 구현해야 합니다.
		int cnt = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == separator) cnt++;
		}

		String[] output = new String[cnt + 1];
		String temp = "";
		int j = 0;
		for (int i = 0; i < str.length(); i++) {
			char target = str.charAt(i);
			if (target == separator) {
				output[j] = temp;
				temp = "";
				j++;
			} else if (i == str.length() - 1) {
				output[j] = temp + target;
			} else {
				temp += target;
			}
		}
		return output;
	}

}
