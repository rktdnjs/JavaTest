
public class Main {
    public static void main(String args[]) {
        /* 조건식의 다양한 예시 99 
        연산자를 통해 알아보는 여러가지 조건식의 예시
        ~ 이상 ~ 이하 일때 : 90 <= x && x <= 100
        x가 ~보다 작거나 ~보다 클때 : x < 0 || x > 100
        정수 x가 3의 배수지만, 2의배수는 아닐 때 : x%3==0 && x%2!=0  (등가비교 연산자는 !=를 쓰기때문에 등호를 2개 쓰지 않음.)
        문자가 ~이거나 ~일때 : ch=='y' || ch=='Y'
        문자가 대문자 일때 : 'A' <= x && x <= 'Z'
        문자가 소문자 일떄 : 'a' <= x && x <= 'z'
        문자열의 내용이 ~일떄 (대소문자 구분o) : str.equals("입력한 문자")
        문자열의 내용이 ~일때 (대소문자 구분x) : str.equalsIgnoreCas("입력한 문자")
        */
        
        //x의값에 따라서 출력하는 문장이 달라지는 프로그램. 조건을 적는 방식에 차별을 두었음. 등가비교연산자 중 == =!를 쓰거나 쓰인 등가비교연산자에 논리부정연산자!를 쓰거나.
        int x = 0;
        System.out.printf("x=%d 일때 참인 것은 %n", x);
        
        if(x==0) System.out.println("x==0");
        if(x!=0) System.out.println("x!=0");
        if(!(x==0)) System.out.println("(x==0)");
        if(!(x!=0)) System.out.println("!(x!=0)");
        
        
        x=1;
        System.out.printf("x=%d 일때 참인 것은%n", x);
        
        if(x==0) System.out.println("x==0");
        if(x!=0) System.out.println("x!=0");
        if(!(x==0)) System.out.println("!(x==0)");
        if(!(x!=0)) System.out.println("!(x!=0)");
        }
	}