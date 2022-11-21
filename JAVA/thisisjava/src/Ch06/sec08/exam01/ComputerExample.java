package ch06.sec08.exam01;

class Computer {

	int sum(int ...values) {
		int sum = 0;
		
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}
	
public class ComputerExample {
	public static void main(String[] args) {
		Computer myCom = new Computer();
		
		int result1 = myCom.sum(1,2,3,4); // = {1,2,3,4}
		System.out.println("result1 : "+ result1);
		
		int result2 = myCom.sum(1,2,3,4,5,6); // = {1,2,3,4,5,6}
		System.out.println("result2 : "+result2);
		
		int[] values = new int[5]; // = {0,0,0,0,0}
		int result3 = myCom.sum(values); 
		System.out.println("result3 : "+result3);
		
		int result4 = myCom.sum(new int[] {1,2,3,4,5,6,7,8}); // = {1,2,3,4,5,6,7,8}
		System.out.println("result4 : "+ result4);
	}
}


