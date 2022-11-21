package ch15.sec03.exam03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> hashset = new HashSet<>();
		hashset.add("Java");
		hashset.add("JDBC");
		hashset.add("JSP");
		hashset.add("Java");
		hashset.add("Spring");
		
		Iterator<String> iterator = hashset.iterator();
		
		while(iterator.hasNext()) {
			String element = iterator.next();
			
			System.out.println(element);
			
			if(element.equals("JSP")) {
				
				iterator.remove();
			}
		}
		System.out.println();
		
		
	
		
		
		hashset.remove("JDBC");

		for(String str : hashset) {
			System.out.println(str);
		}
	}

}
