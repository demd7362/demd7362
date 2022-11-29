package ch15.sec04.exam02;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashtableExample {

	public static void main(String[] args) {
		Map<String,Integer> hashtable = new Hashtable<>();
		
		Thread ThreadA = new Thread() {

			@Override
			public void run() {
				for(int i=0; i<1000; i++) {
					hashtable.put(String.valueOf(i), i);
				}
			}
		
		};
		
		Thread ThreadB = new Thread() {

			@Override
			public void run() {
				for(int i=1000; i<2000; i++) {
					hashtable.put(String.valueOf(i), i);
				}
			}
		
		};
		ThreadA.start();
		ThreadB.start();

		try {
		ThreadA.join();
		ThreadB.join();
		} catch (Exception e) {}
		
		System.out.println("총 Entry 수: "+ hashtable.size());
		
		for(int i=0; i<hashtable.size(); i++) {
			Set<Entry<String,Integer>> entrySet = hashtable.entrySet(); 
			System.out.println(hashtable.get(String.valueOf(i)));
		}
		
		}

}
