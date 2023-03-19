package ch10;

public abstract class Ship { // 추상 class
    public abstract int maxPassengers();
    public abstract int maxLuggage();

    public void showInfo() {
        System.out.println("저는 배 입니당.");
    }
}
