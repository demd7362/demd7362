package ch06.sec08.exam02;

class Computer2 {


	public int sum(int[] arr1) {
		int sum = 0;
	for(int i=0; i<arr1.length; i++	) {
		sum += arr1[i];
	}
	return sum;
	}
}

public class Computer2Example {
	 public static void main(String[] args) {
		 Computer2 myCom = new Computer2();
		 
		 int result = myCom.sum(new int[] {1,2,3,4,5});
		 System.out.println("result: "+result);
		 
		 // ... 와 다를게없다
	}
}
