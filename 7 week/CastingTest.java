
public class CastingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 부모클래스 타입의 래퍼런스 변수에 자식클래스 타입의 래퍼런스 값을 할당하면
		//자식클래스 타입의 래퍼런스 값이 자동으로 부모클래스 타입으로 변환된(Upcasting) 후 할당된다.
		Person1 person1 = new President();
		
		//2. 자식클래스 타입의 래퍼런스 변수에 부모클래스 타입의 래퍼런스 값을 할당하면
		//컴파일 오류 발생됨
		//President president = Person1();
		// 이런 경우에는 명시적으로 자식 클래스타입으로 캐스팅하여(Downcasting) 할당해야함.
		President president1 = (President)person1;

		//다운캐스팅을 해야하는 경우
		//부모 클래스에 정의되어 있지 않는 자원에 접근할 때 사용해야함
		//업 캐스팅을 통해서, 상위 클래스 타입으로 변수를 선언하고 하위 클래스의 객체를 할당할 수 있다. 
		//하면, 상위 클래스의 메소드만 사용할 수 있지만 하위 클래스에서 추가로 구현한 메소드는 사용할 수 없다. 
		//즉, 상위 클래스에서 공통적으로 사용되는 메소드를 정의하고, 하위 클래스에서 이를 구현함으로써 유연하게 코드를 작성할 수 있습니다.
		//다운 캐스팅의 경우는 반대로 하위 클래스에서 추가로 구현한 메소드를 사용할수 있게 된다.
		
		//다운캐스팅할때는 다운캐스팅이 가능한지 판단 후에 다운캐스팅해야 함
		//instanceof
		//좌측에 있는 레퍼런스 변수를 우측에 있는 클래스 타입으로 캐스팅이 가능하면 true를 반환
		
		Person1 person2 = new Student();
		person2.showSleepingStyle();
		//person2.study(); 이건 인식이안됨
		
		if(person2 instanceof Student) {
		Student student1 = (Student)person2;
		student1.Student();
		}
		else {
			System.out.println("캐스팅불가");
		}
		
		//자바에서 부모클래스 타입의 레퍼런스 변수가 자식 클래스 객체를 참조하는 것은 허용하지만
		//자식 클래스 타입의 래퍼런스 변수가 부모 클래스 객체를 참조하는 것은허용하지 않는다.
		
		Person1 person3 = new Person1();
		
		if(person3 instanceof Student) {
			Student student2 = (Student)person3;
			student2.Student();
		}
		else {
			System.out.println("캐스팅불가");
		}
		
		
		//3. 자바에서 캐스팅은 부모 자식 관계에서만 가능함
		// student1 = (President)president1; 형제끼리는 불가능
		
		//메소드의 파라미터 값을 전달받을때 각 자식클래스 타입을 인자로 전달 받으면 
		//각 자식클래스 타입마다 메소드를 다 정의해야 함
		
		
		//변수와 메소드 참조
		//부모클래스 타입의 래퍼런스 변수로 자식클래스 객체를 참조하는 경우
		//메소드를 호출하면 항상 자식 클래스에서 재정의한 메소드가 호출된다.
		//즉. 자바에서 호출되는 메소드는 컴파일 타임이 아니고, 런타임시에 결정된다.
		//따라서, 자바에서 메소드의 다형성은 제공된다.
		Person1 person4 = new Student();
		person4.showSleepingStyle();
		person4 =new President();
		person4.showSleepingStyle();
		person4 =new Employee1();
		person4.showSleepingStyle();		
		
		//변수를 호출하면 호출되는 변수는 컴파일 타임에 결정됨
		//즉, 변수는 래퍼런스 변수의 타입에 의해서 결정됨
		//즉, 자바에서 변수는 다형성을 제공하지 않습니다.
		Person1 person5 = new Employee1();
		System.out.println("person5.x= " + person5.x);
		
		Employee1 employee2 = (Employee1)person5;
		System.out.println("employee2.x = " + employee2.x);
		
	}

}
