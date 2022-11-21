package ch15.sec07;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizedMapExample {

	public static void main(String[] args) {
		Map<Integer,String> map = Collections.synchronizedMap(new HashMap<>());
		
		Thread threadA = new Thread() {

			@Override
			public void run() {
				for(int i=0; i<1000; i++) {
					map.put(i, i+"value");
					System.out.println(Thread.currentThread()+" "+ i);
				}
			}
			
			
		};
		
		Thread threadB = new Thread() {

			@Override
			public void run() {
				for(int i=1000; i<2000; i++) {
					map.put(i, i+"value");
					System.out.println(Thread.currentThread()+" "+ i);
				}
			}
			
			
		};
		
		threadA.start();
		threadB.start();
		
		try {
		threadA.join();
		threadB.join();
		}catch (Exception e) {}
		
		System.out.println("총 객체 수 : "+ map.size());
		
		
		}
		
		}


