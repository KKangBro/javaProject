package com.shinhan.day10.lab;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);

		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		for (String key : map.keySet()) {
			totalScore += map.get(key);
			maxScore = maxScore > map.get(key) ? maxScore : map.get(key);
		}

		System.out.println("평균 점수: " + totalScore / map.size());
		System.out.println("최고 점수: " + maxScore);

		for (String key : map.keySet()) {
			if (map.get(key) == maxScore)
				name = key;
		}
		System.out.println("최고 점수를 받은 아이디: " + name);
	}

}
