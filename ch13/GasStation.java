package ch13;

public class GasStation {
    private String address;
    private int liter; //가진 총 량
    private int money;

    public GasStation(String address) {
        this.address = address;
        this.liter = 30;
    }

    public int oiling(Car car, int liter) {
        if (this.liter < liter){
            System.out.println("주유소 기름이 부족합니다.");
            return 0;
        }
        this.liter -= liter;
        this.money += 1600 * liter;
        car.setLiter(liter);
        return 1600 * liter;
    }

    public void showInfo(){
        System.out.println(address + "지점의 수입은 " + money + "원 이고, 남은 기름의 총 량은 " + liter + "L입니다.");
    }
}