import java.text.BreakIterator;
import java.util.*;

public class Main {
    public static void main(String args[]) {
        /* 이름붙은 반복문, 122page
        break는 근접한 단 하나의 반복문만 벗어날 수 있기 때문에, 여러개의 반복문이 중첩된 경우에는
        break문으로 중첩 반복문을 완전히 벗어날 수 없다. 이럴 때는 중첩 반복문 앞에 이름을 붙이고 break문과 continue문에 이름을
        지정해 줌으로써 하나 이상의 반복문을 벗어나거나 반복을 건너뛸 수 있다.
        */
        
        //for 문의 이름은 Loop1 이라 지정.
        //구구단 출력 프로그램.
        //출력할 때 2*1 ~ 9*9까지 나온다.
        //곱하는 수가 10이 되면 break가 발생하여 근접한 반복문인 for(int~)를 벗어나 Loop1으로 돌아간다.
        
        Loop1 : for(int i=2; i<=9; i++) {
            for(int j=1; j<=9; j++) {
                if(j==10)
                    //break Loop1;
                break; //단순히 break 사용 시 제일 근접한 for문만 벗어난다.
                //continue Loop1; => Loop1 반복문으로 벗어나 다시 실행. 이런 문장은 거의 쓸일이 없을 것.
                //continue; => 바로 (근접한)반복문의 끝으로 가서 다시 반복문 실행.
                System.out.println(i+"*"+j+"*"+ i*j);
            }
            System.out.println();
            }
        }
	}