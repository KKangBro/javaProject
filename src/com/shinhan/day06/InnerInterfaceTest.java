package com.shinhan.day06;

public class InnerInterfaceTest {

	public static void main(String[] args) {
		Button b1 = new Button();
		Button b2 = new Button();
		Button.ClickListener listener1 = new OKListener();
		Button.ClickListener listener2 = new CancelListener();
		test(b1, listener1);
		test(b2, listener2);
		
//		Button.ClickListener listener = new OKListener();
//		b1.setListener(listener);
//		b1.ButtonClick();
//		
//		Button.ClickListener listener2 = new CancelListener();
//		b1.setListener(listener2);
//		b1.ButtonClick();
	}

	static void test(Button btn, Button.ClickListener listener) {
		btn.setListener(listener);
		btn.ButtonClick();
	}
}
