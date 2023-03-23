package com.shinhan.day10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.util.*;
import java.util.Map.Entry;

import com.shinhan.day04.Employee1;
import com.shinhan.day05.Account;

public class CollectionTest1 {

	public static void main(String[] args) throws Exception {
		f9();
	}

	private static void f9() throws IOException {
		Properties pro = new Properties();
		InputStream is = CollectionTest1.class.getResourceAsStream("oracleInfo.properties");
		pro.load(is);
//		InputStream fis = new FileInputStream("src/com/shinhan/day10/oracleInfo.properties");
//		pro.load(fis);
		String driver = pro.getProperty("driver");
		String name = pro.getProperty("myname");
		System.out.println(driver);
		System.out.println(name);

		System.out.println();
		for (Object key : pro.keySet()) {
			System.out.println(key + " : " + pro.getProperty((String) key));
		}

	}

	private static void f8() {
		// Key는 Set이다.
		// Set은 add시에 동등객체인지 확인. 동등하면 add불가
		// Map은 put()시에 key를 찾는다. 동등한것을 찾으면 값을 replace한다. 없으면 추가
		Map<Employee1, Account> data = new HashMap<>();
		data.put(new Employee1("용희", "대리", 1000), new Account("1234", "용희", 100));
		data.put(new Employee1("용희", "대리", 2000), new Account("5555", "용희", 500));
		data.put(new Employee1("용희2", "과장", 2000), new Account("1564", "용희", 200));
		data.put(new Employee1("용희3", "부장", 3000), new Account("8754", "용희", 300));
		data.put(new Employee1("용희4", "사장", 4000), new Account("6454", "용희", 400));

		System.out.println(data.size() + "개");
		for (Employee1 emp : data.keySet()) {
			System.out.println("key: " + emp);
			System.out.println(data.get(emp));
		}

		System.out.println("\nkey 찾기~~~~");
		System.out.println(data.containsKey(new Employee1("용희", "대리", 1000)));
		System.out.println(data.containsKey(new Employee1("용희", "대리3", 1000)));
		System.out.println(data.containsKey(new Employee1("용희", "대리", 2000)));
		System.out.println(data.containsKey(new Employee1("용희", "대리", 999999)));

		System.out.println("\nvalue 찾기~~~~");
		System.out.println(data.containsValue(new Account("1234", "용희", 100)));
		System.out.println(data.containsValue(new Account("5555", "용희", 500)));

	}

	private static void f7() {
		// Map : 키와 값의 쌍이다.(Entry), 키는 Set이므로 중복 불가
		// 구현 class → HashMap, HashTable
		Map<String, Integer> data = new HashMap<>();
		data.put("김", 100);
		data.put("이", 90);
		data.put("박", 95);
		data.put("최", 88);
		data.put("김", 180); // 키가 중복되면 마지막 값으로 덮어쓰기

		System.out.println(data.get("김"));

		// 일반 for 불가
		// 향상 for
		// entry는 1건을 의미, entrySet은 여러건을 의미
		int sum = 0;
		for (Entry<String, Integer> entry : data.entrySet()) {
			System.out.println(entry.getKey() + " => " + entry.getValue());
			sum += entry.getValue();
		}
		System.out.println("총점: " + sum);

		sum = 0;
		// keyset() : 키들을 의미
		for (String key : data.keySet()) {
			System.out.println(key + " => " + data.get(key));
			sum += data.get(key);
		}
		System.out.println("총점: " + sum);

		sum = 0;
		Iterator<String> it = data.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			System.out.println(key + " => " + data.get(key));
			sum += data.get(key);
		}
		System.out.println("총점: " + sum);

		System.out.println("키 찾기: " + data.containsKey("김"));
		System.out.println("키 찾기: " + data.containsKey("유"));

		System.out.println("값 찾기: " + data.containsValue(88));
		System.out.println("값 찾기: " + data.containsValue(150));

	}

	private static void f6() {
		// Set 인터페이스: 구현 class → HashSet, TreeSet
		// 순서X 중복X (단, Tree는 순서 있음)
		Set<Account> data = new HashSet<>();
		data.add(new Account("1234", "홍", 100));
		data.add(new Account("1234", "홍", 100));
		data.add(new Account("3456", "박", 300));
		data.add(new Account("3478", "김", 400));
		data.add(new Account("7654", "정", 600));

		System.out.println(data.size());

		// 일반 for 불가.. 순서가 없으므로 index 사용불가
		System.out.println("---향상 for---");
		for (Account acc : data) {
			System.out.println(acc);
		}
		System.out.println("---Iterator---");
		Iterator<Account> it = data.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// 원하는 객체 찾기
		if (data.contains(new Account("1234", "홍", 100)))
			System.out.println("FOUND");
		else
			System.out.println("NOT FOUND");
	}

	private static void f5() {
		// Set 인터페이스: 구현 class → HashSet, TreeSet
		// 순서X 중복X (단, Tree는 순서 있음)
		Set<String> data = new HashSet<>();
		data.add("월요일");
		data.add("화요일");
		data.add("토요일");
		data.add("토요일");
		data.add("일요일");

		System.out.println(data.size());

		// 일반 for 불가.. 순서가 없으므로 index 사용불가
		// 향상 for
		for (String str : data) {
			System.out.println(str);
		}

		Iterator<String> it = data.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	private static void f4() {
		// ArrayList는 중간의 data를 삽입하거나 삭제시 앞으로 당기는 것 때문에 느리다.
		List<Account> data = new ArrayList<>();

		Long start = System.nanoTime();
		for (int i = 1; i <= 100000; i++) {
			data.add(new Account(i + "", "홍" + i, 100));
		}

		for (int i = 100; i < 200; i++) {
			data.remove(i);
		}
		for (int i = 100; i < 200; i++) {
			data.add(new Account(i + "", "홍" + i, 100));
		}

		Long end = System.nanoTime();
		DecimalFormat df = new DecimalFormat("###,###");
		System.out.println("걸린시간 : " + df.format(end - start) + "ns");
	}

	private static void f3() throws InterruptedException {
		// Vector는 멀티쓰레드에 안정적...동기화된다.
		List<Account> data = new Vector<>();
		// 2000건을 add하고자한다. 2개의 흐름을 만들어서 각자 1000건씩
		// ArrayList는 쓰레드 환경에서 안정적이지 않음.
		// 멀티쓰레드 환경에서는 Vector를 사용.
		Long start = System.nanoTime();

		Thread t1 = new Thread() {
			@Override
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					data.add(new Account(i + "", "홍" + i, 100));
				}
			}
		};

		Thread t2 = new Thread() {
			@Override
			public void run() {
				for (int i = 1001; i <= 2000; i++) {
					data.add(new Account(i + "", "박" + i, 100));
				}
			}
		};

		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(data.size() + "건이 저장되었음.");

		for (int i = 0; i < 100; i++) {
			data.remove(0);
		}

		Long end = System.nanoTime();
		DecimalFormat df = new DecimalFormat("###,###");
		System.out.println("걸린시간 : " + df.format(end - start) + "ns");
	}

	private static void f2() {
		// List 인터페이스: 구현 class → ArrayList, Vector, LinkedList
		List<String> data = new ArrayList<>();
		data.add("자바1");
		data.add("자바2");
		data.add("자바3");
		data.add("자바4");
		data.add("자바5");

		System.out.println(data.size() + " 개");

		System.out.println("---일반 for---");
		for (int i = 0; i < data.size(); i++) {
			System.out.println(i + " : " + data.get(i));
		}

		System.out.println("---향상된 for---");
		for (String str : data) {
			System.out.println(str);
		}

		System.out.println("---Iterator---");
		Iterator<String> it = data.iterator();
		while (it.hasNext()) {
			System.out.println((String) it.next());
		}
	}

	private static void f1() {
		// List 인터페이스: 구현 class → ArrayList, Vector, LinkedList
		List data = new ArrayList<>(); // 제네릭을 사용하지 않는 것은 바람직하지 않음.
		data.add(100);
		data.add("자바");
		data.add(new Account("12345", "홍", 1000));
		int a = (Integer) data.get(0);
		String s = (String) data.get(1);
		Account acc = (Account) data.get(2);

		for (Object obj : data) {
			System.out.println(obj);
		}
	}

}
