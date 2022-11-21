package ch09.sec06.exam02;

public class Button {
	public static interface ClickListener {
		void onClick();
	}
	private ClickListener clickListener; // 인스턴스 변수 선언
	
	
	public void setClickListener(ClickListener clickListener) { 
		this.clickListener=clickListener;
	}
	public void click() { // 게터
		this.clickListener.onClick();
	
	}
}
