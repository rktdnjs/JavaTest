import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        /* 79 사칙연산자
        
        */
        
        int a = 10;
        int b = 4;
        
        System.out.printf("%d+%d = %d%n", a, b, a + b);
        System.out.printf("%d -%d = %d%n", a, b, a - b);
        System.out.printf("%d * %d = %d%n", a, b, a*b);
        System.out.printf("%d / %d = %d%n", a, b, a/b);
        System.out.printf("%d / %f = %f%n", a, (float)b, a/(float)b);
        
    }
}