package ch16.sec03;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        person.action1( (x,y) -> System.out.println(x+"은 "+y+" 입니다"));

        person.action1( (x,y) -> System.out.println(x+"이 "+y+"를 그만뒀습니다"));

        person.action2( (x) -> System.out.println("\""+x+"\""+"라고 말합니다"));

        person.action2( (x) -> System.out.println("\""+x+"\""+"라고 외칩니다"));
        
        

    }
}
