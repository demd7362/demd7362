package ch07.sec03.exam02;

public class Phone {
	public String color,model;
	
	public Phone(String model,String color) {
		this.model = model;
		this.color = color;
		System.out.println("Phone("+model+","+color+") 생성자 실행");
	}
}
