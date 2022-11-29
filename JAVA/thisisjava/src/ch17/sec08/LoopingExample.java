package ch17.sec08;

import java.util.Arrays;

public class LoopingExample {
    public static void main(String[] args) {
        int[] intArr = {1,2,3,4,5};
        // 중간처리 메소드 peek()을 이용해서 반복처리
        // 최종처리가 없다
        Arrays.stream(intArr).filter(arr -> arr%2==0).peek((n -> System.out.println(n))); 

        System.out.println("최종처리가 없기때문에 동작하지 않는다");

        int total = Arrays.stream(intArr).filter(arr -> arr%2==0).peek((n -> System.out.println(n))).sum(); // 최종처리, 동작함 2,4
        System.out.println("총합: "+total); // 6

        Arrays.stream(intArr).filter(arr -> arr%2 == 0).forEach(n -> System.out.println(n)); //최종처리 메소드 forEach 사용, 동작함



    }
}
