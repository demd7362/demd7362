package ch07.sec04.exam01;

public class Computer extends Calculator {

	@Override
	public double areaCircle(double r) { // 접근제한자는 낮춰도 상관없다 높이면 안됨
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r *r; 
		// super.areaCircle(r); 부모 객체의 값을 리턴
	}
	
}
