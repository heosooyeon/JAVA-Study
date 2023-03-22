package ch13;

public class Person {
    private String name;
    private int money;
    private boolean transfer;

    public Person(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void takeSubway(Subway subway) {
        if (this.money < 1300){
            System.out.println("잔액이 부족합니다.");
            return;
        }
        subway.take(1300);
        this.money -= 1300;
        this.transfer = true;
    }

    public void takeBus(Bus bus7_2) {
        if (this.transfer){
            if(this.money < 200){
                System.out.println("잔액이 부족합니다.");
                return;
            }
            bus7_2.take(200);
            this.money -= 200;
        }else {
            System.out.println("환승을 하지 않았습니다.");
        }
    }

    public void showInfo() {
        System.out.println(name + "님의 남은 잔액은 " + money + "원 입니다.");
    }
    public void take(Object obj){
        if (obj instanceof Subway) {
            takeSubway((Subway) obj);
        } else if (obj instanceof Bus){
            takeBus((Bus) obj);
        }
    }

    public void oiling(Car car, GasStation gasStation, int liter){
        this.money -= gasStation.oiling(car, liter);
    }

    public void takeCar(Car car, int km) {
        if (car.getLiter() < km/15) {
            System.out.println("기름이 모자랍니다.");
            return;
        }
        car.take(km);
    }
}