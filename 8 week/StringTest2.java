//불변성(immutable)
//String 객체는 한번 생성 되면 변할 수 없다.
public class StringTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String originalString = new String("java");
		String lastString = originalString.concat("Fighting");
		
		System.out.println("originalString==lastString" + (originalString==lastString));
		
		//결론 : 자바에서 문자열을 빈번하게 변경해야 작업을 할떄는
		//문자열을 String 클래스로 다루면 안됨

	}

}
