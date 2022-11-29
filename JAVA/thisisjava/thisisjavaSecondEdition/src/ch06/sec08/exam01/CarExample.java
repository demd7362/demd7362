package ch06.sec08.exam01;

class Car {
	int gas;
	
	Car(int gas) {
		this.gas=gas;
	}
	
	boolean isLeftGas() {
		System.out.println("가스 잔량 확인중입니다");
		
		if(gas == 0) {
			System.out.println("가스가 없습니다");
			return false;
		}
		else System.out.println("가스가 있습니다");
		return true;
	}
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다.(가스 잔량: "+gas+")");
			gas--;
			} else {
				System.out.println("멈춥니다.(가스 잔량: "+gas+")");
			return;
			}
		}
	}
	
	
} // end of Car class
public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car(5);
		
//		myCar.isLeftGas();
		
		if(myCar.isLeftGas()) {
			System.out.println("출발합니다");
			myCar.run();
		}
		
		System.out.println("가스를 주입하세요");
	}

}
