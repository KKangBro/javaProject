package com.shinhan.day05;

public class BookVO {
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
		return "day05.BookVO [title=" + title + ", price=" + price + "]";
	}

}