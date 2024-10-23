package study.D1023.Test02;

//스킨을 변경하는 Skinnable 인터페이스를 구현

public interface Skinnable {
    int BLACK = 0;
    int RED = 1;
    int GREEN = 2;
    int BLUE = 3;
    int YELLOW = 4;
    void changeSkin(int skin);  //★스킨 변경
}
