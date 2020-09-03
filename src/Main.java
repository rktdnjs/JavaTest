import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        /* 62~63
        오버플로우 : 타입이 표현할 수 있는 값의 범위를 넘어서는 것을 오버플로우(overflow)라고 한다.
        예를 들어 4bit 2진수의 최대값인 1111에 1을더하면 오버플로우가 발생해 0000이 된다.
        반대로 최소값인 0000에 1을 빼면 오버플로우가 발생해 1111이 된다. (이때의 0000은 앞에 저장되어 있지 않은 1이 있다고 가정.)
        */
        
        short sMin = -32768; 
        short sMax = 32767;
        char cMin = 0;
        char cMax = 65535;
        
        System.out.println("sMin = " + sMin);
        System.out.println("sMin-1 = " + (short)(sMin-1));
        System.out.println("sMax = " + sMax);
        System.out.println("sMax+1 = " + (short)(sMax+1));
        System.out.println("cMin = " + (int)cMin);
        System.out.println("cMin-1 = " + (int)--cMin);
        System.out.println("cMax = " + (int)cMax);
        System.out.println("cMax+1 = " +(int)++cMax); //cMax에 1을 먼저 더함.
        
    }
}