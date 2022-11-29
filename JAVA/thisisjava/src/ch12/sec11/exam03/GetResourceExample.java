package ch12.sec11.exam03;

public class GetResourceExample {

	public static void main(String[] args) {
		Class cls = Car.class;
		
		String photo1Path = cls.getResource("photo1.jpg").getPath();
		String photo2Path = cls.getResource("images/photo2.jpg").getPath();
		
		System.out.println(photo1Path);
		System.out.println(photo2Path);
		
	}

}
