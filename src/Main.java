import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, sum;
        sum = 0;
        n = sc.nextInt();
        for(int i=1; i<=n; i++) {
            sum = sum + i; 
        }
        
        System.out.print(sum);
    }
}