
public class ConversionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.변수에 값을 할당할 때
		//1-1
		//변수 : 큰 데이터 타입
		//할당하는 값 : 작은 데이터 타입
		// 할당하는 값의 데이터타입이 자동으로 변수의 데이터타입으로
		//형변환되어 할당됨

		byte b1 = 127;
		int i1 = b1;
		System.out.println("f1 =" + i1);

		//1-2.
		//변수 : 작은 데이터 타입
		//할당하는 값 : 큰 데이터 타입
		//에러가 방생하므로 캐스팅 연산자를 사용해서 명시적으로
		//형변환해야 함.
		
		int i3 = 100;
		long l1 = 400;
		long result = i3 + l1;
		
		//실수타입이 정수타입보다 표현할 수 있는범위가 넓기 때문이다.
		
		
		char c1 = 'A';
		int i5 = c1 +1;
		System.out.println("i5 =" +i5);
	}
}