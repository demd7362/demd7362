package ch08.sec08;

public class SmartTV implements RemoteControl,Searchable {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("티비를 켭니다");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("티비를 끕니다");
	}

	@Override
	public void search(String url) {
		// TODO Auto-generated method stub
		System.out.println(url+"을 검색합니다");
	}

	
}
