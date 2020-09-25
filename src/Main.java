import java.util.*;

public class Main {
    public static void main(String args[]) {
        /* if 중첩문 104p
        
        */
        
        //점수에따라 학점을 출력하는 프로그램
        
        int score;
        char grade = ' ', opt = '0';
        
        System.out.print("점수를 입력해주세요 >ㅇ< >>");
        Scanner sc = new Scanner(System.in);
        score = sc.nextInt(); //화면을 통해 입력받은 점수를 score에 정수형으로 저장.
        
        System.out.printf("당신의 점수는 %d 입니다.%n", score);
        
        if(score>=90){  //90점이상 A, 95점이상 A+
            grade = 'A';
            if(score>=95){
                opt = '+';
            } else if (score<94) {
                opt = '-';
            }
        }
        
        else if(score>=80){ //80점이상 B, 85점이상 B+
            grade = 'B';
            if(score>=85){
                opt = '+';
            } else if (score<84) {
                opt = '-';
            }
        }
        
        else {
            grade = 'C'; //나머지는 그냥 C ㅎㅎ 재수강 ㄱ
        }
        
        System.out.printf("당신의 학점은 %c%c입니다.%n", grade, opt);
        }
	}