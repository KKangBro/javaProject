package com.shinhan.day04;

// Servlet: Java(주인공) + HTML, 서버에서 수행되는 자바프로그램
// JSP: HTML(주인공) + Java, 실행하면 JSP -> Servlet
// Servlet은 싱글톤으로 동작한다. new를 1회만한다.
public class MyServlet {

	private static MyServlet my;

	private MyServlet() {
		System.out.println("MyServlet이 생성됨.");
	}

	public static MyServlet getInstance() {
		if (my == null) {
			my = new MyServlet();
		}
		return my;
	}
	public void print() {
		System.out.println("싱글톤연습1");
	}

}
