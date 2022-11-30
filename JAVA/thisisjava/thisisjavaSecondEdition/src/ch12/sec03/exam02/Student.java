package ch12.sec03.exam02;

public class Student {
	private int no;
	private String name;
	
	public int getNo() {
		return no;
	}

	public String getName() {
		return name;
	}

	public Student(int no,String name) {
		this.no=no;
		this.name=name;
	}

	@Override
	public int hashCode() {
		int hashCode = no + name.hashCode();
		System.out.println(hashCode);
		return hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student target) {
			if(no==target.getNo() && name.equals(target.getName())) {
				return true;
			}
		}
		return false;
	}
	
	
}