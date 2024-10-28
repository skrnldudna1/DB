package src.Yes_Static;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("A");
        System.out.println(p1.population);    // 1

        Person p2 = new Person("A");
        System.out.println(p2.population);    // 2

        Person p3 = new Person("A");
        System.out.println(p3.population);    // 3

        //유지 되기 때문에 값이 증가한다.
        //ex. 은행 이자율

    }
}
