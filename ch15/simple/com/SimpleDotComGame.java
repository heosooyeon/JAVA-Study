package ch15.simple.com;

import java.util.ArrayList;

public class SimpleDotComGame {
    public static void main(String[] args) {
        GameHelper gameHelper = new GameHelper();

        SimpleDotCom simpleDotCom = new SimpleDotCom();

        ArrayList<Integer> location = new ArrayList<>();

        location.add(2);
        location.add(3);
        location.add(4);

        simpleDotCom.setLocationCells(location);

        String guess = gameHelper.getUserInput("예상 위치를 입력하세요.");
        simpleDotCom.setLocationCells(location);
        String result = simpleDotCom.checkYourself(guess);
        System.out.println(result);
    }
}
