package Ch16.practice;

public class Q06 {
    @FunctionalInterface
    public static interface Func{
        double apply(double x,double y);
    }
    public static double cal(Func func){
        double x = 10;
        double y = 4;
        return func.apply(x,y);
    }
    

    public static void main(String[] args) {
        double result = cal( (x,y) -> (x/y) );
        System.out.println("result: "+result);
    }
    
}
