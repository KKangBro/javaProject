package com.shinhan.day10;

import java.util.*;
import lombok.*;

public class Ch15LAB {

	public static void main(String[] args) {
		method10();
	}

	@AllArgsConstructor
	public static class Student10 implements Comparable<Student10> {
		public String id;
		public int score;

		@Override
		public int compareTo(Student10 other) {
			return score - other.score;
		}
	}

	private static void method10() {
		TreeSet<Student10> treeset = new TreeSet<>();
		treeset.add(new Student10("blue", 96));
		treeset.add(new Student10("hong", 86));
		treeset.add(new Student10("blue", 96));

		Student10 student = treeset.last();
		System.out.println("최고 점수: " + student.score);
		System.out.println("최고 점수를 받은 아이디: " + student.id);
	}

	private static void method9() {
		Map<String, Integer> map = new HashMap<>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);

		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		for (String key : map.keySet()) {
			totalScore += map.get(key);
			maxScore = maxScore > map.get(key) ? maxScore : map.get(key);
		}

		System.out.println("평균 점수: " + totalScore / map.size());
		System.out.println("최고 점수: " + maxScore);

		for (String key : map.keySet()) {
			if (map.get(key) == maxScore)
				name = key;
		}
		System.out.println("최고 점수를 받은 아이디: " + name);
	}

	@AllArgsConstructor
	public static class Student {
		public int studentNum;
		public String name;

		@Override
		public int hashCode() {
			return Objects.hash(studentNum);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Student other = (Student) obj;
			return studentNum == other.studentNum;
		}
	}

	private static void method8() {
		Set<Student> set = new HashSet<>();
		set.add(new Student(1, "홍길동"));
		set.add(new Student(2, "신용권"));
		set.add(new Student(1, "조민우"));

		System.out.println("저장된 객체 수: " + set.size());
		for (Student s : set) {
			System.out.println(s.studentNum + ":" + s.name);
		}
	}

	public static class BoardDao {
		List<Board> list = new ArrayList<>();

		public BoardDao() {
			list.add(new Board("제목1", "내용1"));
			list.add(new Board("제목2", "내용2"));
			list.add(new Board("제목3", "내용3"));
		}

		public List<Board> getBoardList() {
			return list;
		}
	}

	public static class ListExample {
		public static void main(String[] args) {
			BoardDao dao = new BoardDao();
			List<Board> list = dao.getBoardList();

			for (Board board : list) {
				System.out.println(board.getTitle() + "-" + board.getContent());
			}
		}
	}

	@AllArgsConstructor
	@Getter
	public static class Board {
		private String title;
		private String content;
	}

	private static void method7() {
		BoardDao dao = new BoardDao();
		List<Board> list = dao.getBoardList();

		for (Board board : list) {
			System.out.println(board.getTitle() + "-" + board.getContent());
		}
	}

	// 13. 4번
	// 12. 3번
	// 11. 4번
	// 6. HashSet<String, Integer> 변수 = new HashSet<>();
	// 5. ArrayList<Board> 변수 = new ArrayList<>();
	// 4. 3번
	// 3. 4번
	// 2. 3번
	// 1. 4번
}
