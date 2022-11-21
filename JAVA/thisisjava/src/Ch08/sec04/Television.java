package ch08.sec04;

public class Television implements RemoteControl{
	private int volume;
	@Override
	public void turnOn() {
		System.out.println("티비를 켰습니다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("티비를 껐습니다");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			System.out.println("볼륨이 10을 초과했습니다");
			this.volume=RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME) {
			System.out.println("볼륨은 0보다 낮을 수 없습니다");
			this.volume = RemoteControl.MIN_VOLUME;
		} else {this.volume = volume;}
		System.out.println("현재 티비 볼륨 : "+this.volume);
	}

		
}
