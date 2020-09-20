import java.util.*;

public class Main {
    public static void main(String args[]) {
        /* 90 논리 부정 연산자. '!'
		피연산자가 true 이면 false를, false이면 true를 결과값으로 반환한다.
		논리 부정 연산자는 조건문과 반복문의 조건식에 주로 사용된다.
        */
		
		boolean b = true;
		char ch = 'C';
		
		System.out.printf("b=%b%n", b);
		System.out.printf("!b=%b%n", !b);
		System.out.printf("!!b=%b%n", !!b); //논리 부정 연산자 중첩사용.
		System.out.printf("!!!b=%b%n", !!!b);
		System.out.println();
		
		System.out.printf("ch=%c%n", ch);
		System.out.printf("ch < 'a' || ch > 'z' = %b%n", ch < 'a' || ch > 'z'); //ch가 대문자이므로 true값이 들어감.
		System.out.printf("!('a' <=ch && ch <= 'z')=%b%n", !('a'<= ch && ch <='z')); //ch가 소문자인가? false인데 !가 있으므로 부정되어 true가 들어간다.
		System.out.printf("  'a'<=ch && ch<='z' = %b%n", 'a'<=ch && ch<='z'); //ch가 대문자 이므로 false가 들어간다.
	}
}