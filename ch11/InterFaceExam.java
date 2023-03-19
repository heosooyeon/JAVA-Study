package ch11;

public interface InterFaceExam {
    public static void main(String[] args) {
        Sound tv = new TV(); // tv 의 type은 Sound로 정의 가능함 , 가지고 있어서
        tv.soundUp();
        tv.soundUp();
        tv.showInfo();

    }
}
