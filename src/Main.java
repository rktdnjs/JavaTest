import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        /* 77
        형변환 연산자(casting operator)
        서로 다른 타입 간의 연산을 수행해야 하는 경우, 연산을 수행하기 전에 타입을 일치시켜야 한다.
        변수나 리터럴의 타입을 다른 타입으로 변환하는 것을 형변환이라고 한다.
        (타입)피연산자
        이때 사용되는 괄호는 '캐스트 연산자' 또는 '형변환 연산자'라고 한다.
        */
        
        double d = 97.4;
        int score = (int) d;
        System.out.println("score=" + score);
        System.out.println("d=" + d);
        
        //출력한 후에도 피연산자 d에는 변화값이 없다.
    }
}