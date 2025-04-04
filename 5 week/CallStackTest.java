//자바에서 메소드는 호출스텍이라는 메모리 영역을 확보하면서 실행됨
//현재 실행되는 메소드가 스텍의 최상단 영역을 차지함
//최상단 영역을 차지한 메소드가 다 실행되면서 현재 사용하고 있는 메모리 영역을 반납함
//그러면 바로 밑에 영역의 메소드가 실행됨
public class CallStackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main start");
		firstMethod();
		System.out.println("main end");
		
		//모든 스택영역을 반환 하면서 프로그램 종료

	}

	private static void firstMethod() {
		// TODO Auto-generated method stub
		System.out.println("first start");
		secondMethod();
		System.out.println("first end");
		
	}

	private static void secondMethod() {
		// TODO Auto-generated method stub
		System.out.println("second start");
		System.out.println("second end");
		//메소드가 다 실행되면 스택 영역 반환
		
	}

}
