public class Main {
    public static void main(String args[]) {
        /* 기본형의 종류와 범위 57
        같은 값이라도 다른 형식으로 출력하고 싶을 때. 
        예를 들어 소수점 둘째자리까지만 출력하거나 정수를 16진수나 8진수로 출력할 때 printf() 를 쓴다.
        printf는 지시자를 통해 변수의 값을 여러가지 형식으로 변환하여 출력하는 기능을 가지고있다.
        '지시자' = 값을 어떻게 출력할 것인지를 지시해주는 역할.
        정수형 변수에 저장된 값을 10진 정수로 출력할 때 => %d 
        출력될 값과 지시자의 순서는 일치해야 한다.
        이때, printf는 출력 후 줄바꿈을 하지 않기때문에 줄바꿈을 하기 위해서는 지시자 %n을 넣어주면 된다.
        */
        
        System.out.printf("age:%d", 14);
        
        //System.out.printf("age:%d year:%d", age, year)'
        System.out.printf("age:%d year:%d", 21, 2020);
        
    }
}