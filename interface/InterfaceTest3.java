//추상클래스와 비슷하다
//클래스는 단일 상속만 지원한다.
//특정 클래스를 하나 상속받으면 다른 클래스를 또 상속할 수 없다.

abstract class Vehicle1{
	abstract void transfer();
}

interface Flyable{
	void fly();
}

class Plane1 extends Vehicle1 implements Flyable{
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void transfer() {
		// TODO Auto-generated method stub
		
	}
}
public class InterfaceTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
