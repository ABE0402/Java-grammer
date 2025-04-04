
public class ReturnTest {
	//메소드 실행이 종료되는 경우
	//1. 메소드 실행이 완료된 경우
	//2. return 문을 만났을때
	//return : 메소드 실행을 종료하고 호출한쪽으로 되돌아 가겠다는 의미

	//메소드의 인자값을 계속 출력하다가 인자로 "exit"가 전달되면 풀력을 끝내는 메소드
	void printInfo(String info) {
		if(info.equals("exit")) {
			return;
		}
		System.out.println(info);
	}

	//호출한 쪽으로 특정값을 반환하면서 메소드를 종료하려면 
	//return 뒤에 반환할 값을 지정하면 됨

	//인자로 전달된 두 수의 합을 구해서 반환
	//return 뒤에 반환하는 데이터 타입과 메소드 옆에 정의되는 데이터타입이 동일해야함
	//return 뒤에 반환하는 데이터 값이 자동으로 메소드 앞에 정의된 데이터타입으로 
	//형변환 될 수 있어도 가능하다 int -> double
	Data add(int x, int y) {
		return new Data();
	}

	//메소드의 리턴타입이 void가 되는 경우
	//1 return 예약어를 사용하지 않는 경우
	void testInfo() {

	}
	//2 return 예약어 뒤에 반환할 값을 지정하지 않은 경우
	void aaa() {
		return;
	}
	
	public static void main(String[] args) {
	}
	// TODO Auto-generated method stub
	ReturnTest rt = new ReturnTest();
	rt.printInfo("1111");
	rt.printInfo("2222");
	rt.printInfo("exit");

	//System.out.println("add(10,10) =" + rt.add(10,10));
}

}
