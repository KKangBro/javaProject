package com.shinhan.day07;

import lombok.*;

//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
//@EqualsAndHashCode(of = { "model", "price" })
//@ToString
@Data		// @Data는 @ToString, @EqualsAndHashCode, @Getter, @Setter, @RequiredArgsConstructor를 자동완성시켜줌.
@RequiredArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(exclude = { "maker" })
public class Computer {
	@NonNull private String model;
	private int price;
	private String maker;

}
