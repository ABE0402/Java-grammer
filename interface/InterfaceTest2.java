//클래스와 차이점
//자바에서 클래스끼리는 다중 상속이 지원되지 않는다.
//****인터페이스에는 다중상속을 지원한다.****
//즉, 상속구조가 모호해질 가능성이 없기 때문이다.
interface Inter1{
	int x =10;
	void in1Method();
}
interface Inter2{
	int x =10;
	void in1Method();
	void in2Method();
}

interface Inter3 extends Inter1, Inter2{ //인터페이스는 , 를찍으면서 다중상속 완전 가능
	
}

class Inter3Class implements Inter3 {
	@Override
	public void in1Method() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void in2Method() {
		// TODO Auto-generated method stub
		
	}
}

public class InterfaceTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inter3Class inter3 = new Inter3Class();
		inter3.in1Method();
		
		
	}

}
