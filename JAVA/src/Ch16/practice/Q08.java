package Ch16.practice;

interface Function<T> {
    double apply(T t);
}

class Student {
    private String name;
    private int englishScore;
    private int mathScore;

    public Student(String name, int englishScore, int mathScore) {
        this.name = name;
        this.englishScore = englishScore;
        this.mathScore = mathScore;
    }

    public String getName() {
        return name;
    }

    public int getEnglishScore() {
        return englishScore;
    }

    public int getMathScore() {
        return mathScore;
    }

}

public class Q08 {
    private static Student[] students = {
            new Student("홍길동", 90, 96),
            new Student("정지훈", 95, 93)
    };

    public static double avg(Function<Student> function) {
        int sum = 0;
        for (Student student : students) {
            sum += function.apply(student);
        }
        double avg = (double) sum / students.length;
        return avg;
    }

    public static void main(String[] args) {
        double englishAvg = avg(Student::getEnglishScore);
        System.out.println("영어 평균 점수 : "+englishAvg);

        double mathAvg = avg( s -> s.getMathScore());
        System.out.println("수학 평균 점수 : "+mathAvg);
    }
}
