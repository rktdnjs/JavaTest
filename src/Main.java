public class Main {
    public static void main(String args[]) {
        /* printf 를 이용한 출력 58
        pritnf의 지시자 중에서 자주 사용되는 것들
        %d : 10진 정수의 형식으로 출력 / %x : 16진 정수의 형식으로 출력
        %f : 부동소수점의 형식으로 출력 / %c : 문자 출력 / %s : 문자열로 출력
        */
        
        /*
        String url = "www.naver.com";
        float f1 =.10f;  //0.10, 1.0e-1
        float f2 = 1e1f; //10.0, 1.0e1, 1.0e1+1
        float f3 = 3.14e3f;
        */
        double d = 1.23456789;
        
        /*
        //%e : 지수형태로 출력할 때 실수 지시자, %g : 값을 간략하게 표현할 때 실수 지시자.
        //%f는 기본적으로 소수점 아래 6자리 까지만 출력한다. 7자리부터는 반올림한다.
        System.out.printf("f1=%f, %e, %g%n", f1, f1, f1);
        System.out.printf("f2=%f, %e, %g%n", f2, f2, f2);
        System.out.printf("f3=%f, %e, %g%n", f3, f3, f3);
        System.out.printf("d=%f%n", d);
        System.out.printf("d=%14.10f%n", d); //전체 14자리 중 소수점 10자리 까지, 소수점의 공백부분은 0으로 채우고 앞자리는 공백.
        System.out.printf("[12345678901234567890]%n");
        
        System.out.printf("[%s]%n", url);
        System.out.printf("[%20s]%n", url); //오른쪽 정렬, 20글자
        System.out.printf("[%-20s]%n", url); //왼쪽 정렬, 20글자
        System.out.printf("[%.8s]%n", url); //왼쪽에서 8글자만.
        //.(숫자)s : 왼쪽에서 (숫자)까지 만 출력
        */
        
        System.out.printf("d=%-20f%n", d);
        System.out.printf("d=%.5f%n", d);
        
        
        
        
    }
}