import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        /* 78
        자동 형변환
        경우에 따라 편의상의 이유로 형변환을 생략할 수 있다.
        단, 이때는 형변환이 이루어지지 않는것은 아니고, 컴파일러가 자동으로 추가해준다.
        변수가 저장할 수 있는 값의 범위보다 더 큰 값을 저장하려는 경우에 형 변환을 생략하면 에러가 뜸.
        byte b = 1000; 의 경우 byte가 크기가 1byte여서 크기가 4byte인 int형을 저장한는데 오류가 뜬다.
        고로 byte b = (byte)1000; 이라고 하는게 ok
        
        기존의 값을 최대한 보존할 수 있는 타입으로 자동 형변환된다.
        */
        
        char a = (int)'A';
        char b = (int)'B';
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(a+b);
        
        /*출력결과
        A
        B
        131 -> A와 B가 각각 int형으로 변환되어 출력. 이때 문자코드인 65 66으로 변환되어 더해짐.
        */
        
    }
}