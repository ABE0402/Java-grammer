//자바에서 인자 전달 방식
//자바는 인자의 값이 복사되어 전달됨 
//로컬변수는 메소드 실행시에만 메모리에 생성되었다가 메소드 실행이 완료되면 소멸됨
//멤버변수들은 클래스 객체에 계속 존재하는 변수들

class Data{
	int x;
	int y;
	
	void addPriv(int x, int y) {
		x += 100;
		y += 100; 
	}
	void addObj(Data data) {
		data.x += 100;
		data.y += 100;
	}
	void addRef(Data data) {
		data = null;
		//레퍼런스 변수에 유일하게 할당할 수 있는 상수값이 null임
		//null의 의미는 아무객체도 가리키지 않는다는 의미임
	}
}
public class ArgsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data data = new Data();
		data.x = 10;
		data.y = 10;

		
		System.out.println("data.x =" + data.x);
		System.out.println("data.y =" + data.y);
		
		data.addPriv(data.x, data.y);
		System.out.println("data.addPriv(data.x, data.y)");
		System.out.println("data.x =" + data.x);
		System.out.println("data.y =" + data.y);
		
		data.addObj(data);
		System.out.println("data.addPriv(data.x, data.y)");
		System.out.println("data.x =" + data.x);
		System.out.println("data.y =" + data.y);
		
		data.addRef(data);
		System.out.println("data.addRef(data)");
		System.out.println("data.x =" + data.x);
		System.out.println("data.y =" + data.y);

	}

}
