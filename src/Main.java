import java.util.*;

public class Main {
    public static void main(String args[]) {
        /* do while 문, 118page
        do-while문은 while문의 변형으로, 기본적인 구조는 while문과 같으나 조건식과 블럭{}의 순서를 바꿔놓은것이다.
        그래서 while문과 반대로 블럭{}을 먼저 수행한 후에 조건식을 평가한다.
        do-while은 최소한 한번은 블럭이 수행된다.
        
        그리많이 쓰이지는 않지만 반복적으로 사용자의 입력을 받아서 처리할 때 유용하다.
        */
        
        int input = 0, answer = 0;
        
        answer = (int)(Math.random()*100) + 1; //1~100사이의 임의의 수를 저장, 원래 범위는 0<=Math.random<1이다. 계산하면 1<=Math.random<101이므로 1~100.
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.print("1과 100사이의 정수를 입력해보세요!! >>");
            input = sc.nextInt();
            
            if (input > answer) {
                System.out.println("더 작은수로 다시 시도해보세요.");
            } else if (input < answer) {
                System.out.println("더 큰 수로 다시 시도해보세요.");
            }
        } while(input!=answer);
        
        System.out.println("정답입니다!! 짞짞짞 ^-^");
        }
    
	}