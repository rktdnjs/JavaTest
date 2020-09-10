import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        /* 76
        부호 연산자.
        부호 연산자는 boolean형과 char형을 제외한 기본형에만 쓸 수 있다.
        피연산자의 부호를 반대로 변경한 결과를 반환한다.
        */
        
        int i = -10;
        i = +i;
        System.out.println(i);
        
        i = -10;
        i = -i;
        System.out.println(i);
    }
}