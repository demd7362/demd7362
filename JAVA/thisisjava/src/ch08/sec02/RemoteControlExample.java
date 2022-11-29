package ch08.sec02;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc = new Television();
		
		
		rc.turnOn(); // TV 전원을 켭니다

		
		RemoteControl rc2 = new Audio();
		
		rc2.turnOn(); // Audio 전원을 켭니다
		
		rc = new Audio(); 
		
		rc.turnOn(); // Audio 전원을 켭니다
	}

}
