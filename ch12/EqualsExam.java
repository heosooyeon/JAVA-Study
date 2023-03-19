package ch12;

public class EqualsExam {
    public static void main(String[] args) {
        String str1 = "busan"; // 문자는 따로 관리함 리터널로 ?
        String str2 = "busan";
        System.out.println(str1 == str2); // true
        System.out.println(str2.equals(str2)); // true
        String str3 = new String("meister");
        String str4 = new String("meister");
        System.out.println(str3 ==str4); // false  -> new keyword를 사용해서 하면 객체 생성되서 그런거임
        System.out.println(str3.equals(str4)); // ture 값만 비교하는거

        Student s1 = new Student(123,"choi");
        Student s2 = new Student(123,"choi");

        System.out.println(s1 == s2); // true
    }
}
