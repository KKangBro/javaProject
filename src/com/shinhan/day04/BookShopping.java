package com.shinhan.day04;

public class BookShopping {
	public static void main(String[] args) {
		BookVO[] b = new BookVO[5];
		b[0] = new BookVO("Java Program", 30000);
		b[1] = new BookVO("JSP Program", 25000);
		b[2] = new BookVO("SQL Fundamentals", 20000);
		b[3] = new BookVO("JDBC Program", 32000);
		b[4] = new BookVO("EJB Program", 25000);

		BookService bm = new BookService(b);
		bm.printBookList();
		bm.printTotalPrice();
	}
}

// Book에는 업무로직은 없다
// VO(Value Object) : data를 저장하는 가방이다.
// DTO(Data Transfer Object) : data를 저장해서 전송하려는 목적
// JavaBeans기술에서 사용한다.
// 멤버변수는 private로 설정, 멤버메서드는 public으로 설정
// JspServlet, Spring, MyBatis framework에서 사용된다.

// final : 변수(값 수정불가), 메서드(Override 불가), 클래스(상속 불가)
class BookVO {
	// instance 변수
	private String title;
	private int price;
	// class 변수
	static int count = 0;
	// final : 수정불가, instance 변수. 선언시 또는 생성시 초기화해야함.
	final String isbn = "12345";
	final String isbn2;
	// static final : 수정불가, 상수, class 변수. 선언시 초기화해야함. 관례상 모두 대문자로 표기
	static final String PUBLISHER = "한빛";

	public BookVO(String title, int price) {
		this.title = title;
		this.price = price;
		isbn2 = title + "67890";
		count++;
		System.out.println(this.toString());
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "day04.BookVO [title=" + title + ", price=" + price + "]";
	}

}

// Service : Business logic 구현
class BookService {
	BookVO[] booklist;

	public BookService(BookVO[] booklist) {
		this.booklist = booklist;
	}

	public void printBookList() {
		System.out.println("=== 책 목록 ===");
		for (BookVO book : booklist) {
//			System.out.println(book.getTitle());
			System.out.println(book);
		}
		System.out.println();
	}

	public void printTotalPrice() {
		int total = 0;
		for (BookVO book : booklist) {
			total += book.getPrice();
		}
		System.out.printf("전체 책 가격의 합 : %d\n", total);
	}

}
