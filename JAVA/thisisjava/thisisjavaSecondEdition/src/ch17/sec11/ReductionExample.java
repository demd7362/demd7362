package ch17.sec11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ReductionExample
 */
public class ReductionExample {

    public static void main(String[] args) {
        List<Student> stdList = new ArrayList<>(Arrays.asList(
            new Student("정지훈",10),
            new Student("원인수",40),
            new Student("박상혁",30)
        ));
        // new ArrayList<>(Arrays.asList())가 아닌 Arrays.asList()의 경우 아래의 값을 추가할 수 없다
        stdList.add(new Student("우진수",20)); 
        int sum1 = stdList.stream().mapToInt(Student::getScore).sum();
        System.out.println("sum1: "+sum1);

        int sum2 = stdList.stream().map(Student::getScore).reduce(0, (a,b)->a+b); // 0 = 디폴트값
        System.out.println("sum2: "+sum2);
    }
}