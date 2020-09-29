import java.util.*;

public class Main {
    public static void main(String args[]) {
        /* while 문
        for문에 비해 while문은 구조가 간단하다.
        if문처럼 조건식과 블럭{} 만으로 이루어져 있다.
        다만 while문은 조건식이 참인동안 계속 반복하는 점을 유의하자.
        */
        
        //while문 예제, 1부터 몇까지 더해야 100을 넘지 않는가?
        int sum = 0;
        int i = 0;
        
        while (sum <= 100) {
            System.out.printf("%d - %d%n", i, sum);
            sum += ++i; //sum 과 증가된 i를 계속해서 더한다.
        }
        
        }
    
	}