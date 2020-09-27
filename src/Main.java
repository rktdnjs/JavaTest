import java.util.*;

public class Main {
    public static void main(String args[]) {
        /* 중첩 for 문
        중첩 for문의 중첩 횟수는 거의 제한이 없다.
        별 찍기로 설명하기 아주 좋다.
        */
        
        //10개의 별 5줄로 찍기 ver.1
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        }
	}