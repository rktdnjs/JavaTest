import java.util.*;

public class Main {
    public static void main(String args[]) {
        /* continue 문, 120page
        continue문은 반복문 내에서만 사용될 수 있으며, 반복이 진행되는 도중에 continue문을
        만나게 되면 반복문의 끝으로 이동하여 다음 반복으로 넘어간다.
        
        continue문은 반복문 전체를 벗어나지 않고 다음 반복을 계속 수행한다는 점이 break문과 다르다.
        전체 반복 중에 특정 조건을 만족하는 경우를 제외하고자 할 때 유용하다.
        */
        
        //3으로 나눠지지 않는 수들을 배열할 때.
        for(int i = 0; i <= 10; i++){
            if(i%3==0) 
                continue; //조건식이 참이 되어 continue문이 수행되면 블럭의 끝으로 이동한다. break와 달리 반복문을 벗어나지 않는다.
            System.out.println(i);
        }
        
        }
    
	}