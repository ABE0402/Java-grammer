// java 소스 파일에 public 클래스는 하나만 정의할 수 있다.
//public 클래스명이 소스파일명이어야 한다.
class Product{
	int serialNumber;
	int count;
	
	{
		//인스턴스 초기화 블록
		//객체를 생성할때마다 자동으로 호출됨
		//주로 객체 생성할대마다 꼭 해야하는 작업을 정의한다.
		
		serialNumber = ++count;
	}
}
public class StaticTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product1 = new Product();
		Product product2 = new Product();
		Product product3 = new Product();
		
		System.out.println("product1.serialNumber = " + product1.serialNumber);
		System.out.println("product2.serialNumber = " + product2.serialNumber);
		System.out.println("product3.serialNumber = " + product3.serialNumber);
	}

}
