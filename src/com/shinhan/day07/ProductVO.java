package com.shinhan.day07;

import java.util.Objects;

// VO (Value Object)
public class ProductVO {
	private String name;
	private int price;
	private String maker;

	public ProductVO(String name, int price, String maker) {
		this.name = name;
		this.price = price;
		this.maker = maker;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String toString() {
		return "ProductVO [name=" + name + ", price=" + price + ", maker=" + maker + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(maker, name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)	// 자기자신이면
			return true;
		if (obj == null)	// 아무것도 아니면
			return false;
		if (getClass() != obj.getClass())	// 타입이 다르면
			return false;
		ProductVO other = (ProductVO) obj;	// 강제 casting 하고 속성들의 내용 각각 비교
		return Objects.equals(maker, other.maker) && Objects.equals(name, other.name) && price == other.price;
	}

	
}
