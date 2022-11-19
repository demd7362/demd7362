package Ch17.sec03;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineExample {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
            new Student("홍길동",10),
            new Student("정지훈",80),
            new Student("커즈워터",90),
            new Student("박상혁",50)
        );

        Collections.sort(list, new Comparator<Student>(){

            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getScore() < o2.getScore() ){
                    return 1;
                } else if(o1.getScore() == o2.getScore()) {
                    return 0;
                } else return -1;
            }
            
        });

        list.stream().forEach(s -> System.out.println(s.getName()+" : "+s.getScore()));
        
        // 내림차순 정렬, 스트림으로 요소 꺼내기
        
        
        // 방법1

        Stream<Student> studentStream = list.stream();

        // 중간처리

        IntStream scoreStream = studentStream.mapToInt(student -> student.getScore());

        // 최종 처리
        double avg = scoreStream.average().getAsDouble();

        System.out.println(avg);

        // 방법2

        double avg2 = list.stream().mapToInt(student -> student.getScore()).average().getAsDouble();

        System.out.println(avg2);
    }
}
