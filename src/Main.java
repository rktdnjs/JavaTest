import java.util.*;

public class Main {
    public static void main(String args[]) {
        //윤년 이면 1을 출력, 아니면 0을 출력하는 프로그램.
        Scanner sc = new Scanner(System.in);
        int A;
        A = sc.nextInt();
        
        if (A%4==0) {
            if(A%100!=0 || A%400==0) {
                System.out.print(1);
            }
            else {
                System.out.print(0);
            }
        }
        else {
            System.out.print(0);
        }
    }
}