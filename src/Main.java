import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        /* 화면으로부터 입력받기 61
        이해하기보다는 가져다 사용하는 정도로만 일단 활용!
        */
        
        Scanner scanner = new Scanner(System.in); //Scanner 클래스의 '객체'를 생성\
        //nextLine 메서드 호출, 입력대기 상태에 있다가 입력을 마치고 '엔터'를 누르면 입력한 내용이 문자열로 반환된다.
        System.out.print("두 자리 정수를 하나 입력해보세용>");
        String input =scanner.nextLine(); //입력받은 내용을 input에 저장
        int num = Integer.parseInt(input); //입력받은 내용을 int타입의 값으로 저장, 입력받은 문자열을 숫자로 변환
        
        System.out.println("입력내용 :"+input);
        System.out.printf("num=%d%n", num);
    }
}