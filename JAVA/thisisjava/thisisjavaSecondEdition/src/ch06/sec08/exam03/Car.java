package ch06.sec08.exam03;

public class Car {
	
	int gas;
	
	Car(int gas) {
		this.gas=gas;
	}
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없습니다");
		return false;
		}
		System.out.println("gas가 있습니다");
		return true;
	}
	
	void run() {
		while(true) {
		if(gas>0) { // true
			System.out.println("달립니다. "+"잔량 gas : "+gas);
		gas--;
		} else {
		System.out.println("멈춥니다. "+"잔량 gas : "+gas);
		break; // return; 과 같다
		}
	}
	}
}
