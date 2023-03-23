package com.shinhan.day04;

public class Ch06LAB5_02_Employee {
	private String id;
	private String name;
	private int baseSalary;

	public Ch06LAB5_02_Employee(String id, String name, int baseSalary) {
		this.id = id;
		this.name = name;
		this.baseSalary = baseSalary;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(int baseSalary) {
		this.baseSalary = baseSalary;
	}

	public double getSalary(double bonus) {
		return baseSalary + baseSalary * bonus;
	}

	public String toString() {
		return name + "(" + id + ") 사원의 기본급은 " + baseSalary + "원 입니다.";
	}

}
