package com.shinhan.day08.ch13_prac;

public class N03_Container<K, V> {
	private K key;
	private V value;

	public void set(K key, V value) {
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
