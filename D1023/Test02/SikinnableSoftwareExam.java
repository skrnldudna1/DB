package study.D1023.Test02;

public class SikinnableSoftwareExam {
    public static void main(String[] args) {
        SkinnableSoftware x = new SkinnableSoftware();                 //검정
        SkinnableSoftware y = new SkinnableSoftware(Skinnable.GREEN);  //초록

        x.changeSkin(Skinnable.YELLOW);   //x의 스킨을 노랑으로 변경

        System.out.println("x의 스킨은" + x.getSkinString() + "입니다.");
        System.out.println("y의 스킨은" + y.getSkinString() + "입니다.");
    }
}

//SikinnableSoftware 클래스는 Sikinnable 인터페이스를 구현한 클래스이다.
//인수를 받지 않는 생성자는 스킨을 '검정'으로 설정하고 인수를 받는 생성자는 지정한 skin으로 스킨을 설정한다.