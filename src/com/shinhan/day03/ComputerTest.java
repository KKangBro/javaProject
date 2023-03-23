package com.shinhan.day03;

public class ComputerTest {

	public static void main(String[] args) {
		f1();
	}

	private static void f1() {
		Computer com1 = new Computer();
		Computer com2 = new Computer("SAMSUNG1234");
		Computer com3 = new Computer("window", 100);
		Computer com4 = new Computer("LG5678", "window", 100);

		com4.computerInfoPrint();
		display(com1);
		display(com2);
		display(com3);
		display(com4);

		System.out.println("생성된 컴퓨터 개수: " + Computer.count);

	}

	private static void display(Computer com) {
		System.out.println("===========================");
		System.out.println(com.getModel());
		com.computerInfoPrint();
	}

}
