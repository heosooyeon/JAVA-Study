package ch09;

public class Car {
    private String color;
    private String company;
    private String model;
    protected int speed;
    private char gear;
    public Car(String color , String company , String model) {
        this.color = color;
        this.company = company;
        this.model = model;
        this.gear = 'P';
    }

    public void startCar() {
        gear = 'D';
        System.out.println("start!!!");
        speed += 10;
    }

    public void stopCar() {
        while ( speed != 0 ) {
            speedDown();
        }
        gear = 'P';
        System.out.println("stop...");
    }

    public void speedUp() {
        if ( speed >= 250 ) {
            System.out.println("최고 속도 입니다.");
            return;
        }
        if ( gear != 'D' ) {
            System.out.println("현재 기어는 "+gear+"입니다.");
            return;
        }
        speed += 10;
        System.out.println("속도를 올립니다.");
    }

    public void speedDown() {
        if ( speed == 0 ) {
            System.out.println("정지한 상태입니다");
        }
        speed -=10;
        System.out.println("속도를 줄입니다.");

    }

    public void showInfo() {
        System.out.println(company +"의" + color + "의" + model + "입니다");
    }
}
