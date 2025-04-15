
public class AutoBoxingUnBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//자바에서 기본타입의 데이터를 저장하는 메모리 구조와
		//객체타입의 데이터를 저장하는 메모리 구조는 완전히 다르다. 
		//클래스 타입의 변수에 기본타입의 데이터를 저장할 수 없다. 
		int var_int1 = 3;
		Integer intObj1 = new Integer(var_int1);
		
		intObj1 = var_int1;
		//AutoBoxing 
		//기본 타입의 데이터를 객체타입의 변수에 활당하면 기본 타입의 데이터가 자동으로 객체타입으로 변환되어
		//할당되는 기능
		
		//AutoUnBoxing 
		//기본 타입의 데이터를 기본타입의 변수에 활당하면 데이터가 자동으로 기본타입으로 변환되어
		//할당괴는 기능
		//하위버전
		Integer intObj2 = new Integer("4");
		int vat_int2 = intObj2.intValue();
		
		//상위버전 
		vat_int2 = intObj2;
		

	}

}
