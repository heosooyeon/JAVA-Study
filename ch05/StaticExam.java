package ch05;

public class StaticExam {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.name = "choi";
        s2.name = "kim";
        s3.name = "lee";

        s1.showInfo();
//        Student.school = "busan";
        s3.showInfo();
        s3.showInfo();
    }
}
