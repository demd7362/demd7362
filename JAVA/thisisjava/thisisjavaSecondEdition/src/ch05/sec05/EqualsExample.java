package ch05.sec05;

public class EqualsExample {

	public static void main(String[] args) {
		String strVar1 = "홍길동";
		String strVar2 = "";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 같은 주소를 참조한다. 같은 리터럴");
		} else System.out.println("strVar1과 strVar2는 다른 주소를 참조한다. 다른 리터럴");
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 같은 문자열 값을 비교한다. 같은 문자열");
		} else System.out.println("strVar1과 strVar2는 다른 문자열입니다.");
		
		
		String strVar3 = new String("홍길동");
		String strVar4 = new String("");
		
		if(strVar3==strVar4) {
			System.out.println("strVar3와 strVar4는 같은 주소를 참조한다. 같은 생성자 매개값");
		} else System.out.println("strVar3와 strVar4는 다른 주소를 참조한다. 다른 생성자 매개값");
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3와 strVar4는 같은 문자열을 값을 비교한다. 같은 생성자 매개값");
		} else System.out.println("strVar3와 strVar4는 다른 문자열입니다.");
	}

}
