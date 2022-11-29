package ch17.sec06.exam02;

import java.util.Arrays;

/**
 * MapExample
 */
public class MapExample {

    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5};
        
        Arrays.stream(intArray).asDoubleStream().forEach(d -> System.out.println(d)); // mapToDouble?
        System.out.println();

        Arrays.stream(intArray).boxed().forEach(d-> System.out.println(d.intValue()));
            
        
    }
}