import java.util.*;

public class Main {
    public static void main(String args[]) {
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