package Ch17.Practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Member03 {
    private String name;
    private String job;
    public Member03(String name, String job) {
        this.name = name;
        this.job = job;
    }
    public String getName() {
        return name;
    }
    public String getJob() {
        return job;
    }
    @Override
    public String toString() {
        return "{name:" + name + ", job: "+job+"}";
    }
    
}
public class Q08 {
    public static void main(String[] args) {
        List<Member03> list = Arrays.asList(
            new Member03("정지훈","개발자"),
            new Member03("박상혁","개발자"),
            new Member03("우진수","유튜버")
        );

        Map<String, List<Member03>> groupingMap = list.stream().collect(Collectors.groupingBy(
            a-> a.getJob()
        ));

        System.out.println(groupingMap);
        System.out.println("------");

        System.out.println("[개발자]");
        groupingMap.get("개발자").forEach(s->System.out.println(s));

        System.out.println("[유튜버]");
        groupingMap.get("유튜버").forEach(s->System.out.println(s));
    }
}
