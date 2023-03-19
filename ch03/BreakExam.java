package ch03;

public class BreakExam {
    public static void main(String[] args) {
        for ( int i=0 ; i<10; i++ ){
            if ( i == 5 ) {
                continue; // countinue 는 그 부분만 지나가고 감
            }
            System.out.println(i);
        }
    }
}
