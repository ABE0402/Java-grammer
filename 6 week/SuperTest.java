//super : 부모 클래스 객체를 가리키는 래퍼런스 변수
//부모의 정의된 변수나 메소드를 자식 클래스에서 재정의 하면 부모 클래스에서 상속받은
//변수나 메소드는 은폐됨 
//만약 자식클래스에서 부모에 정의된 멤버에 접근하려면 super를 사용해야한다.
class Employee{
	String name;
	String department;
	int salary;
	
	String getInformation() {
		return "이름 : " + name + ", 부서 : " + department + ", 급여 : " + salary ; 
	}
}

class Salesman extends Employee{
	int commission;
	
	String getInformation() {
		return super.getInformation()+", commission = " + commission ; 
	}
}

public class SuperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salesman sl = new Salesman();
		System.out.println(sl.getInformation());

	}

}
