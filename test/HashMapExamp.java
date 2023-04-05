package test;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapExamp {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
        Scanner scan = new Scanner(System.in);
        map.put("strawberry","딸기");
        map.put("banana", "바나나");
        map.put("orange", "오렌지");
        map.put("apple", "사과");
        map.put("watermelon", "수박");
        map.put("melon", "멜론");
        while (true) {
            System.out.print("무슨 과일을 원하시나요? ");
            String str = scan.next();
            if(str.equals("exit")) {
                System.out.println("끝!");
                System.exit(0);
            }
            else {
                if(map.keySet().contains(str)) {
                    System.out.println(map.get(str));
                }
                else {
                    System.out.println("이 과일은 없습니다.");
                }
            }
        }
    }
    }
