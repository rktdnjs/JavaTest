import java.util.*;

public class Main {
    public static void main(String args[]) {
        /* if-else if문 103p
        
        */
        int score = 0; //점수를 저장하기 위한 변수
        char grade = ' '; //학점을 저장하기 위한 변수
        
        System.out.print("점수를 입력해보세요 >^< >>");
        Scanner sc = new Scanner(System.in);
        score = sc.nextInt(); //입력받은 숫자를 score에 저장
        
        if(score >= 90){
            grade = 'A';
            System.out.println("앗!!!! 당신은 과탑에 한 걸음 가까이 다가가셨습니다...good");
        }
        else if(score >= 80){
            grade = 'B';
        }
        else if(score >= 70){
            grade = 'C';
        }
        else if(score >= 60){
            grade = 'D';
        }
        else{
            grade = 'F';
            System.out.println("앗!!! 축하드립니다....재수강이에요 >^<");
        }
        System.out.println("앗!!! 당신의 학점은" + grade + "입니다.");
        }
	}