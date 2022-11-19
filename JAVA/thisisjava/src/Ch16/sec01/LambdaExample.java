package Ch16.sec01;


/**
 * LambdaExample
 */
public class LambdaExample {
    public static void action(Calculable calculable) {
        // 데이터
        int x = 10;
        int y = 4;

        // 데이터 처리
        calculable.calculable(x, y);
    }

    public static void main(String[] args) {
        action((x, y) -> {
            int result = x + y;
            System.out.println("result : " + result);
        });

        action((x, y) -> {
            int result = x - y;
            System.out.println("result : " + result);
        });

        action(new Calculable(){

            @Override
            public void calculable(int x, int y) {
                // TODO Auto-generated method stub
                int result = x+y;
                System.out.println("익명구현객체 result : "+result);
            }
            
        });
        
        
    }
}