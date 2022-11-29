package ch16.sec04;

/**
 * LambdaExample
 */
public class LambdaExample {
    public static double sum(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        Person person = new Person();

        person.action((x, y) -> {
            double result = x + y;
            return result;
            // calc의 리턴타입이 double
        });

        person.action( (x,y) -> (x+y) );

        person.action( (x,y) -> sum(x,y));
    }
}