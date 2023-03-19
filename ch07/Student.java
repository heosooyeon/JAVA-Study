package ch07;

public class Student {
    private int num;
    private String name;

    private static int cnt;

    public Student() {}

    public Student(int num, String name) {
        this.num = num;
        this.name = name;
        cnt++;
    }

    public void eating() {
        System.out.println("밥먹기");
    }

    public void studing() {
        System.out.println("스터디하기");
    }

    public static int getCount() {
        return cnt;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public static int getCnt() {
        return cnt;
    }

}
