package ch09.sec07.exam01;

public class Car {
	private Tire tire1 = new Tire();
	
	private Tire tire2 = new Tire() {
		public void method() {
			System.out.println("tire2 method실행");
		}
		
		
		
		@Override
		public void roll() {
			// TODO Auto-generated method stub
			System.out.println("익명 자식 Tire1 객체가 굴러갑니다");
		}
		
	};
	
	public void run() {
		tire1.roll();
		tire2.roll();
//		tire2.method(); 객체의 오버라이드된 메소드만 실행됨
	}
	
	public void run2() {
		Tire tire = new Tire() {

			@Override
			public void roll() {
				// TODO Auto-generated method stub
				System.out.println("익명 자식 Tire2 객체가 굴러갑니다");
			}
			
		};
		tire.roll();
	}
	
	public void run3(Tire tire) {
	tire.roll();	
	}
}
