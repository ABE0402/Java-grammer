//초기화 블록
public class BlockTest {
	
	static {
		//클래스가 로딩될때 단한번 실행되는 영역
		//따라서, 클래스 전체에서 공유되는 자원을 주로 생성
		//예: 디비 작업할때 디비 드라이버를 생성
		
		System.out.println("static {  }");
	}
	
	{
		//인스턴스 초기화 블록
		//객체를 생성할때마다 자동으로 반복적으로 실행되는 영역
		//주로, 객체를 생성할때 공통적으로 처리해야하는 작업을 정의
		System.out.println("{ }");
	}
	public BlockTest() {
		System.out.println("생성자");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main start");
		BlockTest bt1 = new BlockTest();
		BlockTest bt2 = new BlockTest();

	}

}
