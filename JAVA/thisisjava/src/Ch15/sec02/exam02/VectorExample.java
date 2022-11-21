package ch15.sec02.exam02;

import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		List<Board> vector = new Vector<>();
		
		Thread threadA = new Thread() {

			@Override
			public void run() {
				for(int i=0; i<1000; i++) {
					vector.add(new Board("제목"+i,"내용"+i,"글쓴이"+i));
				}
			}
			
		};
		Thread threadB = new Thread() {

			@Override
			public void run() {
				for(int i=1000; i<2000; i++) {
					vector.add(new Board("제목"+i,"내용"+i,"글쓴이"+i));
				}
			}
			
		};
		threadA.start();
		threadB.start();
		try {
		threadA.join(); // n,w?
		threadB.join();
		} catch (Exception e) {}
		
		int size = vector.size();
		
		System.out.println("총 객체 수: "+vector.size());
		
		System.out.println();
		Board b;
		for(int i=0; i<size; i++) {
			b = vector.get(i);
			System.out.println(b.getContent()+"\t"+b.getSubject()+"\t"+b.getWriter());
		}
	
	
	}

}
