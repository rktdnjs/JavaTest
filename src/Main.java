public class Main {
    public static void main(String args[]) {
        // 상수와 리터럴, 상수는 값을 저장할 수 있는 공간이지만, 변수와 달리 값을 한번 저장하면 다른 값으로 변경할 수 없다.
        // 상수를 선언하는 방법은 변수와 동일하며, 단지 변수의 타입 앞에 키워드 'final'을 붙여주기만 하면 된다.
        // 상수의 이름은 모두 대문자로 하는 것이 관례이며, 여러 단어로 이루어져 있는 경우 _ 를 넣어서 구분한다.
        
        //리터럴(literal) 리터럴은 우리가 기존에 알고 있던 상수의 다른 이름일 뿐이다, 프로그래밍에서는 상수를 값을 한 번 저장하면 변경할 수 없는 저장공간으로 정의하였다. 그래선지 구분할 수 있는 용어가 필요했을 뿐.
        
        /*
        변수에 타입이 있는 것 처럼 리터럴에도 타입이 존재한다. 변수의 타입은 저장될 값의 타입에 의해 결정되므로
        만약 리터럴에 타입이 없다면 변수의 타입도 필요없을 것이다.
        
        정수형의 경우 long 타입의 리터럴에 접미사 'l' 또는 'L'을 붙이고, 접미사가 없으면 int 타입의 리터럴이다.
        (정수형의 예시 : 077 0xFF)
        (만약에 20억이 넘으면 변수 파트에선 int 대신 long 을 선언했었다. 참고)
        byte와 short 타입의 리터럴은 별도로 존재하지 않는다.
        byte와 short 타입의 변수에 값을 저장할 때는 int 타입의 리터럴을 사용한다.
        10진수 외에도 2,8,16진수로 표현된 리터럴을 변수에 저장할 수 있으며
        16진수라는 것을 표시하기 위해 리터럴 앞에 접두사 '0x' 또는 '0X'를, 8진수의 경우에는 '0'을 붙인다.
        int octNum = 010; 8진수 10을 나타냄, 10진수로 8
        int hexNum = 0x10; 16진수 10을 나타냄, 10진수로 16
        
        JDK 1.7부터 정수형 리터럴의 중간에 구분자 _ 를 넣을 수 있게 되어 큰 숫자를 편하게 읽을 수 있게 되었다.
        long big = 100_000_000_000L; / long big = 100000000000L;
        long hex = 0xFFFF_FFFF_FFFF_FFFFL; / long hex = 0xFFFFFFFFFFFFFFFFL;
        
        실수형에서는 float 타입의 리터럴에 접미사 f 또는 F를 붙이고, double 타입의 리터럴에는 접미사 d 또는 D를 붙인다.
        float pi = 3.14f;  / 접미사 f 대신 F를 사용해도 된다. 생략불가
        double rate = 1.618d; / 접미사 d 대신 D를 사용해도 된다. 생략가능
        실수형에서는 double 이 기본자료형이라서 접미사 'd' 는 생략이 가능하다.
        접미사 f, L 2개는 꼭 기억하는 것이 좋다.
        */
    }
}