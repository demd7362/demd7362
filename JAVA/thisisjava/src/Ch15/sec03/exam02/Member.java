package ch15.sec03.exam02;

public class Member {
	public String name;
	public int age;
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return name.hashCode()+age;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) { //set 이 상위객체?
			
			Member member = (Member) obj; // 
			return member.name.equals(name) && member.age==age;
		}
		return false;
	}
	
	
}
