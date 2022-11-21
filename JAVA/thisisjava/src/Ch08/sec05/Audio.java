package ch08.sec05;

public class Audio implements RemoteControl{
	private int volume;
	@Override
	public void turnOn() {
		System.out.println("오디오를 켰습니다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("오디오를 껐습니다");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			System.out.println("볼륨이 10을 초과했습니다");
			this.volume=RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME) {
			System.out.println("볼륨은 0보다 낮을 수 없습니다");
			this.volume = RemoteControl.MIN_VOLUME;
		} else this.volume = volume;
		System.out.println("현재 오디오 볼륨 : "+this.volume);
		
	}
	
	private int memoryVolume;
	public void setMute(boolean mute) {
		if(mute) {
			this.memoryVolume=this.volume;
			System.out.println("오디오 무음 처리합니다");
			setVolume(MIN_VOLUME);
		} else {
			System.out.println("오디오 무음 해제합니다");
			setVolume(memoryVolume);
		}
	}
	
}
