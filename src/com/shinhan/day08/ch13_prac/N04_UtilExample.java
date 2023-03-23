package com.shinhan.day08.ch13_prac;

public class N04_UtilExample {

	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair<>("홍길동", 35);
		Integer age = N04_Util.getValue(pair, "홍길동");
		System.out.println(age);

		ChildPair<String, Integer> childPair = new ChildPair<>("홍삼원", 35);
		Integer childAge = N04_Util.getValue(childPair, "홍삼순");
		System.out.println(childAge);

		// OtherPair는 Pair를 상속하지 않으므로 컴파일 에러가 발생
//		OtherPair<String, Integer> otherPair = new OtherPair<>("홍길동", 35);
//		Integer otherAge = Util.getValue(otherPair, "홍길동");
//		System.out.println(otherAge);
	}

}

class Pair<K, V> {
	private K key;
	private V value;

	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}
}

class ChildPair<K, V> extends Pair<K, V> {
	public ChildPair(K k, V v) {
		super(k, v);
	}
}

class OtherPair<K, V> {
	private K key;
	private V value;

	public OtherPair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}
}