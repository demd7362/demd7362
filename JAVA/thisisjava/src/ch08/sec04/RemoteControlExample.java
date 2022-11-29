package ch08.sec04;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc = new Television();
		rc.turnOn();
		rc.setVolume(11);
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(-2);
		rc.turnOff();
		

	}

}
