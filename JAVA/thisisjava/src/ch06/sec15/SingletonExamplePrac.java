package ch06.sec15;

public class SingletonExamplePrac {
	public static void main(String[] args) {
		SingletonPrac obj1 = SingletonPrac.getInstance();
		SingletonPrac obj2 = SingletonPrac.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 singleton 객체입니다");
		} else System.out.println("다른 singleton 객체입니다");
		
	}
}
