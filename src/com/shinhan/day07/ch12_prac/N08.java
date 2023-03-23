package com.shinhan.day07.ch12_prac;

public class N08 {

	public static void main(String[] args) {
		long start = System.nanoTime();
		int[] scores = new int[1000];
		for (int i = 0; i < scores.length; i++) {
			scores[i] = i;
		}

		int sum = 0;
		for (int score : scores) {
			sum += score;
		}

		double avg = sum / scores.length;
		System.out.println(avg);
		long end = System.nanoTime();
		System.out.println("걸린 시간(nano sec): " + (end - start));
	}

}
