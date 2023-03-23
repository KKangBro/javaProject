package com.shinhan.day11;

import java.util.*;

public class StreamTest2 {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("홍길동1", 10),
				new Student("홍길동3", 20),
				new Student("홍길동2", 70),
				new Student("홍길동5", 88),
				new Student("홍길동4", 90)
		);

//		list.forEach(st -> System.out.println(st));

		// mapToInt: 중간처리
		// map: 변형한다의 의미
		// average: 최종처리..평균
		double avg = list.stream().mapToInt(st -> st.getScore()).average().getAsDouble();
		System.out.println("평균: " + avg);

		
		List<Student> list2 = Arrays.asList();
		
		OptionalDouble opAvg = list2.stream().mapToInt(st -> st.getScore()).average();
		opAvg.ifPresentOrElse(a -> {
			System.out.println("평균: " + a);
		}, () -> {
			System.out.println("평균 계산할 수 없음");
		});
	}

}
