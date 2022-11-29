package ch09.sec07.exam03;


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
