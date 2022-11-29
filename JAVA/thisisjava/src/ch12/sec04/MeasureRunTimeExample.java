package ch12.sec04;

public class MeasureRunTimeExample {

	public static void main(String[] args) {
		long time1 = System.currentTimeMillis(); // 1970/1/1부터 지금까지 걸린시간
		long sum = 0 ;
		for(long i = 0 ; i<900000; i++) {
			sum += i;
		}
		long time2= System.currentTimeMillis(); // 1970/1/1부터 위의 연산까지 다하는데까지의 걸린시간
		System.out.println(time1 +","+time2);
		System.out.println("1~1000000까지의 합: "+sum);
		System.out.println("계산에 "+(time2-time1)*0.001+"초가 소요되었습니다");
		
	}

}
