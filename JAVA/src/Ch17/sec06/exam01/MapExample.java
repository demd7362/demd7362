package Ch17.sec06.exam01;

import java.util.ArrayList;
import java.util.List;

public class MapExample {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("홍길동",85));
        list.add(new Student("홍길동",92));
        list.add(new Student("홍길동",87));

        list.stream().mapToDouble(s -> s.getScore()).forEach(s -> System.out.println(s));
    }
}
