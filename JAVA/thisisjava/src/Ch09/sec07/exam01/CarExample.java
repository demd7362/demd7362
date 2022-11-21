package ch09.sec07.exam01;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		
		car.run();
		
		car.run2();
		
		car.run3(new Tire() {

			@Override
			public void roll() {
				// TODO Auto-generated method stub
				System.out.println("익명 자식 Tire3 객체가 굴러갑니다");
			}
			
			
			
			
		});
	}

}
