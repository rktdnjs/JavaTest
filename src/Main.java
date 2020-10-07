import java.util.*;

//각 테스트 케이스 마다 A+B를 출력한다.
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T, A, B;
        T = sc.nextInt(); //시도하는 횟수
        for(int i=1; i<=T; i++ ) {
            A = sc.nextInt();
            B = sc.nextInt();
            System.out.println(A+B);
        }
    }
}