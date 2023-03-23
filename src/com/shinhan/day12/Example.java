package com.shinhan.day12;

import java.util.Arrays;
import java.util.function.ToIntFunction;

public class Example {
	private static Student[] students = {
			new Student("홍길동", 90, 96),
			new Student("신용권", 95, 93)
	};
	
	private static double avg(Function<Student> func) {
		double rst = 0;
		for (Student st : students) {
			rst += func.apply(st);
		}
		return rst / students.length;
	}
	
	private static double avg2(ToIntFunction<Student> func) {
		return Arrays.stream(students)
		.mapToInt(func)
		.average()
		.orElse(0);
	}	
	
	public static void main(String[] args) {
//		double englishAvg = avg( s -> s.getEnglishScore() );
		double englishAvg = avg( Student::getEnglishScore );
		System.out.println("영어 평균 점수: "+ englishAvg);
		
//		double mathAvg = avg( s -> s.getMathScore() );
		double mathAvg = avg( Student::getMathScore );
		System.out.println("수학 평균 점수: "+ mathAvg);
		
		
		System.out.println("-----");
		double engAvg2 = Arrays.stream(students)
				.mapToInt(s -> s.getEnglishScore())
				.average()
				.orElse(0);
		double mathAvg2 = Arrays.stream(students)
			.mapToInt(s -> s.getMathScore())
			.average()
			.orElse(0);
		System.out.println(engAvg2 + " : " + mathAvg2);
		
		
		System.out.println("-----");
		englishAvg = avg2( s -> s.getEnglishScore() );
		System.out.println("영어 평균 점수: "+ englishAvg);
		
		mathAvg = avg2( s -> s.getMathScore() );
		System.out.println("수학 평균 점수: "+ mathAvg);
	}

}
