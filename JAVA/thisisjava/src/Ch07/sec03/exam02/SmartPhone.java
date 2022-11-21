package ch07.sec03.exam02;

public class SmartPhone extends Phone{
	// public String color,model; < 상속되어있음
	
	public SmartPhone(String model,String color) {
		super(model,color); // = public Phone(String model,String color)
		
		
		System.out.println("SmartPhone("+model+","+color+") 생성자 실행");
		
	}
	
}
