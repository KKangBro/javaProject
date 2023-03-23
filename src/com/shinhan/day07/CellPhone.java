package com.shinhan.day07;

public class CellPhone {
	String model;
	double battery;

	public CellPhone(String model) {
		this.model = model;
		battery = 0;
	}

	void call(int time) {
		if (time < 0) {
			throw new IllegalArgumentException("통화시간입력오류");
		} else {
			System.out.println("통화 시간 : " + time + "분");
			battery = battery - time * 0.5 < 0 ? 0 : battery - time * 0.5;
		}
	}

	void charge(int time) {
		if (time < 0) {
			throw new IllegalArgumentException("충전시간입력오류");
		} else {
			System.out.println("충전 시간 : " + time + "분");
			battery = battery + time * 3 > 100 ? 100 : battery + time * 3;
		}
	}

	void printBattery() {
		System.out.println("남은 배터리 양 : " + battery);
	}

	// Override : 함수 이름, 매개변수 타입과 갯수, return 타입이 모두 같아야하고, 접근제한자는 같거나 더 넓어져야한다.
	public boolean equals(Object otherObject) {
		if (otherObject instanceof CellPhone other && this.model.equals(other.model))
			return true;
		else
			return false;
	}
}