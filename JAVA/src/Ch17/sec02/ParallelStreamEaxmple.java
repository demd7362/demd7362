package Ch17.sec02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamEaxmple {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for(int i=0; i<1000000; i++){
            list.add(String.valueOf(i));
        }
        long a = System.currentTimeMillis();
        Stream<String> parallelStream = list.parallelStream(); // list.stream()과 다르다는점. 병렬처리를 하는 스트림임.
        parallelStream.forEach( name -> {
            System.out.println(name+": "+ Thread.currentThread().getName());
        });
        long b = System.currentTimeMillis();
        System.out.println("걸린 시간: "+(b-a)/1000+"초");
    }
}
