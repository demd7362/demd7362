package ch15.sec04.exam01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		Map<String,Integer> hashMap = new HashMap<>();
		
		hashMap.put("신용권", 85);
		hashMap.put("홍길동", 90);
		hashMap.put("동장군", 80);
		hashMap.put("홍길동", 95);
		
		System.out.println("총 Entry 수: "+hashMap.size());
		System.out.println();
		
		String key = "홍길동";
		int value = hashMap.get(key); // 95
		
		System.out.println(key+ ": " + value);
		System.out.println();

		Set<String> keySet = hashMap.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String k = keyIterator.next();
			Integer v = value;
			System.out.println(k + " : " + v);
		}
		System.out.println();
		
		Set<Entry<String,Integer>> entrySet = hashMap.entrySet();
		Iterator<Entry<String,Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Entry<String,Integer> entry = entryIterator.next();
			String k = entry.getKey();
			Integer v = entry.getValue();
			System.out.println(k + " : " + v);
			
		}
		System.out.println();
		
		
		hashMap.remove("홍길동");
		System.out.println("총 Entry 수: "+hashMap.size());
		System.out.println();
	}

}
