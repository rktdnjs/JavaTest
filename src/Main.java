import java.util.*;

public class Main {
    public static void main(String args[]) {
        /* while 문
        for문에 비해 while문은 구조가 간단하다.
        if문처럼 조건식과 블럭{} 만으로 이루어져 있다.
        다만 while문은 조건식이 참인동안 계속 반복하는 점을 유의하자.
        */
        
        //while문 예제, 입력받은 숫자의 각 자리의 합을 구하는 프로그램.
        
        int num = 0, sum = 0;
        System.out.print("숫자를 입력해보세요 ㅎㅎ. >> ");
        
        Scanner sc = new Scanner(System.in);
        String tmp = sc.nextLine(); //화면을통해 입력받은 내용을 tmp에 저장.
        num = Integer.parseInt(tmp); //입력받은 문자열을 숫자로 변환.77
        
        System.out.printf("num=%3d%n", num); //테스트용....%3d의 경우 최소 3글자까지 공백처리를 해서 출력해주는 의미이다.
        
        while(num!=0) {
            sum += num%10; //num을 10으로 나눈 나머지를 sum에 더한다. 그렇게 계속 더한다.
            System.out.printf("sum=%3d num=%d%n", sum, num);
            
            num /= 10; //num = num / 10; num을 10으로 나눈 값을 다시 num에 저장한다.
        }
        }
    
	}