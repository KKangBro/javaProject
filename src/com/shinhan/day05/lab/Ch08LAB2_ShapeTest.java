package com.shinhan.day05.lab;

abstract class Shape {
	int numSides;

//	public Shape() {}

	public Shape(int numSides) {
		this.numSides = numSides;
	}

	public int getNumSides() {
		return numSides;
	}

	abstract double getArea(); // 넓이

	abstract double getPerimeter(); // 둘레 길이
}

interface Resizable {
	void resize(double s);
}

class RectTriangle extends Shape {
	double width;
	double height;

	public RectTriangle(double width, double height) {
		super(3);
		this.width = width;
		this.height = height;
	}

	@Override
	double getArea() {
		return width * height / 2;
	}

	@Override
	double getPerimeter() {
		return width + height + Math.sqrt(height * height + width * width);
	}

}

class Rectangle extends Shape implements Resizable {
	double width;
	double height;

	public Rectangle(double width, double height) {
		super(4);
		this.width = width;
		this.height = height;
	}

	@Override
	double getArea() {
		return width * height;
	}

	@Override
	double getPerimeter() {
		return (width + height) * 2;
	}

	@Override
	public void resize(double s) {
		width *= s;
		height *= s;
	}
}

public class Ch08LAB2_ShapeTest {
	public static void main(String args[]) {
		Shape[] shape = new Shape[2];
		shape[0] = new Rectangle(5, 6);
		shape[1] = new RectTriangle(6, 2);

		for (Shape s : shape) {
			System.out.println("area: " + s.getArea());
			System.out.println("perimeter: " + s.getPerimeter());
			if (s instanceof Resizable) {
				((Resizable) s).resize(0.5);
				System.out.println("new area: " + s.getArea());
				System.out.println("new perimeter: " + s.getPerimeter());
			}
		}
	}
}
