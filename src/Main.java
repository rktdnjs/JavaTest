public class Main {
    public static void main(String args[]) {
        /*
        문자열 결함.
        숫자 뿐만이 아니라 두 문자열을 합칠 때도 덧셈을 쓸 수 있다.
        String name = "Ja" + "va";
        String str = name + 8.0;
        
        덧셈 연산자는 피연산자 중 어느 한 쪽이 String 이면 나머지 한 쪽을 String 으로 변환한다음 두 String 을 결합한다.
        예를들어 7 + "7"을 계산할 때 7이 String 이 아니므로 먼저 7을 String 으로 변환한 다음 "7" + "7"을 수행하여 77을 얻는다.
        7 + ""을 계산하게 되면 ""은 빈 문자열이기 때문에 계산결과는 "7"이다.
        
        이때 왼쪽에서 오른쪽으로 연산을 수행하기 때문에 순서에 따라 결과값이 바뀜을 유의하자.
        예를 들어서 "" + 7 + 7 = 77
        7 + 7 + "" = 14
        이런식으로 나온다.
        */
        
        String name = "Ja" + "va";
        String str = name + 8.0;
        
        System.out.println(name);
        System.out.println(str);
        System.out.println(7 + " ");
        System.out.println(7 + "");
        System.out.println(" " + 7);
        System.out.println("" + "");
        System.out.println(7 + 7 + "");   
        System.out.println("" + 7+ 7);
    }
}