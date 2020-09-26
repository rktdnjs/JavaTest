import java.text.BreakIterator;
import java.util.*;

public class Main {
    public static void main(String args[]) {
        /* Math.random(), 임의의 정수만들기
        임의의 수를 얻기 위해서는 Math.random()을 사용해야 하는데
        이 메서드는 0.0과 1.0사이의 범위에 속하는 하나의 double값을 반환한다.
        범위는 0.0 <= Math.random() < 1.0
        요리조리 곱하고 int형으로 반환하고 각 변에 숫자를 더하는 등의 조작을 해주면
        임의의 정수 값을 얻어낼 수 있다.
        예제 만들기
        */
        
        //임의의 정수를 출력하는 프로그램.
        
        int num = 0;
        
        // 괄호{}안의 내용을 5번 반복한다.
        for (int i = 1; i <= 5; i++) {  //i의 값을 1부터 시작해서 후위형으로 1씩 증가시킨다. i값이 최종적으로는 6이된다.
            num = (int) (Math.random()*6) +1; // 1 <= (Math.random()*6) + 1< 7
            System.out.println(num);
        }
        
        }
	}