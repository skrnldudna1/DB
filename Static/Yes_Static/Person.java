package src.Yes_Static;

public class Person {

    String name;
    static int population;       //static 추가(프로그램 끝날때까지 값을 가지고 있다. / 프로그램이 종료될때 까지 값을 유지함.)지역변수

    public Person(String name) {
        this.name = name;
        population++;           //값 증가
    }
}
