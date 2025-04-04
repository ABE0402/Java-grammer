class Super{
	String name = "안병은";
}

class Sub extends Super{
	String name = "박서준";
	
	String getLocalName() {
		String name = "최민수";
		
		return name;
	}
	
	//메소드 안에서 자기 자신 클래스에 정의된 멤버변수에 접근하려면 this를 사용하면 됨
	String getThisName() {
		String name = "이만수";
		return this.name;
	}
	
	//메소드 안에서 부모 클래스에 정의된 멤버변수에 접근하려면 super를 사용하면 된다.
	String getSuperName() {
		String name = "이정원";
		return super.name;
	}
}

public class ThisSuperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub sb = new Sub();
		System.out.println("localName = " + sb.getLocalName());
		System.out.println("ThisName = " + sb.getThisName());
		System.out.println("SuperName = " + sb.getSuperName());

	}

}
