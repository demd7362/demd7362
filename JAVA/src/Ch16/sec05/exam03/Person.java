package Ch16.sec05.exam03;

public class Person {
    public Member getMember1(Creatable01 creatable01) {
        String id = "winter";
        Member member = creatable01.create(id);
        return member;
    }

    public Member getMember2(Creatable02 creatable02) {
        String id = "winter";
        String name="한겨울";
        Member member = creatable02.create(id,name);
        return member;
    }
}
