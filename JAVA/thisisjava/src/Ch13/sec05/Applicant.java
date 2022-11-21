package ch13.sec05;

public class Applicant <T>{
	public T kind; // 어떤 클래스 타입 or 변수타입이든 올수있음

	public Applicant(T kind) {
		
		this.kind = kind;
	}
}
