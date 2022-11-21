package ch12.sec11.exam02;

import java.lang.reflect.*;

public class ReflectionExample {
	public static void printParameters(Class[] parameters) {
		for(int i =0; i<parameters.length; i++) {
			System.out.print(parameters[i].getName());
			if(i<(parameters.length-1)) {
				System.out.print(",");
			}
		}
	}
	
	
	public static void main(String[] args) {
		Class cls = Car.class;
		
		System.out.println("[생성자 정보]");
		Constructor[] constructors = cls.getDeclaredConstructors(); // 생성자 정보 읽기
		
		for(Constructor constructor : constructors) { // 생성자 배열에 들어간 생성자 정보를 
			// 생성자  타입의 컨스트럭터에 넣어서 하나하나씩 찍어본다
			System.out.print(constructor.getName()+"(");
			Class[] parameters = constructor.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}
		System.out.println();
		
		System.out.println("[필드 정보]");
		Field[] fields = cls.getDeclaredFields();
		for(Field field : fields) {
			System.out.println(field.getType().getName()+" "+field.getName());
		}
		System.out.println();
		
		System.out.println("[메소드 정보]");
		Method[] methods = cls.getDeclaredMethods();
		for(Method method : methods) {
			System.out.print(method.getName()+"(");
			Class[] parameters = method.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}
		

	}

}
