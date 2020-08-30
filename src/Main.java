public class Main {
    public static void main(String args[]) {
        /* 두 변수의 값 바꾸기, 55
        두 변수 x,y에 저장된 값을 바꾸기 위해서는 x의값을 y에저장하고, y의값을 x에저장해서는 원하는 결과를 얻을수 x
        두 컵에 담긴 내용물을 바꾸려면 빈 컵이 필요한 것처럼, 값을 임시로 저장할 변수가 하나 더 필요하다.
        int tmp; (임시로 값을 저장하기 위한 변수, 빈 컵 역할)
        
        tmp = x;  (x의값을 tmp에 저장)
        x = y;  (y의값을 x에 저장)
        y = tmp;  (tmp에 저장된 값을 y에 저장)
        */
        
        int x = 10; int y = 5;
        System.out.println("x="+x);
        System.out.println("y="+y);
        
        int tmp = x; // x의 값을 tmp에 저장
        x = y;  //y의 값을 x에 저장
        y = tmp;  //tmp에 저장된 값을 y에 저장
        System.out.println("x="+x);
        System.out.println("y="+y);
    }
}