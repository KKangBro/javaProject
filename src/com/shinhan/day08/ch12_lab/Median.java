package com.shinhan.day08.ch12_lab;

import java.util.Arrays;

public class Median {

	public static void main(String[] args) {
		Median median = new Median();
		int[] values1 = { 10, 4, 53, 63, 17, 37, 52, 16, 33, 65 };
//		int[] values1 = { 10, 4, 53, 63, 17, 33, 52, 16, 37, 65 };
		System.out.println("input : " + Arrays.toString(values1));
		System.out.println("median : " + median.findMedian(values1));
		System.out.println("===============================");

		int[] values2 = { 32, 53, 52, 76, 15, 98, 76, 65, 36, 10 };
		System.out.println("input : " + Arrays.toString(values2));
		System.out.println("median : " + median.findMedian(values2));
	}

	public int findMedian(int[] values) {
		// - 중간 값이란 평균값에 제일 가까운 값을 말합니다.
		// - 중간 값이 여러 개 일 경우, 작은 수를 리턴 합니다.
		int sum = 0;
		for (int i : values)
			sum += i;
		int avg = sum / values.length;
//		System.out.println("avg: " + avg);

		int minDiff = Integer.MAX_VALUE;
		int[] diffArr = new int[values.length];
		for (int i = 0; i < values.length; i++) {
			diffArr[i] = Math.abs(avg - values[i]);
			minDiff = minDiff < diffArr[i] ? minDiff : diffArr[i];
		}
//		System.out.println(Arrays.toString(diffArr));
//		System.out.println(minDiff);

		if (minDiff == 0) {
			return avg;
		} else {
			int idx = 0;
			int[] rstArr = new int[values.length];
			for (int i = 0; i < diffArr.length; i++) {
				if (minDiff == diffArr[i]) {
					rstArr[idx] = values[i];
					idx++;
				}
			}
			Arrays.sort(rstArr);
//			System.out.println(Arrays.toString(rstArr));

			for (int i : rstArr) {
				if (i != 0)
					return i;
			}
		}
		return 0;
	}
}
