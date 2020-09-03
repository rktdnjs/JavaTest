import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        /* 68 타입간의 변환과정.
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
        
        System.out.println("1" + "2"); //문자열끼리 그냥 더하는거
        System.out.println(true + ""); //빈문자열 + 아무 타입 = 문자열
        System.out.println('A' + 'B'); //문자 + 문자 근데 여기서 중요한 것은 int형 보다 작은 타입(byte,char,short)는 int형으로 변환된 후 덧셈연산이 진행된다.
        // 그렇기에 문자 A와 B가 int형으로 변환될때 문자코드로 변환되어 연산이 된다. 이때 A의 연산코드는 65. B의 연산코드는 66.
        System.out.println('1' + 2); //문자 + 숫자. 이때 '1'이 문자이기때문에 int형으로 변환. 이때 1의 연산코드는 49.
        System.out.println('1' + '2'); //위와 같다. 이때 1의 연산코드는 49, 2의 연산코드는 50.
        System.out.println('J' + "ava"); //아무 타입 + 문자열 = 문자열.
        
        
    }
}