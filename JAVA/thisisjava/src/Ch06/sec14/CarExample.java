package ch06.sec14;



public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setSpeed(-50);
		System.out.println("현재 속도 : "+myCar.getSpeed());
		
		myCar.setSpeed(60);
		System.out.println("현재 속도 : "+myCar.getSpeed());
		
		System.out.println(myCar.isStop());
		if(!myCar.isStop()) { 
			// 인스턴스화하면서 false로 초기화가 되어있기 때문에 !가 붙으면서 true
			myCar.setStop(true);
		} 
		System.out.println("현재 속도 : "+myCar.getSpeed());
	}
		
}
