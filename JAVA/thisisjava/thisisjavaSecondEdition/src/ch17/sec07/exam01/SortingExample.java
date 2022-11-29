package ch17.sec07.exam01;

import java.util.*;
public class SortingExample {
    public static void main(String[] args) {
        List<Student> stdList = new ArrayList<>();
        stdList.add(new Student("정지훈",95));
        stdList.add(new Student("박상혁",30));
        stdList.add(new Student("원인수",70));

        stdList.stream().sorted().forEach(s -> System.out.println(s.getName() +" : "+s.getScore()));
        System.out.println();

        stdList.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.println(s.getName() +" : "+s.getScore())); 
        // sorted()메소드의 매개변수가 없다면 Student 객체가 Comparable을 구현하고 있어야만 한다
    }
}
