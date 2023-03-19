package ch01;

public class ArrayExam2 {
    public static void main(String[] args) {
        String[] str = new String[3]; // String 같이 대문자로 시작하는거는 참조형임
        str[0] = "hello"; // 그래서 heap 에는 값이 아닌 hello 가 저장된 주소가 있음
        str[1] = "Java";
        str[2] = "World";

        for (String s : str) {
            System.out.println(s);
        }
    }
}
