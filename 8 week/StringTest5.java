
public class StringTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "       들여쓰기연습\n들여쓰기연습입니다.";
		String str1 = str.indent(5);
		System.out.println(str1);
		String str2 = str.indent(-4);
		System.out.println(str2);
		String str3 = str.indent(-1);
		System.out.println(str3);
		
		//transform
		String originalString = "gardenfi";
		
		//인자로 적용된 것
		//Function 이라는 Functional Interface를 구현한 람다식의 지정
		//Functional Interface : 인터페이스 중에 메소드가 하나만 정의되어있는 인터페이스를 말함
		//Functional Interface 들은 람다식으로 구현할 수 있다.
		//JDK 에서 기본적으로 제공되는 Functional Interface 들이 있따
		//그 중에 Function 인터페이스는 인자를 받아서 그 인자 값을 다른 값으로 변환하여
		//정의 되어 있다.
		//람다식 기본
		//( 메소드에 전달되는 인자값) -> {인자값을 이용하는 명령문;}
		//(int x) -> System.out.println(x);
		
		//public int method(int x)
		//(int x) -> {return x + 5};
		//람다식 구현부에서 return 문장 하나만 있을 때는 return 구문을 생략할 수 있다.
		//(int x) -> {x + 5}
		//전달되는 값으로 인자의 타입이 유추되므로 인자부분에 데이터 타입은 생략 가능하다.
		//전달되는 인자가 하나일떄는 "()" 생략 가능함
		//구현부의 실행문이 하나일때는 "{}" 도 생략 가능
		// x -> x + 5;
		String finalString = originalString .transform(value -> new StringBuilder(value).reverse().toString());
		
		

	}

}
