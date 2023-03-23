package com.shinhan.day10;

import java.util.*;
import java.util.Map.Entry;

import com.shinhan.day04.Employee1;
import com.shinhan.day05.Account;

public class CollectionTest2 {

	// List : 순서O, 중복O ArrayList, LinkedList, Vector
	// Set : 순서X, 중복X
	// Map : 키와 값의 쌍
	// HashSet : hashcode(), equals()로 동등비교, 동등하면 add 불가
	// TreeSet : compareTo()로 크기비교, 동등하면 add 불가
	public static void main(String[] args) {
		f14();
	}
	
	private static void f14() {
		// 수정불가한 Collection
		Set<Fruit> data = new HashSet<>();
		data.add(new Fruit("사과", 1000));
		data.add(new Fruit("귤", 2000));
		data.add(new Fruit("수박", 5000));
		data.add(new Fruit("딸기", 3000));
		data.add(new Fruit("멜론", 2000));
		
		Set<Fruit> data2 = Set.copyOf(data);
		for (Fruit f : data2) {
			System.out.println(f);
		}
	}

	private static void f13() {
		// 수정불가한 Collection
		Map<String, Integer> list = Map.of("김", 100, "이", 90, "박", 70);

		for (String key : list.keySet()) {
			System.out.println(key+ " : " +list.get(key));
		}

		list.put("정", 50);
	}

	private static void f12() {
		// 수정불가한 Collection
		Integer[] arr = new Integer[] { 100, 88, 93, 55, 8 }; // 값은 중복 불가
		Set<Integer> list = Set.of(arr);

		for (Integer i : list) {
			System.out.println(i);
		}

		list.add(17);
	}

	private static void f11() {
		// 수정불가한 Collection
		Integer[] arr = new Integer[] { 100, 88, 93, 55, 80 };
		List<Integer> list = List.of(arr);

		for (Integer i : list) {
			System.out.println(i);
		}

		list.add(17);
	}

	private static void f10() {
		// queue (FIFO)
		Queue<Fruit> data = new LinkedList<>();
		data.offer(new Fruit("사과1", 1000));
		data.offer(new Fruit("사과2", 2000));
		data.offer(new Fruit("사과3", 10000));
		data.offer(new Fruit("사과4", 8000));
		data.offer(new Fruit("사과5", 4000));

		while (!data.isEmpty()) {
			System.out.println(data.poll());
		}
	}

	private static void f9() {
		// stack (LIFO)
		Stack<Fruit> data = new Stack<>();
		data.push(new Fruit("사과1", 1000));
		data.push(new Fruit("사과2", 2000));
		data.push(new Fruit("사과3", 10000));
		data.push(new Fruit("사과4", 8000));
		data.push(new Fruit("사과5", 4000));

		while (!data.isEmpty()) {
			System.out.println(data.pop());
		}
	}

	private static void f8() {
		TreeMap<String, Fruit> data = new TreeMap<>(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		data.put("S", new Fruit("사과", 1000));
		data.put("A", new Fruit("귤", 2000));
		data.put("B", new Fruit("수박", 5000));
		data.put("A", new Fruit("딸기", 3000));
		data.put("B", new Fruit("사과", 2000));

		for (Entry<String, Fruit> entry : data.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		System.out.println("-----");
		for (String key : data.descendingMap().keySet()) {
			System.out.println(key + " : " + data.get(key));
		}
	}

	private static void f7() {
		Set<Fruit> data = new TreeSet<>(new Comparator<Fruit>() {
			@Override
			public int compare(Fruit f1, Fruit f2) {
//				if (f1.name.equals(f2.name)) // 동등 체크
				if (f1.equals(f2)) // 동등 체크
					return 0;

				if (f1.name.equals(f2.name)) // 크기 비교 로직
					return f1.price - f2.price;
				return f1.name.compareTo(f2.name);
			}
		});
		data.add(new Fruit("사과", 1000));
		data.add(new Fruit("귤", 2000));
		data.add(new Fruit("수박", 5000));
		data.add(new Fruit("딸기", 3000));
		data.add(new Fruit("사과", 2000));

		for (Fruit f : data) {
			System.out.println(f);
		}
	}

	private static void f6() {
		Set<Board> data = new TreeSet<>();
		data.add(new Board(1, "가", "content1", "홍길동"));
		data.add(new Board(2, "다", "content2", "홍길동"));
		data.add(new Board(3, "파", "content3", "홍길동"));
		data.add(new Board(4, "가", "content4", "홍길동"));
		data.add(new Board(5, "가", "content5", "홍길동"));

		for (Board board : data) {
			System.out.println(board);
		}
	}

	private static void f5() {
		// default : key로 sort된다.
		TreeMap<String, Integer> data = new TreeMap<>();
		data.put("홍길동5", 88);
		data.put("홍길동1", 99);
		data.put("홍길동4", 66);
		data.put("홍길동3", 77);
		data.put("홍길동3", 100);

		for (String key : data.keySet()) {
			System.out.println(key + " : " + data.get(key));
		}

		System.out.println("firstkey: " + data.firstKey());
		System.out.println("firstvalue: " + data.get(data.firstKey()));
		System.out.println("lastentry: " + data.lastEntry());
		System.out.println("lowerEntry: " + data.lowerEntry("홍길동4"));

		NavigableMap<String, Integer> data2 = data.descendingMap();
		for (String key : data2.keySet()) {
			System.out.println(key + " : " + data2.get(key));
		}
	}

	private static void f4() {
		TreeSet<Integer> scoreSet = new TreeSet<>();
		scoreSet.add(100);
		scoreSet.add(20);
		scoreSet.add(50);
		scoreSet.add(80);
		scoreSet.add(80);

		for (Integer i : scoreSet) {
			System.out.println(i);
		}

		System.out.println("1th: " + scoreSet.first());
		System.out.println("end: " + scoreSet.last());
		System.out.println("50 초과: " + scoreSet.higher(50));
		System.out.println("50 미만: " + scoreSet.lower(50));
		System.out.println("50 이상: " + scoreSet.ceiling(50));
		System.out.println("50 이하: " + scoreSet.floor(50));

		System.out.println("---tailSet(<=)---");
		SortedSet<Integer> data = scoreSet.tailSet(50);
		for (Integer i : data)
			System.out.println(i);

		System.out.println("---headSet(<=)---");
		NavigableSet<Integer> data2 = scoreSet.headSet(50, true);
		for (Integer i : data)
			System.out.println(i);

	}

	private static void method() {
		Set<String> set = new TreeSet<>();
		set.add("김0");
		set.add("김1");
		set.add("김2");
		set.add("김30");
		set.add("김34");
		set.add("김6");
		set.add("김8");
		set.add("홍1");

		for (String s : set) {
			System.out.println(s);
		}
	}

	private static void f3() {
		Set<Employee1> data = new TreeSet<>();
		data.add(new Employee1("홍", "사원", 3000));
		data.add(new Employee1("정", "대리", 4000));
		data.add(new Employee1("홍", "사원", 3000));
		data.add(new Employee1("김", "과장", 5000));
		data.add(new Employee1("이", "부장", 5000));

		System.out.println(data.size());
		for (Employee1 emp : data) {
			System.out.println(emp);
		}
	}

	private static void f2() {
		Set<Account> data = new TreeSet<>();
		// TreeSet은 compareTo로 크기 비교
		data.add(new Account("4", "홍", 1000));
		data.add(new Account("1", "김", 1000));
		data.add(new Account("6", "이", 400));
		data.add(new Account("8", "김", 600));
		data.add(new Account("4", "홍", 9999)); // 이미 존재하므로 add 되지않음

		for (Account acc : data) {
			System.out.println(acc);
		}
	}

	private static void f1() {
		Set<String> data = new TreeSet<>();
		data.add("월1");
		data.add("월5");
		data.add("월4");
		data.add("월5"); // 같은 값이 있으므로 add 되지않음
		data.add("월2");

		for (String str : data) {
			System.out.println(str);
		}
	}

}
