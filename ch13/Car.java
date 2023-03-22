package ch13;

public class Car {
    private String name;
    private int liter;

    public Car(String name) {
        this.name = name;
    }

    public void take(int km){
        this.liter -= km/15;
    }

    public void showInfo(){
        System.out.println(name + "(차)의 남은 기름은 " + liter + "입니다.");
    }

    public int getLiter() {
        return liter;
    }

    public void setLiter(int liter) {
        this.liter = liter;
    }
}