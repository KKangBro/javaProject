package com.shinhan.day08;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Car implements Comparable<Car> {
	String model;
	int price;

	@Override
	public int compareTo(Car car) {
		if (this.price != car.price)
			return this.price - car.price;
		else
			return car.model.compareTo(this.model);
	}

}
