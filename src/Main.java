import java.text.BreakIterator;
import java.util.*;

public class Main {
    public static void main(String args[]) {
        /* switch 문 108p
        예제 만들기
        */
        
        //입력되는 숫자값에따라 계절을 출력해주는 프로그램.
        
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        
        switch(month) {
            case 3:
            case 4:
            case 5:
                System.out.println("현재 계절은 봄입니다. ^-^");
                break;
            case 6: case 7: case 8:
                System.out.println("현재 계졀은 여름입니다. ^-^;;");
                break;
            case 9: case 10: case 11:
                System.out.println("현재 계절은 가을입니다. ^-^....");
            default:
          //case 12: case 1: case 2:
                System.out.println("현재 계절은 겨울~~입니다. ^~^");
        }
        
        }
	}