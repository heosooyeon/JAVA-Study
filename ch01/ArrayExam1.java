package ch01;

public class ArrayExam1 {

    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5,6,7,8,9,10}; // a 의 주소는 stack에 있고 값은 heap 에 있음

        for ( int i = 0 ; i < a.length ; i++ )
        {
            System.out.println("a["+i+"]="+a[i]);
        }
    }
}
