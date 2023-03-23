package com.shinhan.day11;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
//@ToString
public class Student implements Comparable<Student> {
	private String name;
	private int score;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student Info.. [name=").append(name).append(", score=").append(score).append("]");
		return builder.toString();
	}

	@Override
	public int compareTo(Student other) {
		int rst = score - other.score;
		if (rst == 0)
			return other.name.compareTo(name);
		return rst;
	}

}
