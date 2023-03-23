package com.shinhan.day10.lab;

import java.util.Objects;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Student {
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
