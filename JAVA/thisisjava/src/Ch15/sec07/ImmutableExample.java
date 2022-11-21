package ch15.sec07;

import java.util.*;

public class ImmutableExample {

	public static void main(String[] args) {
		List<String> immutableList1 = List.of("A","B","C");
//		immutableList1.add("D"); //불가능
		Set<String> immutableSet1 = Set.of("A","B","C");
//		immutableSet1.remove("A") // 불가능
		Map<Integer,String> immutableMap1 = Map.of(
				1,"A",
				2,"B",
				3,"C"
				);
		//immutableMap1.put(4,"D"); //불가능
		
		// List컬렉션을 불변 컬렉션으로 복사
		List<String> al = new ArrayList<>();
		al.add("A");
		al.add("B");
		al.add("C");
		List<String> immutableAL = List.copyOf(al);
		
		// Set 컬렉션을 불변 컬렉션으로 복사
		Set<String> hs = new HashSet<>();
		al.add("A");
		al.add("B");
		al.add("C");
		Set<String> immutableHS = Set.copyOf(hs);
		
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		Map<Integer,String> immutableMap = Map.copyOf(map);
		
		String[] arr = {"A","B","C"};
		List<String> immutableArrayList = Arrays.asList(arr);
				
				
		
		
		
	}

}
