import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        /* 66 타입간의 변환과정.
        프로그램에서 자주 사용되는 타입간의 변환과정. 반드시 정리하여 외우자.
        
        1.숫자를 문자로 변환하기 위해서는 숫자에 '0'을 더한다. (char)(3+'0') > '3'
        2.문자를 숫자로 변환하기 위해서는 문자에서 '0'을 뺀다. '3'-'0'=3
        3.숫자를 문자열로 변환하기 위해서는 숫자에 빈 문자열("")을 더한다. 3+""="3"
        4.문자열을 숫자로 변환하기 위해서는 Integer.parseInt() or Double.parseDouble() 을 쓴다.
        Integer.parseInt("3") = 3
        Double.parseDouble("3.14") = 3.14
        5.문자열을 문자로 변환하기 위해서는 charAt(0)을 쓴다. "3".charAt(0) = '3'
        6.문자를 문자열로 변환하기 위해서는 빈 문자열("")을 더한다. '3' + "" = "3"
        */
        
        String str = "3";
        
        System.out.println(str.charAt(0) - '0');  //문자열을 문자로 변환 후 연산
        System.out.println('3' - '0' + 1); //문자를 숫자로 변환 후 연산
        System.out.println(Integer.parseInt("3") + 1); //문자열을 숫자로 변환 후 연산
        System.out.println("3" + 1); //문자열 + 그 외 일 경우 나머지를 문자열로 변환 후 연산
        System.out.println((char)(3 + '0')); //숫자를 문자로 변환후 출력, 이때 문자를 뜻하는 char를 사용.
        
    }
}