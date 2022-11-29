package ch13.sec03.exam01;

public class GenericExample {
	public static <T> Box<T> boxing(T t){
		Box<T> box = new Box<>(); // 객체 생성자 메소드
		box.setT(t); //생성자
		return box;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<Integer> box1 = boxing(100); // boxing 메소드 사용
		int intValue = box1.getT();
		System.out.println(intValue);
		
		Box<String> box2 = boxing("1000"); // boxing 메소드 사용
		String strValue = box2.getT();
		System.out.println(strValue);
	}

}
