package com.shinhan.day11;

// 함수형표현...람다식...람다표현식으로 표현 가능한가? @FunctionalInterface
// interface에 1개의 메서드만 존재해야한다.
@FunctionalInterface
public interface Calculable {
	// 추상 메서드 정의
	void calculate(int x, int y);
}
