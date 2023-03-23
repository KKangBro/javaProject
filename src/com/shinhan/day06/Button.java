package com.shinhan.day06;

public class Button {
	// field
	private ClickListener listener;
	// method
	void setListener(ClickListener listener) {
		this.listener = listener;
	}
	public void ButtonClick() {
		listener.onClick();
	}
	
	// 내부interface
	static interface ClickListener {
		void onClick();
	}
}
