package com.shinhan.day08;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

//@Data는 @ToString, @EqualsAndHashCode, @Getter, @Setter, @RequiredArgsConstructor를 자동 완성시켜줌.

@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(of = "kind")
public class Product<T, M> {
	private T kind;
	private M model;
}