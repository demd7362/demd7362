package Ch17.sec13;

import java.util.*;

public class ParallelExample {
    public static void main(String[] args) {
        Random rd = new Random();

        List<Integer> scores = new ArrayList<>();
        for (int i = 0; i < 100000000; i++) {
            scores.add(rd.nextInt(101));
        }

        double avg = 0.0;
        long startTime = 0;
        long endTime = 0;
        long time = 0;

        // 일반 스트림으로 처리
        startTime = System.currentTimeMillis();
        avg = scores.stream().mapToInt(i -> i.intValue()).average().getAsDouble();
        endTime = System.currentTimeMillis();
        time = endTime - startTime;
        System.out.println("avg: " + avg + ", 일반 스트림 처리 시간: " + time + "ms");

        startTime = System.currentTimeMillis();
        avg = scores.parallelStream().mapToInt(i -> i.intValue()).average().getAsDouble();
        endTime = System.currentTimeMillis();
        time = endTime - startTime;
        System.out.println("avg: " + avg + ", 병렬 스트림 처리 시간: " + time + "ms");

        // 컬렉션에 전체 요소의 수가 적고 요소당 처리 시간이 짧으면 일반 스트림이 병렬 스트림보다 빠를 수 있다. 또는 cpu 코어의 수가 많을수록 효율이 증가한다.
    }
}
