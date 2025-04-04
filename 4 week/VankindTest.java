//자바의 변수 종류
		//자바는 영역("{}")으로 묶인 곳에서는 어디서든지 변수를 선언할 수 있다.
		//변수가 선언된 위치(영역)에 따라서 변수 종류가 결정됨
		
public class VankindTest {
	int memberVar;
	//맴버변수(인스턴스변수)
	//초기화 시점: new 연산자 객체를 생성할 때 각 객체마다 멤버변수가 초기화됨 2
	//멤버변수는 선언할때 값을 할당하지않으면 자동으로 해당 데이터타입의 기본값으로 초기화 됨 1
	
	static int staticVar;
	//스테이틱 변수(클래스변수) :변수든 메소드든 static이 지정되면 레벨이 객체 레벨이 아니고 
	//클래스에 속하는 레벨로 올라감 
	//따라서, 클래스 변수는 객체를 생성하지 않아도 클래스 이름으로 바로 사용 가능하다. 3
	//해당 클래스를 사용하지않는 모든 객체에서 초기화 됨 4
	//따라서, 스테이틱 변수는 값을 공유하는 용도로 사용된다.
	
	void method1(int paramVar1,int paramVar2) {
		//파라미터 변수 : 메소를 호출하는 쪽에서 전달해주는값을 저장하는 변수
		//당연히 사용할 수 있다고 효원이가 말함.
		int x = staticVar;
		int t = memberVar;
		
		instanceMethod2();      
	}
	
	void instanceMethod2(){
		
	}
	
	//자바에서 사용되는 메소드 종류
	//1. 멤버메소드(인스턴스메소드)
	//클래스 객체를 생성한 후 사용할 수 있다. ex) scanner.next()
	void instanceMethod1() {
		int x = staticVar;
	}
	
	//2.스테이틱메소드(클래스메소드)
	//객체를 생성하지 않고 클래스 이름으로 바로 호출(사용)할 수 있는 메소드 6
	//Math.random()
	//out.println()
	static void staticMethod1() {
		//static 메소드 안에서 instance 변수를 사용할 수 있을까요?
		//int x= memberVar; -> 불가능
		VankindTest vt = new VankindTest();
		int x = vt.memberVar;
		
		//instanceMethod1();
		int y = staticVar;
		staticMethod2();
	}
	static void staticMethod2() {
		
	}
	
	public static void main(String[] args) {
		// 1
		VankindTest varkindTest1 = new VankindTest();
		System.out.println("varkindTest1, memberVar = " + varkindTest1.memberVar);
		
		// 2
		VankindTest varkindTest2 = new VankindTest();
		System.out.println("varkindTest1, memberVar = " + varkindTest2.memberVar);
		varkindTest2.memberVar = 100;
		System.out.println("varkindTest2.memberVar = 100;");
		System.out.println("varkindTest1, memberVar = " + varkindTest1.memberVar);
		System.out.println("varkindTest2, memberVar = " + varkindTest2.memberVar);
		
		//3 
		System.out.println("VarkindTest.staticVar =" + VankindTest.staticVar);
		
		//4 
		VankindTest.staticVar =100;
		System.out.println("varkindTest2.staticVar = 100;");
		System.out.println("VarkindTest.staticVar =" + VankindTest.staticVar);
		System.out.println("VarkindTest1.staticVar =" + varkindTest1.staticVar);
		System.out.println("VarkindTest2.staticVar =" + varkindTest2.staticVar);
	
		int localVar;
		//메소드안에 선언되는 변수: 로컬변수(지역변수)
		//변수를 선언할때 값을 초기화 하지 않으면, 사용할때 컴파일 오류 발생함.
		//사용하기 전에 반드시 초기화해야 함
		
		int x= 5;
		int y= 6;
		if(x<y) {
			localVar=10;
		}
		else {
			localVar=20;
		}
		
		System.out.println("localVar =" + localVar);
		
		
		//5
		//VankindTest.instancemethod1(); <- 이렇게 사용 불가능 선언 뒤 사용 가능하다.
		varkindTest1.instanceMethod1();
		
		//6 
		VankindTest.staticMethod1();

	}

}
