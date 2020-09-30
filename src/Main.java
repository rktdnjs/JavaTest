import java.util.*;

public class Main {
    public static void main(String args[]) {
        /* break문 119page
        반복문에서도 break문을 쓸 수 있는데, break문은 자신이 포함된 가장 가까운 반복문을 벗어난다.
        주로 if문과 함께 사용되어 특정 조건을 만족할 때 반복문을 벗어나게 한다.
        */
        
        //몇까지 더해야 100을 넘지 않는가?
        int sum = 0;
        int i =0;
        
        while (true) { //여기서 sum의 값이 100이 넘어서 break문이 실행 될 시 while문을 벗어난다.
            if (sum > 100)
                break;
            ++i;
            sum += i; // sum = sum + i
        }
        System.out.println("i=" + i);
        System.out.println("sum=" + sum);
        
        }
    
	}