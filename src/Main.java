import java.util.*;

public class Main {
    public static void main(String args[]) {
        /* 87 88 89 논리 연산자 && || !
		논리 연산자는 둘 이상의 조건을 그리고 혹은 또는 으로 연결하여 하나의 식으로 표현할 수 있게 해준다.
		논리연산자 &&는 '그리고'에 해당하며 두 피연산자가 모두 true일때 true값을 결과로 얻는다.
		||는 '또는'에 해당하며 두 피연산자 중 어느 한쪽만 true이어도 결과를 true로 얻는다.
		논리 연산자는 피연산자로 boolean형 또는 boolean형 값을 결과로 하는 조건식만을 허용한다.
		&&와 ||가 동시에 쓰일 경우 &&가 우선순위가 높아 먼저 계산된다.
        */
        
		//문자를 입력받아서 숫자인지 영문자인지 확인해주는 프로그램.
		Scanner sc = new Scanner(System.in);
		char ch = ' ';
		
		System.out.printf("문자를 하나 입력하세요.>");
		
		String input = sc.nextLine();
		ch = input.charAt(0);
		
		if('0' <= ch && ch <= '9') {
			System.out.printf("입력하신 문자는 숫자입니다.%n");
		}
        
		if(('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
			System.out.printf("입력하신 문자는 영문자입니다.%n");
		}
    }
}