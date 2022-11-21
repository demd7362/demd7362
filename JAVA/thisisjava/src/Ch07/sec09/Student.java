package ch07.sec09;

public class Student extends Person{
	public int StudentNo;
	public Student(String name,int StudentNo) {
		super(name);
		this.StudentNo=StudentNo;
		
		
	}
	
	public void study() {
		System.out.println("공부를 합니다");
	}
}
