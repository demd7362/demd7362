package ch07.sec09;

public class InstanceofExample {
	public static void personInfo(Person person) { // person이 택시,버스고 personInfo가 vehicle
		System.out.println("name: "+person.name);
		person.walk();
	
	
	if(person instanceof Student) { // person 객체가 Student 타입이면 true 
		Student student = (Student) person;
		System.out.println("studentNo: "+student.StudentNo);
		student.study();
	}
	}
	
	public static void main(String[] args) {
		Person p1 = new Person("홍길동");
		personInfo(p1);
		
		System.out.println();
		
		Person p2 = new Student("김길동",10); 
		 Student student2 = new Student("정길동",15);
		 Person p3 = student2; //와 같다
		personInfo(p2);
		
		personInfo(p3);

	}

}
