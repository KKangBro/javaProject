package com.shinhan.day08.ch13_prac;

public class N02_ContainerExample {

	public static void main(String[] args) {
		N02_Container<String> container1 = new N02_Container<>();
		container1.set("홍길동");
		String str1 = container1.get();

		N02_Container<Integer> container2 = new N02_Container<>();
		container2.set(6);
		int value2 = container2.get();

//		System.out.println(str1);
//		System.out.println(value2);

		N02_Container<Integer> container3 = makeContainer01(6);
		int value3 = container3.get();
		
		System.out.println(value3);
	}

	private static <T> N02_Container<T> makeContainer01(T data) {
		N02_Container<T> con = new N02_Container<T>();
		con.set(data);
		return con;
	}

}
