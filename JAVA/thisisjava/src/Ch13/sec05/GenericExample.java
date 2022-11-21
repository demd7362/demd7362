package ch13.sec05;

public class GenericExample {

	public static void main(String[] args) {
		Course.registerCourse1(new Applicant<Person>(new Person())); 
		// 와일드카드 범위 안의 클래스, Applicant에서 지정한 범위(어떤 클래스든) 객체 생성
		Course.registerCourse1(new Applicant<Worker>(new Worker()));
		Course.registerCourse1(new Applicant<Student>(new Student()));
		Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));
		Course.registerCourse1(new Applicant<HighStudent>(new HighStudent()));
		System.out.println(); 
		
//		Course.registerCourse2(new Applicant<Person>(new Person()));
//		Course.registerCourse2(new Applicant<Worker>(new Worker()));
		Course.registerCourse2(new Applicant<Student>(new Student()));
		Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));
		Course.registerCourse2(new Applicant<HighStudent>(new HighStudent()));
		System.out.println();
		
		Course.registerCourse3(new Applicant<Person>(new Person()));
		Course.registerCourse3(new Applicant<Worker>(new Worker()));
//		Course.registerCourse3(new Applicant<Student>(new Student()));
//		Course.registerCourse3(new Applicant<MiddleStudent>(new MiddleStudent()));
//		Course.registerCourse3(new Applicant<HighStudent>(new HighStudent()));
		System.out.println();
		

	}

}
