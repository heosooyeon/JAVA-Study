package ch02;
// 월을 입력받고 해당 월의 일 수를 출력
public class SwtichExam {
    public static void main(String[] args) {
        int month = Integer.parseInt(args[0]); //
        int day;
        switch (month) {
            default:
                day = 31;
                break;
            case  2:
                day = 28;
                break;
            case 4: case 6: case 9: case 11:
                day = 30;
                break;
        }
        System.out.println(month+"월의 일 수는"+day+"입니다");
    }
}
