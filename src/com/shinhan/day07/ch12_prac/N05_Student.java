package com.shinhan.day07.ch12_prac;

import java.util.Objects;

public class N05_Student {
	private String studentNum;

	public N05_Student(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getstudentNum() {
		return studentNum;
	}

	@Override
	public int hashCode() {
		return Integer.parseInt(studentNum);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		N05_Student other = (N05_Student) obj;
		return Objects.equals(studentNum, other.studentNum);
	}
}
