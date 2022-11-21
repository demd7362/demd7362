package ch15.sec02.exam01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<Board> al = new ArrayList<>();
		
		al.add(new Board("제목1","내용1","글쓴이1"));
		al.add(new Board("제목2","내용2","글쓴이2"));
		al.add(new Board("제목3","내용3","글쓴이3"));
		al.add(new Board("제목4","내용4","글쓴이4"));
		al.add(new Board("제목5","내용5","글쓴이5"));
		
		int size = al.size();
		
		System.out.println("총 객체 수: "+size);
		System.out.println();
		
		Board boardIndexTwo = al.get(2);
		
		System.out.println(boardIndexTwo.getSubject()+"\t"+boardIndexTwo.getContent()+"\t"+boardIndexTwo.getWriter());
		System.out.println();
		
		for(int i=0; i<al.size(); i++) {
			Board b = al.get(i);
			
			System.out.println(b.getSubject()+"\t"+b.getContent()+"\t"+al.get(i).getWriter());
		}
		System.out.println();
		
		al.remove(2);
		al.remove(2);
		
		System.out.println("총 객체 수: "+al.size());
		
		for(Board b : al) {
			System.out.println(b.getSubject()+"\t"+b.getContent()+"\t"+b.getWriter());
		}
		
	}

}
