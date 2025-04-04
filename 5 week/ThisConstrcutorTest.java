//this()
//공통된 작업을 특정 생성자에 정의하고, 다른 생성자들에서는 해당 작업을 작업이 정의된 생성자를 
//this()를 이용해서 호출하면서 코드를 간결하게 처리할 수 있다.
//손목보호대 클래스를 정의한다.
//손목보호대에서는 사이즈 속성과 메이커 속성이 있다.
//생성자를 정의할때 사이즈의 기본값은 M 이라고 한다.
//메이커의 기본값은 나이키로 한다.



//사용규칙
//1.this()는 생성자의 첫번째 실행문으로 사용되어야한다.
//2.this()는 recursive call을 허용하지 않는다.

class WristGurad{
	String size; 
	String maker;
	
	//생성자 오버로딩 
	public WristGurad() {
		// TODO Auto-generated constructor stub
		//System.out.println(); this()를 사용하기 위해서는 사용전에 다른 명령문이 들어가면 안된다.
		this("M","나이키");
	}
	public WristGurad(String size) {
		// TODO Auto-generated constructor stub
		this("나이키",size);
	}
	public WristGurad(String maker, String size) {
		// TODO Auto-generated constructor stub
//		this(maker, size); 자기 자신 호출 불가능
		this.size = size;
		this.maker = maker;
	}
}
public class ThisConstrcutorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
