package ch09.sec07.exam02;

public class HomeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Home home = new Home();
		
		home.run1();
		
		home.run2();
		
		home.run3(new RemoteControl() {

			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				System.out.println("난방을 켭니다");
			}

			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				System.out.println("난방을 끕니다");
			}
			
			
			
		});
	}

}
