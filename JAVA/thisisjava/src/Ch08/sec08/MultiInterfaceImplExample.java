package ch08.sec08;

public class MultiInterfaceImplExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rc = new SmartTV();
		
		rc.turnOn();
		rc.turnOff();
		
		Searchable searchable = new SmartTV();
		searchable.search("https://youtube.com");
	}

}
