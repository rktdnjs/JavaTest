import java.util.*;

public class Main {
    public static void main(String args[]) {
        /* while 문
        for문에 비해 while문은 구조가 간단하다.
        if문처럼 조건식과 블럭{} 만으로 이루어져 있다.
        다만 while문은 조건식이 참인동안 계속 반복하는 점을 유의하자.
        */
        
        //1~10까지의 정수를 출력하기
        for(int i=1; i<=10; i++) {
            System.out.println(i); //for문 버전
        }
        
        int i=1; //초기화
        
        while(i<=10) {
            System.out.println(i);
            i++; //증감식을 따로 써줌.
        }
        
        }
	}