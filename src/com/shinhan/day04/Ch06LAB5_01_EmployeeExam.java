package com.shinhan.day04;

public class Ch06LAB5_01_EmployeeExam {

	public static void main(String[] args) {
		Employee1[] employee = new Employee1[4];
		employee[0] = new Employee1("이부장", "부장", 1500000);
		employee[1] = new Employee1("김과장", "과장", 1300000);
		employee[2] = new Employee1("최대리", "대리", 1200000);
		employee[3] = new Employee1("박사원", "사원", 1000000);

		for (Employee1 emp : employee) {
			emp.print();
		}
	}

}
