package ch08.sec05;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc = new Audio(); // 오버라이드 메소드 호출
		rc.turnOn();
		rc.setVolume(11);
		
		System.out.println("---------");
		rc.setMute(true);
		rc.setMute(false);
		System.out.println("-----end-----");
		
		rc = new Television(); // television 클래스에는 setMute를 오버라이드하지 않기때문에 default메소드 호출
		rc.turnOn();
		rc.setVolume(-1);
		
		System.out.println("-----end-----");
		rc.setMute(true);
		rc.setMute(false);
		
	}

}
