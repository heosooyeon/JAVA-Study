package ch15.simple.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameHelper {
    public String getUserInput (String prompt){
        String inputLine;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print(prompt);
            inputLine = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return  inputLine;
    }


}
