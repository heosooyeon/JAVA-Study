package ch05;

public class Student {
    int num;
    String name;
    final static String school= "BSSM";

    public void showInfo() {
        System.out.println("이름은"+name+"입니다.");
        System.out.println("학교는"+school+"입니다.");
        System.out.println("학번은"+num+"입니다.");
    }
}
