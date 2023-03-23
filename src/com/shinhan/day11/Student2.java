package com.shinhan.day11;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
//@ToString
public class Student2 implements Comparable<Student2> {
	private String name;
	private int score;
	private String gender;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student2 [name=").append(name).append(", score=").append(score).append(", gender=").append(gender).append("]");
		return builder.toString();
	}

	@Override
	public int compareTo(Student2 other) {
		int rst = score - other.score;
		if (rst == 0)
			return other.name.compareTo(name);
		return rst;
	}

}
