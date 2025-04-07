//인터페이스는 메소드를 완전히 구현한 것이 아니므로 객체를 생성할 수 없다. 1
//인터페이스에 정의된 메소드들은 인터페이스를 구현한 클래스에서 인터페이스에 정의된 메소드들을 구현한 후
//해당 구현클래스 객체를 생성해서 사용해야 한다. 2
interface Interface1{
	//추상클래스에는 일반변수를 정의할 수 있었지만
	//인터페이스에는 일반변수를 정의할 수 없다.
	//인터페이스가 추상클래스보다 추상화 정도가 더 심하다.
	//인터페이스에 변수를 선언하면 자동으로 static final 이 지정됨. 즉 상수가 됨.
	int intervar = 10;
	
	//일반메소드 : 인터페이스에는 일반메소드를 정의할 수 없다. 
/*	void interfaceMethod1();{
	
}*/	
	
	void interfaceMethod1();
	//인터페이스에 메소드를 정의하면 자동으로 public abstarct 가 지정됨
	//따라서, 인터페이스를 구현해서 인터페이스에 정의된 메소드들을 재정의할 때는 접근제한자를 public 으로 지정해야함.
	
	//이미 많은 클래스들이 해당 인터페이스를 구현하고 있다.
	//새로운 기능을 인터페이스에 추가하고 싶다.
	// 오류 버전 = void appendMethod(); 
	
	//이런 경우(더 많은 메소드를 구현하고 싶을때)에는 default 메소드와 static 메소드를 사용하면 된다.
	public default void defaultMethod() {
		System.out.println("default method");
	}
	
	static void staticMethod() {
		System.out.println("static method");
	}
}

class InterfaceImp1 implements Interface1{
	@Override
	public void interfaceMethod1() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
public class InterfaceTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1 
		//Interface1 interface1 =new Interface1();
		
		//2
		InterfaceImp1 interfaceImp1 = new InterfaceImp1();
		interfaceImp1.interfaceMethod1();
		interfaceImp1.defaultMethod();
		
		Interface1.staticMethod();
	}

}
