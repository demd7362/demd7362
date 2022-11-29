package ch12.sec12;

import java.lang.reflect.Method;

public class PrintAnnotationExample {

	public static void main(String[] args) throws Exception {
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		for(Method method : declaredMethods) {
			//PrintAnnotation 얻기
			PrintAnnotation printAnnotation = 
					method.getAnnotation(PrintAnnotation.class);
			//설정 정보를 이용해서 선 출력
			printLine(printAnnotation);
			
			method.invoke(new Service());
			//설정 정보를 이용해서 선 출력
			printLine(printAnnotation);
		}
	}
	
	public static void printLine(PrintAnnotation printAnnotation) {
		if(printAnnotation != null) {
			int number = printAnnotation.number();
			for(int i=0; i<number; i++) {
				String value = printAnnotation.value();
				System.out.print(value); // 넘버만큼 밸류 반복
			}
			System.out.println();
		}
	}

}
