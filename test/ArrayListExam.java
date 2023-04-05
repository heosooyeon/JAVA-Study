package test;

import java.util.ArrayList;

public class ArrayListExam {
    public static void main(String[] args) {
        final int LIMIT = 10;
        String source = "1234567891593216549852315684@#$@%%$^^&#$%azzzsdfedgvg";
        int length = source.length();

        List list = new ArrayList(length / LIMIT + 10);

        for (int i = 0; i < length; i += LIMIT) {
            if (i + LIMIT < length)
                list.add(source.substring(i, i + LIMIT));
            else
                list.add(source.substring(i));
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        
    }
}
