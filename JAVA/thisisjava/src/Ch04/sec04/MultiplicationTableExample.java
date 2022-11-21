package ch04.sec04;

public class MultiplicationTableExample {

	public static void main(String[] args) {
		int m,n,result;
		for(m=2; m<=9; m++) {
			System.out.println("***"+m+"단***");
		for(n=1; n<=9; n++) {
			result = m*n;
			System.out.println(m+" X "+n+" = "+result);
		}
		}

	}

}
