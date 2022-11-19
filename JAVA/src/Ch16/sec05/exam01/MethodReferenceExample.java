package Ch16.sec05.exam01;

public class MethodReferenceExample {
    public static void main(String[] args) {
        Person person = new Person();
        
        person.action((x,y) -> Computer.staticMethod(x,y));
        //메소드 참조
        person.action(Computer::staticMethod); 
        // 불필요한 매개변수 제거 , :: 
        
        //인스턴스 메소드일경우
        Computer com = new Computer();
        //람다식
        person.action( (x,y) -> com.instanceMethod(x,y));
        //메소드 참조
        person.action(com :: instanceMethod);
    }   // 불필요한 매개변수 제거 , :: 
}
