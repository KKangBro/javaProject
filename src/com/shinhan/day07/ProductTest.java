package com.shinhan.day07;

import java.util.ArrayList;

public class ProductTest {
	public static void main(String[] args) {
		ProductVO[] productList = {
				new ProductVO("마이쭈", 25000, "Samsong"),
				new ProductVO("꿈틀이", 32000, "Samsong"),
				new ProductVO("짱구", 17050, "Samsong"),
				new ProductVO("새우깡", 24500, "Samsong"),
				new ProductVO("고소미", 75000, "Daehoo") };
		productList = selectProduct(productList, 25000);
		for (int i = 0; i < productList.length; i++) {
			System.out.println(productList[i].toString());
		}
	}

	// Object상속받아서 ProductVO만든것이다.
	// 자동형변환 : 부모타입의 참조변수 = 자식객체
	// 강제형변환 : 자식타입의 참조변수 = (자식타입) 부모객체
		// 전제조건은 부모객체가 자식타입에서 자동형변환된 경우만 가능
	private static ProductVO[] selectProduct(Object[] productList, int i) {
		// 매개변수로 들어온 객체의 배열로부터 가격이 특정 금액 이상인 상품만 추출하여
		// 새로운 배열에 담아서 리턴하는 메서드를 구현하시오.
		if (productList instanceof ProductVO[] inputList) {
			ArrayList<ProductVO> arrayList = new ArrayList<>();

			for (ProductVO product : inputList) {
				if (product.getPrice() >= i) {
					arrayList.add(product);
				}
			}

			ProductVO[] outputList = arrayList.toArray(new ProductVO[arrayList.size()]);
			return outputList;
//			return arrayList.toArray(new ProductVO[arrayList.size()]);
		}

		return null;
	}
}

/*
 * <<실행결과 >>
 * 
 * ProductVO [name=마이쭈, price=25000, maker=Samsong]
 * ProductVO [name=꿈틀이, price=32000, maker=Samsong]
 * ProductVO [name=고소미, price=75000, maker=Daehoo]
 */
