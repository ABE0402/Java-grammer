//A 추상클래스를 상속받은 B 추상클래스를 상속하는 C 클래스는
//A 클래스와 B 클래스에 정의 된 모든 추상메소드를 구현해야한다.\

abstract class AbstractClass1{
	abstract void abstractMethod1();
}
abstract class AbstractClass2 extends AbstractClass1{
	abstract void abstractMethod2();
}

class GeneralClass extends AbstractClass2{
	@Override
	void abstractMethod1() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	void abstractMethod2() {
		// TODO Auto-generated method stub
		
	}
}
public class AbstractTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
