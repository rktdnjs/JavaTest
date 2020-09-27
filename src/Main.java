import java.util.*;

public class Main {
    public static void main(String args[]) {
        /* while 문
        for문에 비해 while문은 구조가 간단하다.
        if문처럼 조건식과 블럭{} 만으로 이루어져 있다.
        다만 while문은 조건식이 참인동안 계속 반복하는 점을 유의하자.
        */
        
        //지금까지 배워온 for과 while을 이용하여 입력한 숫자만큼 별이 입력되고 끝나는 프로그램을 만들어봄.
        
        int count;
        System.out.print("숫자 하나를 입력해주세요 >^< >>");
        Scanner sc = new Scanner(System.in);
        count = sc.nextInt();
        
        while(count > 0) {
            for (int i = count; i>0; i--) {
                System.out.print("*");
            }
            System.out.println();
            count--;
        }
        
        
        }
    
	}