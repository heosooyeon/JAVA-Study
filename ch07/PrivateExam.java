package ch07;

public class PrivateExam {
    public static void main(String[] args) {
        Student s1 = new Student(123,"choi");
        Student s2 = new Student(123,"choi");
        Student s3 = new Student(123,"choi");

        s1.setName("im");

         System.out.println(Student.getCount());
    }
}
