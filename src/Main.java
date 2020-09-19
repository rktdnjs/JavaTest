
public class Main {
    public static void main(String args[]) {
        /* 83 Math.round()를 통해 반올림하기
        반올림을 하기 위해서는 Math.round를 사용하면 된다.
        이 메서드는 소수점 첫째 자리에서 반올림한 결과를 '정수'로 반환한다.
        */
        
        double pi = 3.141592;
        double shortPi = Math.round(pi * 1000) / 1000.0;
        System.out.println(shortPi);
        
        //결과값은 3141.592에서 반올림한 3142! , 이때 1000.0이 double형태이므로 자동으로 반올림한 결과값인 정수값도 double형태로 바뀐다.
        
        double a = Math.round(pi * 1000) / 1000;
        System.out.println(a);
        //결과값은 3142(정수형값) 을 1000(정수형값)으로 나눈 3.
    }
}