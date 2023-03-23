package com.shinhan.day08.ch13_prac;

public class N04_Util {

//	public static <K, V> V getValue(Pair<K, V> pair, String key) {
//		if (pair.getKey().equals(key)) {
//			return pair.getValue();
//		} else {
//			return null;
//		}
//	}

	public static <P extends Pair<K, V>, K, V> V getValue(P pair, String key) {
		if (pair.getKey().equals(key)) {
			return pair.getValue();
		} else {
			return null;
		}
	}
}
