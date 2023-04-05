package ch15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharacterStream2 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String str = br.readLine();
            System.out.println(str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
