package ch09;

public class CarExam {
    public static void main(String[] args) {
        Car morning = new Car( "blue","kia","morning");
        morning.showInfo();
        morning.startCar();
        morning.speedUp();
        morning.stopCar();

        Taxi taxi = new Taxi("black","bentz","E-class");
        taxi.meterOn();
        taxi.showInfo();
    }
}
