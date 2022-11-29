package ch17.sec05;

import java.util.ArrayList;
import java.util.List;

public class FilteringExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("정지훈");
        list.add("정지훈");
        list.add("정지훈");
        list.add("병지훈");
        list.add("을지훈");
        list.add("갑지훈");
        list.add("병지훈");
        list.add("갑지훈");
        
        list.stream().distinct().forEach(s -> System.out.println(s));
        System.out.println("---중복요소제거---");

        list.stream().filter(s -> s.startsWith("정")).forEach(s-> System.out.println(s));
        System.out.println("---정으로 시작하는 요소만 필터링---");

        list.stream().distinct().filter(s-> s.startsWith("정")).forEach(s->System.out.println(s));
        System.out.println("---중복제거후 필터링---");
    }
}
