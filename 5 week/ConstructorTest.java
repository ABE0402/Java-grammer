//생성자
//객체를 생성할때 new 연산자에 의해서 호출되는 단위
//클래스에 생성자가 하나도 정의되어 있지않으면 자동으로 빈생성자가 생성됨
//만약, 인자있는 생성자가 클래스에 하나라도 있으면 빈생성자를 만들어지지 않는다.
//따라서, 인자있는 생성자와 빈생성자를 동시에 사용하려면 인자 없는 생성자를 명시적으로 정의해야 함
//생성자를 사용하는 주된 용도 : 객체를 생성할때 다양한 방식으로 멤버 변수를 초기화 시키는 용도


//생성자 규칙
//1. 생성자의 이름은 클래스명과 동일해야 한다. 대소문자 구분한다.
//2. 생성자는 리턴타입이 없다.
//3. 생성자의 접근 제한자는 클래스의 접근제한자와 동일할 필요는 없다.
class Data1{
	int value;
	
	public Data1() {
		// TODO Auto-generated constructor stub
		
	}
	public Data1(int x) {
		// TODO Auto-generated constructor stub
		value = x;
	}
	
}

public class ConstructorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data1 data = new Data1();
		Data1 data2 = new Data1(10);
		
		//맴버 변수값을 초기화 하는 생성자를 안만들면 갹체를 우선 생성한 후
		//맴버 변수값을 일일이 하나씩 할당해야 함
		Member member = new Member();
		member.add= "aaa";
		member.name= "aaa";
		
		//생성자를 원하는 멤버변수의 값을 초기화 시키면서 객체를 생성하게 정의할 수 있다,
		Member member1 = new Member("aaa","안병은", "1111", "동남구 안서동", "남");
	}

}
