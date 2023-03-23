package com.shinhan.day04;

import java.util.Calendar;

public class SingletonTest {

	public static void main(String[] args) {
//		MyServlet a = new MyServlet(); // 생성자가 private라서 안됨.
		
		MyServlet a = MyServlet.getInstance();
		MyServlet b = MyServlet.getInstance();
		
		System.out.println(a+"=="+b);
		a.print();
		b.print();
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
	}

}
