package ch01;
// heap 에서는 첨 부터 0 으로 초기화 됨
public class ArrayExam3 {
    public static void main(String[] args) {
        int a[]; // 처음 선언 주소 쓰레기 값
        int[] b;
        int[] c = {31,32,33};

        a = new int[4];
        b = new int[]{21,22,23,24};
        c = b; // b의 주소값을 가짐 이렇게 되면 {31,32,33} 가 free가 됨

        System.out.println(a.length);
        System.out.println(b.length);
        System.out.println(c.length);
    }
}
