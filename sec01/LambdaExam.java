package ch16.sec01;

//람다식
// 계산을 위한 인터페이스 정의
@FunctionalInterface
interface calculable {
    void calculate(int x, int y);
}

public class LambdaExam {
    public static void main(String[] args) {
        // 더하기 계산 람다식
        action((x, y) -> {
            int result = x + y;
            System.out.println("result: " + result);
        });

        // 빼기 계산 람다식
        action((x, y) -> {
            int result = x - y;
            System.out.println("result: " + result);
        });
    }

    // 메서드 action 정의
    public static void action(calculable calculable) {
        // 데이터
        int x = 10;
        int y = 4;
        calculable.calculate(x, y);
    }
}
