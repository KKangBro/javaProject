package com.shinhan.day04;

public class Ch06LAB5_02_EmployeeExam {

	public static void main(String[] args) {
		Ch06LAB5_02_Employee[] employee = new Ch06LAB5_02_Employee[4];
		employee[0] = new Ch06LAB5_02_Employee("1234", "이부장", 1500000);
		employee[1] = new Ch06LAB5_02_Employee("5678", "김과장", 1300000);
		employee[2] = new Ch06LAB5_02_Employee("9012", "최대리", 1200000);
		employee[3] = new Ch06LAB5_02_Employee("3456", "박사원", 1000000);

		for (Ch06LAB5_02_Employee emp : employee)
			System.out.println(emp.toString());

		System.out.println(employee[2].getName() + "의 보너스: " + (int) employee[2].getSalary(0.8));

	}

}
