package com.shinhan.day06;

public class LabelTest {

	public static void main(String[] args) {
		Label v1 = new Label("이름입력", 20, 5, "black", "large");
		Resizable v2 = new Label("이름입력", 20, 5, "black", "large");
		Colorable v3 = new Label("이름입력", 20, 5, "black", "large");
		Changeable v4 = new Label("이름입력", 20, 5, "black", "large");
		
		work(v1);
//		work(v2);
//		work(v3);
		work(v4);
	}

	// 자동 형 변환 : 부모의 타입 객체참조변수 - 자식 객체
	private static void work(Changeable aa) {
		if(aa instanceof Label label) {
			label.resize(0, 0);
			label.setForeground(null);
			label.setBackground(null);
			label.setFont(null);
		}
	}

}
