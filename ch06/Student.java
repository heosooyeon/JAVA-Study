package ch06;

public class Student {
    String name;
    int num;
    String group;

    Student() {} // 같은 클래쓰에서 재정의 하면 오버로딩이라고 함

    Student(String name , int num ) { // class 이름과 같으면 생성자라고 부름 , 리턴 타입이 없는게 특징
        this.name = name; // 전역 변수 = 매개변수
        this.num = num;
    }

    public void study() {
        System.out.println("공부하기");
    }
    public void eating() {
        System.out.println("밥먹기");
    }
    public void sleeping() {
        System.out.println("잠자기");
    }
    public void showInfo() {
        System.out.println("이름은"+name+"입니다");
    }
}
