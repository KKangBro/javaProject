package com.shinhan.day06;

class Dice {
	int size;

	Dice(int size) {
		this.size = size;
	}

	int play() {
		int number = (int) (Math.random() * size) + 1;
		return number;
	}
}

public class Ch11LAB1_DiceGame {

	public static void main(String[] args) {
		Ch11LAB1_DiceGame game = new Ch11LAB1_DiceGame();

		int result1 = game.countSameEye(10);
		System.out.println("면의 개수가 8개인 주사위 2개를  던져서 같은 눈이 나온 횟수 : " + result1);

		int result2 = -1;
		try {
			result2 = game.countSameEye(-10);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("면의 개수가 8개인 주사위 2개를  던져서 같은 눈이 나온 횟수 : " + result2);

	}

	int countSameEye(int n) {
		// 구현
		Dice dice1 = new Dice(8);
		Dice dice2 = new Dice(8);
		int num1, num2, cnt = 0;

		if (n < 0) {
			throw new IllegalArgumentException("주사위를 던지는 횟수(n)의 값에 음수가 들어올 수 없음.");
		} else {
			for (int i = 0; i < n; i++) {
				num1 = dice1.play();
				num2 = dice2.play();
//					System.out.println(num1 + ":" + num2);
				cnt = num1 == num2 ? cnt + 1 : cnt;
//					System.out.println("cnt: "+cnt);
			}
		}

		return cnt;
	}
}
