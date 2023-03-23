package com.shinhan.day04;

public class Ch06LAB6_School {

	public static void main(String[] args) {
		Student std = new Student("홍길동", 20, 200201);
		Teacher tr = new Teacher("이순신", 30, "JAVA");
		Employee emp = new Employee("유관순", 40, "교무과");
		
		std.print();
		tr.print();
		emp.print();
	}

}

class Student {
	private String name;
	private int age;
	private int id;

	public Student(String name, int age, int id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void print() {
		System.out.printf("이   름 : %s    나 이 : %d     학    번 : %d\n", name, age, id);
	}
}

class Teacher {
	private String name;
	private int age;
	private String subject;

	public Teacher(String name, int age, String subject) {
		this.name = name;
		this.age = age;
		this.subject = subject;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void print() {
		System.out.printf("이   름 : %s    나 이 : %d     담당과목 : %s\n", name, age, subject);
	}
}

class Employee {
	private String name;
	private int age;
	private String dept;

	public Employee(String name, int age, String dept) {
		this.name = name;
		this.age = age;
		this.dept = dept;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public void print() {
		System.out.printf("이   름 : %s    나 이 : %d     부    서 : %s\n", name, age, dept);
	}
}