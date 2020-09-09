import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        /* 73
        연산자의 결합규칙.
        이때 단항 연산자와 대입 연산자는 진행방향이 오른쪽에서 왼쪽.
        단항 연산자의 경우  -x 일 때 x의 부호를 먼저 바꾸고, 이후 계산이 수행.
        대입 연산자의 경우  x=y=10 일때 y에 우선대입후 x에 대입이 됨.
        그 외에는 진행방향이 왼쪽에서 오른쪽.
        */
        
        int x,y;
        x=y=3;
        System.out.println("x=" + x);
        System.out.println("y=" + y);
        
    }
}