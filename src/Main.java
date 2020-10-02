import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int A;
        A = sc.nextInt();
        
        if(90<=A) {
            System.out.print('A');
        }
        else if(80<=A) {
            System.out.print('B');
        }
        else if(70<=A) {
            System.out.print('C');
        }
        else if(60<=A) {
            System.out.print('D');
        }
        else {
            System.out.print('F');
        }
    }
}