import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        /* 73
        연산자의 결합규칙.
        증감 연산자는 피연산자의 값을 1증가 또는 감소시킨다.
        증감 연산자는 피연산자의 어디에 위치하느냐에 따라 살짝 다른데
        피연산자의 왼쪽이면 전위형(prefix), 오른쪽이면(postfix)
        전위형 : 값이 참조되기 전에 증가.   j=++i
        후위형 : 값이 참조된 후에 증가.     j=i++
        */
        
        int i=5;
        int j=0;
        
        j=i++;
        System.out.println("j=i++; 실행 후, i=" + i +", j="+ j);
        
        i=5; // 결과를 비교하기 위해, i와j의 값을 다시 5와0으로 변경
        j=0;
        
        j=++i;
        System.out.println("j=++i; 실행 후, i=" + i +", j="+ j);
        
    }
}