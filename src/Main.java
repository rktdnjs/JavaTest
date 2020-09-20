
public class Main {
    public static void main(String args[]) {
        /* 조건 연산자 91
		조건 연산자는 조건식, 식1, 식2 모두 3개의 피연산자를 필요로 하는 삼항 연산자이며
		삼항 연산자는 조건 연산자 하나뿐이다.
		조건식? 식1 : 식2 의 형태를 띈다.
		첫번째 피연산자인 조건식의 결과에 따라 다른 결과를 반환한다. true = 식1 false = 식2
		조건식을 가독성을 높이기 위해 괄호로 둘러싸는 경우가 많지만 필수는 x
		
		조건 연산자의 식1과 식2의 피 연산자의 타입이 다른 경우에는 이항 연산자처럼 산술 변환이 발생한다.
		x = x + (mod < 0.5 ? 0 : 0.5) => x= x + (mod < 0.5 ? 0.0 : 0.5) 이렇게 자동 형변환이 된다.
        */
		
		//조건 연산자를 이용, 변수의 절대값을 구해 부호를 붙여 출력하는 프로그램.
		int x, y, z;
		int absX, absY, absZ;
		char signX, signY, signZ;
		
		x=10;
		y=-5;
		z=0;
		
		absX = x>= 0 ? x : -x; //x의 값이 음수이면 양수로 만든다.
		absY = y >= 0 ? y : -y;
		absZ = z >= 0 ? z : -z;
		
		signX = x > 0 ? '+' : ( x==0 ? ' ' : '-'); //조건연산자 중첩, x가 0보다 크지 않으면 0과 비교하여 0이면 부호를 공백으로, 0이아니면 -를 붙여 음수로 표현.
		signY = y > 0 ? '+' : ( y==0 ? ' ' : '-');
		signZ = z > 0 ? '+' : ( z==0 ? ' ' : '-');
		
		System.out.printf("x=%c%d%n", signX, absX);
		System.out.printf("y=%c%d%n", signY, absY);
		System.out.printf("z=%c%d%n", signZ, absZ);
		
	}
}