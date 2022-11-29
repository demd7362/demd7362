package ch17.Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Member02 {
    private String name;
    private String job;
    public String getName() {
        return name;
    }
    public String getJob() {
        return job;
    }
    public Member02(String name, String job) {
        this.name = name;
        this.job = job;
    }
    
    
}
public class Q07 {
    public static void main(String[] args) {
        List<Member02> list = new ArrayList<>();
        list.add(new Member02("정지훈","개발자"));
        list.add(new Member02("박상혁","개발자"));
        list.add(new Member02("우진수","유튜버"));
        
        List<Member02> developers = list.stream().filter(s->s.getJob().equals("개발자")).collect(Collectors.toList());

        developers.stream().forEach(s->System.out.println(s.getName()));
    }
}
