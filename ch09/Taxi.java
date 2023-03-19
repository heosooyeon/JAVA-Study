package ch09;

public class Taxi extends Car{
    private int meter;

    public Taxi(String color, String company, String model) {
        super(color, company, model);
    }

    public void meterOn() {
        System.out.println("미터기를 켭니다.");
        startCar();
        speed += 20 ;
    }
    public void meterOff() {
        System.out.println("미터기를 끕니다.");
    }
}
