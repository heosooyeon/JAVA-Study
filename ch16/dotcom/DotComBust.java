package ch16.dotcom;

import java.util.ArrayList;

public class DotComBust {

    private ArrayList<DotCom> dotComs = new ArrayList<DotCom>();
    private GameHelper gameHelper = new GameHelper();

    private int numOfGuess;

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame(); // grid setting
        game.startPlaying();
    }

    private void setUpGame() {
        dotComs.add( new DotCom("google.com") );
        dotComs.add( new DotCom("naver.com") );
        dotComs.add( new DotCom("kakao.com") );

        for ( DotCom dotCom : dotComs) {
            ArrayList<String> newLocation = gameHelper.placeDotCom();
            dotCom.setLocation( newLocation );
        }

        gameHelper.printAll();
    }
    private void startPlaying() {
        while ( !dotComs.isEmpty() ) {
            // user input
            String userGuess = gameHelper.getUserInput("enter a guess");

            checkUserGuess( userGuess );
        }
        finishGame();
    }

    private void finishGame() {
        if ( numOfGuess <= 18 ) {
            System.out.println("good!");
        } else {
            System.out.println("노력을 하세요");
        }
    }

    private void checkUserGuess(String userGuess) {
        numOfGuess++;
        String result = "miss";
        for (DotCom dotCom : dotComs) {
            result = dotCom.checkYourself(userGuess);
            if ( result.equals("kill") ) {
                dotComs.remove(dotCom);
                break;
            }
            else if ( result.equals("hit") ) {
                break;
            }
        }
        System.out.println(result);
    }
}
