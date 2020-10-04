import java.util.*;

public class Main {
    public static void main(String args[]) {
        //입력되는 숫자, 즉 점의 위치에 따라 사분면을 출력하는 프로그램.
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        
        if (a>0 && b>0) {
            System.out.print('1');
        }
        else if (a<0 && b>0) {
            System.out.print('2');
        }
        else if(a<0 && b<0) {
            System.out.print('3');
        }
        else {
            System.out.print('4');
        }
    }
}