package com.shinhan.day05;

public class Circle extends Shape {
	double radius;
	double circumference;

	public Circle(String color, double radius) {
		super(color, "Circle");
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	@Override
	public double calculateArea() {
		return radius * radius * Math.PI;
	}

	@Override
	public double calculatePerimeter() {
		circumference = 2 * Math.PI * radius;
		return circumference;
	}

}
