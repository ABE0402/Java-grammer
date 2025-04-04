//추상클래스는 객체로 생성할 수 없다.  1 
//추상클래스의 추상메소드로 정의된 기능들은 자식클래스들에서 메소드를 구현한 후
//자식클래스 객체를 통해서 사용해야 함. 2
abstract class AbstractClass{
	//일반변수
	int age;

	//일반메소드: 메소드 정의부와 구현부가 모두 있는 메소드
	void generalMethod() {
		System.out.println("general method");
	}
	
	//추상메소드
	//정의부만 있고, 구현부는 없는 메소드
	//추상메소드 앞에는 abstract가 지정되어야 함
	//추상메소드가 하나라도 있는 클래스는 추상클래스가 됨
	abstract void abstractMethod();
}

//2
class AbstractChildClass extends AbstractClass{
	@Override
	void abstractMethod() {
		// TODO Auto-generated method stub
		System.out.println("abstract method 구현");
	}
}

public class AbstractTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.
		//AbstractClass ab = new AbstractClass(); 불가능하다.
		
		//2.
		AbstractChildClass abc = new AbstractChildClass();
		abc.abstractMethod();
		
		
	}

}

//그러면, 부모클래스로 추상클래스를 사용하지 않고 일반클래스를 사용해도 상속받은 메소드를 재정의해서 사용할 수 있는데
//왜 어떤 경우에 추상클래스를 부모클래스로 사용해야 하나?
//일반클래스를 부모클래스로 지정하면 자식클래스에서 해당 기능을 재정의 안해도 됨
//추상클래스는 해당 기능을 구현하지 않으면 에러 남
//즉, 반드시 구현해야함.
//자식클래스들에는 해당 기능이 반드시 있어야 하지만, 자식클래스들의 기능이 너무 다르므로 미리 부모클래스에서 정의해놓을 수 없고
//자식클래스에서는 필수적으로 정의해야하는 기능이 있을때 추상클래스를 사용함
//안드로이드 화면에서 각각의 뷰들의 상위클래스 View 클래스
//View 클래스에는 자신을 그리는 메소드가 있다. draw()라는 추상메소드가 정의됨



