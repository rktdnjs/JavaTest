import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();
        
        if (b<45) {
            if(a==0) {
                a = 23;
                b = 60-(45-b);
                System.out.print(a+" "+b);
            }
            else{
            a = a-1;
            b = 60-(45-b);
            System.out.print(a+" "+b);
            }
        }
        
        else { //(b>=45)
            b = b-45;
            System.out.print(a+" "+b);
        }
    }
}