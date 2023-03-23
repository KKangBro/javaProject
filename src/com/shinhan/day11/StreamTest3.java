package com.shinhan.day11;

import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.shinhan.day05.Account;

public class StreamTest3 {

	public static void main(String[] args) throws Exception {
		f13();
	}
	
	private static void f13() {
		List<Student2> list = new ArrayList<>();
		list.add(new Student2("유재석", 95, "M"));
		list.add(new Student2("정형돈", 85, "M"));
		list.add(new Student2("박명자", 100, "F"));
		list.add(new Student2("노라", 90, "F"));
		list.add(new Student2("노홍철", 100, "M"));
		
		// group으로 집계를 하고 다시 group이 Collection으로 만든다
		Map<String, Double> map = list.stream()
			.collect(
				Collectors.groupingBy(
					st -> st.getGender(),
					Collectors.averagingDouble(st -> st.getScore())
				)
			);
		
		System.out.println(map);
	}

	private static void f12() {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		boolean rst1 = Arrays.stream(arr).allMatch(value -> value % 2 == 0);
		System.out.println(rst1);
		
		boolean rst2 = Arrays.stream(arr).anyMatch(value -> value % 2 == 0);
		System.out.println(rst2);
		
		boolean rst3 = Arrays.stream(arr).noneMatch(value -> value % 2 == 0);
		System.out.println(rst3);
		
		double avg = Arrays.stream(arr)
			.filter(value -> value%2==0)
			.average()
			.orElse(0);
		System.out.println(avg);
	}

	private static void f11() {
		List<Student> list = new ArrayList<>();
		list.add(new Student("유재석", 100));
		list.add(new Student("박명수", 88));
		list.add(new Student("정준하", 88));
		list.add(new Student("노홍철", 48));
		list.add(new Student("정형돈", 63));
		
		list.stream()
			.sorted()
			.forEach(st -> System.out.println(st));
		
		System.out.println("---------sort 변경----------");
		list.stream()
			.sorted((a, b) -> a.getName().compareTo(b.getName()))
			.forEach(st -> System.out.println(st));
	}

	private static void f10() {
		Integer[] arr = { 100, 88, 99, 50, 60 };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
//		Arrays.sort(arr, new Comparator<Integer>() {
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return o2 - o1;
//			}
//		});
		
		Arrays.sort(arr, (a, b) -> b - a);
		System.out.println(Arrays.toString(arr));
		
		Student[] arr2 = {
				new Student("유재석", 90),
				new Student("박명수", 88),
				new Student("정준하", 59),
				new Student("정형돈", 73),
				new Student("하동훈", 95),
				new Student("노홍철", 95)
		};
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		
		Arrays.sort(arr2, (a, b) -> {
			return a.getName().compareTo(b.getName());
		});
		System.out.println(Arrays.toString(arr2));
	}

	private static void f9() {
		List<String> list = new ArrayList<>();
		list.add("this is java");
		list.add("i am a best developer");
		
		list.stream()
			.flatMap(str -> Arrays.stream(str.split(" ")))
			.forEach(word -> System.out.println(word));
		
		List<String> list2 = Arrays.asList("10, 20, 30", "40, 50");
		list2.stream()
			.flatMapToInt(str -> {
				String[] strArr = str.split(",");
				int[] intArr = new int[strArr.length];
				for (int i = 0; i < intArr.length; i++) {
					intArr[i] = Integer.parseInt(strArr[i].trim());
				}
				return Arrays.stream(intArr);
			})
			.forEach(value -> System.out.println(value));
		
	}

	private static void f8() {
		int[] arr = { 10, 20, 70, 90 };
		
		Arrays.stream(arr)
			.asDoubleStream()
			.forEach(d -> System.out.println(d));
		
		Arrays.stream(arr)
			.boxed()
			.forEach(d -> System.out.println(d.intValue()));
	}

	private static void f7() {
		List<Student> list = new ArrayList<>();
		list.add(new Student("유재석", 100));
		list.add(new Student("박명수", 88));
		list.add(new Student("정준하", 95));
		list.add(new Student("노홍철", 48));
		list.add(new Student("정형돈", 63));
		
		System.out.println("---점수가 70초과인 학생만 추출---");
		list.stream()
			.distinct()	// 중복 제거
			.filter(s -> s.getScore() > 70)
			.forEach(s -> System.out.println(s));
		
		System.out.println("---성이 '정'인 사람만 추출---");
		list.stream()
			.distinct()
			.filter(s -> s.getName().startsWith("정"))
			.forEach(s -> System.out.println(s));
		
		
		System.out.println("---정씨들의 점수 평균---");
		list.stream()
			.distinct()
			.filter(s -> s.getName().startsWith("정"))
			.mapToInt(s -> s.getScore()) // 중간 처리
			.average() // 최종 처리
			.ifPresent(avg -> System.out.println("avg: " + avg));
	}

	private static void f6() {
		List<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("박명수");
		list.add("정준하");
		list.add("유재석");
		list.add("홍길동");
		list.add("홍홍홍");

		list.stream()
			.distinct()	// 중복 제거
			.filter(s -> !s.startsWith("홍"))
			.forEach(s -> System.out.println(s));
	}

	private static void f5() throws URISyntaxException, IOException {
		Path path = Paths.get(StreamTest3.class.getResource("data.txt").toURI());
		System.out.println(path);
		System.out.println(Charset.defaultCharset());
		Stream<String> streamData = Files.lines(path, Charset.defaultCharset());
		streamData.forEach(line -> System.out.println(line));
		streamData.close();
	}

	private static void f4() throws IOException {
		FileReader fi = new FileReader("src/com/shinhan/day11/data.txt");
		int i;
		while ((i = fi.read()) != -1) {
			System.out.print((char) i);
		}
	}

	private static void f3() {
		// range(1, 10): 1~9.  rangeClosed(1, 10): 1~10
		IntStream.rangeClosed(1, 10).forEach(su -> System.out.println(su));
		
		// 외부반복자
		for (int i = 1; i < 10; i++) {
			System.out.println("일반for문: "+i);
		}
	}

	private static void f2() {
		List<Account> list = new LinkedList<>();
		list.add(new Account("11", "홍길동", 3000));
		list.add(new Account("22", "김길동", 2000));
		list.add(new Account("33", "이길동", 1000));
		list.add(new Account("44", "박길동", 7000));
		list.add(new Account("55", "최길동", 4000));
		list.add(new Account("77", "정길동", 2000));
		
		// 모든 계좌의 잔고의 합
		// 외부반복자
		int sum1 = 0;
		for (Account acc : list) {
			sum1 += acc.getBalance();
		}
		System.out.println("잔고의 합계1: " + sum1);
		
		// stream을 이용하면 내부반복자를 사용한다.
		long sum2 = list.stream().mapToLong(acc -> acc.getBalance()).sum();
		System.out.println("잔고의 합계2: " + sum2);
		
		// 모든 계좌의 이름 가져와서 갯수 확인
		long cnt = list.stream().map(acc -> acc.getOwner()).count();
		System.out.println("건수: " + cnt);
		
		// forEach: 순서 보장 안함.  forEachOrdered: 병렬이라도 순서를 보장함.(스트림이 순서를 정의했다면)
		System.out.println("---forEach---");
		list.parallelStream().map(acc -> acc.getOwner()).forEach(owner -> System.out.println(owner + " 예금주님"));
		System.out.println("---forEachOrdered---");
		list.parallelStream().map(acc -> acc.getOwner()).forEachOrdered(owner -> System.out.println(owner + " 예금주님"));
	}

	private static void f1() {
		// 여러건 저장하기 : 배열, Collection(List, Set, Map)
		List<Student> data = new ArrayList<>();
		data.add(new Student("김", 100));
		data.add(new Student("이", 88));
		data.add(new Student("박", 95));
		data.add(new Student("최", 48));
		data.add(new Student("정", 72));
		// data를 stream으로 만들어서 중간처리, 최종처리
		data.stream().forEach(st -> {
			System.out.println(st);
			System.out.println(st.getName() + " => " + st.getScore());
		});
		
		System.out.println("----중간처리 test----");
		data.stream()
			.mapToInt(st -> st.getScore()) // 중간 처리
			.forEach(score -> {
				System.out.println(score);
				System.out.println("^^");
			});
		
		System.out.println("----최종처리 test----");
		double avg = data.stream()
			.mapToInt(st -> st.getScore())
			.average()
			.getAsDouble();
		System.out.println("average: " + avg);
		
		System.out.println("----Optional test1----");
		OptionalDouble option = data.stream()
			.mapToInt(st -> st.getScore())
			.average();
		option.ifPresent(rst -> System.out.println("average: " + rst));
		
		System.out.println("----Optional test2----");
		data.stream()
			.mapToInt(st -> st.getScore())
			.average()
			.ifPresent(rst -> System.out.println("average: " + rst));
		
		List<Student> data2 = new ArrayList<>();
		System.out.println("----Optional test3----");
		data2.stream()
			.mapToInt(st -> st.getScore())
			.average()
			.ifPresentOrElse(rst -> System.out.println("average: " + rst), () -> System.out.println("평균을 계산할 수 없음.."));
	}

}
