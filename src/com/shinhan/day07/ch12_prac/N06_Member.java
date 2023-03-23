package com.shinhan.day07.ch12_prac;

public class N06_Member {
	private String id;
	private String name;
	
	public N06_Member(String id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return id + ": " + name;
	}
	
	
}
