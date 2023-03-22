package ch13;

public class Subway implements Take {
    private int number;
    private int passengerCount;
    private int money;

    public Subway(int number) {
        this.number = number;
    }

    @Override
    public void take(int money) {
        this.money += money;
        this.passengerCount++;
    }

    @Override
    public void showInfo() {
        System.out.println(number + "호선의 누적 탑승 승객은 " + passengerCount + "명 이고, 수입은 " + money + "원 입니다.");
    }
}