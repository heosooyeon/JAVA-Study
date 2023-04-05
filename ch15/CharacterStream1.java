package ch15;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class CharacterStream1 {
    public static void main(String[] args) throws IOException {
        Reader reader = new  InputStreamReader(System.in);

        try {
            int a = reader.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
