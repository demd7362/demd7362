package ch16.sec04;

public class Person {
    void action(Calculable calculable){
        double sum = calculable.calc(10,4);
        System.out.println("결과: "+sum);
    }
}
