package ch02;

public class IfExam1 {
    public static void main(String[] args) {
        int n = args.length;
        if ( n == 0 ) {
            System.out.println("매개변수를 입력하세요");
        }
        else if ( n == 1 ) {
            System.out.println("입력된 매개변수는 "+args[0]+"입니다");
        }
        else if ( n == 2 ) {
            System.out.println("입려된 매개변수는 "+args[0]+","+args[1]+"입니다");
        } else {
            System.out.println("매개변수는 최대 2개까지만 입력됩니다.");
        }
    }
}
