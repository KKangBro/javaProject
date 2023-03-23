package com.shinhan.day11;

import java.util.*;
import java.util.Map.Entry;

public class Review {
	public static void main(String[] args) {
		f2();
	}

	private static void f2() {
		List<Integer> data1 = new ArrayList<>();
		Set<Integer> data2 = new HashSet<>();
		Map<String, Integer> data3 = new HashMap<>();
		data1.add(100);
		data1.add(232);
		data2.add(200);
		data2.add(417);
		data3.put("aa", 300);
		data3.put("jj", 808);

		System.out.println("--ArrayList--");
		System.out.println(data1.get(0));

		System.out.println("--HashSet--");
		for (Integer i : data2) {
			System.out.println(i);
		}
		// 내부반복자를 생성
		Iterator<Integer> it = data2.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// Map은 Key가 있으면 Value를 읽을 수 있다.
		System.out.println("--HashMap--");
		for (String key : data3.keySet()) {
			System.out.println(key + " : " + data3.get(key));
		}
		Set<Entry<String, Integer>> entrys = data3.entrySet();
		for (Entry<String, Integer> entry : entrys) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		Iterator<Entry<String, Integer>> it2 = entrys.iterator();
		while(it2.hasNext()) {
			Entry<String, Integer> entry = it2.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	}

	private static void f1() {
		// Collection: List(순서O, 중복O), Set(순서X, 중복X)
		// Map(순서X, 중복X)
		// List 구현class: ArrayList, LinkedList, Vector
		// Set 구현class: HashSet(중복 체크: equals(), hashcode() ), TreeSet(data 추가시 순서
		// 정해짐..크기비교(compareTo()))
		// Map 구현class: HashMap, TreeMap, Properties
		// Map은 키와 값의 쌍 Entry(Key, Value). Key는 Set이다.
	}
}
