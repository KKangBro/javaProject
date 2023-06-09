package com.shinhan.day04;

public class BookExample {

	public static void main(String[] args) {
		System.out.println("책 생성 전: "+BookVO.count);
		
		BookVO[] b = new BookVO[5];
		b[0] = new BookVO("Java Program", 30000);
		b[1] = new BookVO("JSP Program", 25000);
		b[2] = new BookVO("SQL Fundamentals", 20000);
		b[3] = new BookVO("JDBC Program", 32000);
		b[4] = new BookVO("EJB Program", 25000);

		System.out.println("책 생성 후: "+BookVO.count);
		
		// *** final은 수정 불가.
//		b[0].isbn = "111";
//		b[0].isbn2 = "111";
//		b[0].publisher = "AA";
//		BookVO.publisher = "AA";
		
		System.out.println(b[0].isbn);
		System.out.println(b[0].isbn2);
		System.out.println(b[0].PUBLISHER);
		System.out.println(BookVO.PUBLISHER);
	}

}
