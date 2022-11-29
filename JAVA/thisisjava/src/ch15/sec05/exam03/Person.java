package ch15.sec05.exam03;

public class Person implements Comparable<Person> {
	public String name;
	public int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Person o) {
		if(o.age>age) return -1;
		else if(o.age==age) return 0;
		else return 1;
	}
	
	
}
