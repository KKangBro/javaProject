package com.shinhan.day08.ch13_prac;

public class N03_ContainerExample {

	private static <K, V> N03_Container<K, V> makeContainer(K key, V value) {
		N03_Container<K, V> con = new N03_Container<K, V>();
		con.set(key, value);
		return con;
	}

	public static void main(String[] args) {
		N03_Container<String, String> container1 = new N03_Container<>();
		container1.set("홍길동", "도적");
		String name1 = container1.getKey();
		String job1 = container1.getValue();

		N03_Container<String, Integer> container2 = new N03_Container<>();
		container2.set("홍길동", 35);
		String name2 = container2.getKey();
		int age2 = container2.getValue();

		System.out.println(name1 + " " + job1);
		System.out.println(name2 + " " + age2);

		N03_Container<String, Integer> container3 = makeContainer("홍홍홍", 17);
		String name3 = container3.getKey();
		int age3 = container3.getValue();

		System.out.println(name3 + " " + age3);
	}

}
