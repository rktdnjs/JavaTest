
public class Main {
    public static void main(String args[]) {
        /* 85 86 비교 연산자 & 문자열의 비교
        대소 비교 연산자 > < >= <=
        등가 비교 연산자 == =! 여기서 =!는 두 값이 다르면 true or false.
        주의할 점은 두 개의 기호로 이루어진 연산자는 기호의 순서를 바꾸거나 중간에 공백이 들어가면 안된다.
        
        두 문자열을 비교할 때는 비교 연산자 == 대신 equals()라는 메서드를 사용해야 한다.
        비교 연산자는 두 문자열이 완전히 같은 것인지 비교할 뿐이기 대문에, 문자열의 내용이 같은지 비교하기 위해서는
        equals()를 사용하면 된다. equals()는 비교하는 두 문자열이 같으면 true 아니면 false를 반환한다.
        */
        
        // String str = new String("abc"); String은 원래 클래스 이므로 new를 통해 객체를 생성한다.
        // String str = abc; 
        //특별히 String만 new를 사용하지 않고 위와 같이 간단히 쓸 수 있다.
        String str1 = "abc";
        String str2 = new String("abc");
        
        System.out.printf("\"abc\" == \"abc\" ? %b%n", "abc" == "abc"); //==를 서서 비교후 boolean값 출력.
        System.out.printf(" str1 == \"abc\" ? %b%n", str1 == "abc"); //아래와 동일.
        System.out.printf(" str2 == \"abc\" ? %b%n", str2 == "abc"); //결과값은 false. 이유는 내용은 같지만 서로 다른 객체여서 그렇다.
        System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc")); //equals를 써서 비교후 boolean 값 출력.
        System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc")); //equals는 객체가 달라도 내용이 같으면 true를 반환한다.
        System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));
        System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC")); //equalsIgnoreCase는 대소문자를 구별하지 않고 비교한다.
    }
}