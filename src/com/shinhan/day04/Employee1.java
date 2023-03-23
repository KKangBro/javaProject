package com.shinhan.day04;

import lombok.EqualsAndHashCode;

//Ch06LAB5_01
@EqualsAndHashCode(of = { "name", "title" })
public class Employee1 implements Comparable<Employee1> {
	private String name;
	private String title;
	private int baseSalary;
	private int totalSalary;

	public Employee1(String name, String title, int baseSalary) {
		this.name = name + " 님";
		this.title = title;
		this.baseSalary = baseSalary;
		getTotalSalary();
	}

	public void getTotalSalary() {
		if (title.equals("부장님")) {
			totalSalary = baseSalary + baseSalary * 25 / 100;
		} else if (title.equals("과장님")) {
			totalSalary = baseSalary + baseSalary * 15 / 100;
		} else {
			totalSalary = baseSalary + baseSalary * 5 / 100;
		}
	}

	public void print() {
		System.out.printf("%s 직급의 %s의 본봉은 %d 원이고 총급여는 %d 원입니다.\n", title, name, baseSalary, totalSalary);
	}

	@Override
	public String toString() {
		return "Employee1 [name=" + name + ", title=" + title + ", baseSalary=" + baseSalary + ", totalSalary="
				+ totalSalary + "]";
	}

	@Override
	public int compareTo(Employee1 other) {
		int rst1 = name.compareTo(other.name) * -1;
		int rst2 = baseSalary - other.baseSalary;
		if (rst2 == 0)
			title.compareTo(other.title);
		if (rst1 == 0)
			return rst2;
		return rst1;
	}

}
