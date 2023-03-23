package com.shinhan.day05;

public class Rectangle extends Shape {
	double length;
	double width;

	public Rectangle(String color, double length, double width) {
		super(color, "Rectangle");
		this.length = length;
		this.width = width;
	}
	
	@Override
	public double calculateArea() {
		return length * width;
	}

	@Override
	public double calculatePerimeter() {
		return 2 * (length + width);
	}

}
