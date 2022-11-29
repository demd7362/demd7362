package ch13.sec05;

public class Course {
	public static void registerCourse1(Applicant <?> applicant) { 
		// 매개변수타입 클래스, 어떤 클래스든 올수있음
		System.out.println(applicant.kind.getClass().getSimpleName()+"이(가) course1을 등록함");
	}
	public static void registerCourse2(Applicant <? extends Student> applicant) {
		// 매개변수타입 클래스, Student 상속받는놈만 올수있음
		System.out.println(applicant.kind.getClass().getSimpleName()+"이(가) course2을 등록함");
	}
	public static void registerCourse3(Applicant <? super Worker> applicant) {
		// 매개변수타입 클래스 , Worker와 Worker 부모만 올수있음
		System.out.println(applicant.kind.getClass().getSimpleName()+"이(가) course3을 등록함");
	}
}
