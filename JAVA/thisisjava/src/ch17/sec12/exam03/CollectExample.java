package ch17.sec12.exam03;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<Student> totalList = new ArrayList<>();
        totalList.add(new Student("정지훈","남",90));
        totalList.add(new Student("병지순","여",50));
        totalList.add(new Student("을지훈","남",40));
        totalList.add(new Student("갑지순","여",70));
        // 평균을 구할거니 Double
        Map<String,Double> map = totalList.stream().collect(Collectors.groupingBy(
            s->s.getSex(), // key
            Collectors.averagingDouble(s->s.getScore()) // value
        ));

        System.out.println(map);
    }
}
