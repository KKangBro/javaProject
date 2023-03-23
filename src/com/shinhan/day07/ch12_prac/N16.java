package com.shinhan.day07.ch12_prac;

import java.text.SimpleDateFormat;
import java.util.Date;

public class N16 {

	public static void main(String[] args) {
		Date now = new Date();
		StringBuilder sb = new StringBuilder();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 ");
		sb.append(sdf.format(now));
		
		sdf = new SimpleDateFormat("u");
		String str = null;
		switch (Integer.parseInt(sdf.format(now))) {
		case 1:
			str = "월요일";
		case 2:
			str = "화요일";
		case 3:
			str = "수요일";
		case 4:
			str = "목요일";
		case 5:
			str = "금요일";
		case 6:
			str = "토요일";
		case 7:
			str = "일요일";
		}
		sb.append(str);
		
		sdf = new SimpleDateFormat(" HH시 mm분");
		sb.append(sdf.format(now));
		
		System.out.println(sb);
	}

}
