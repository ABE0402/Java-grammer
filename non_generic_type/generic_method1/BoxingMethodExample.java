package generic_method1;

public class BoxingMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<Integer> box1 = Util.<Integer>boxing(100);
		int intValue = box1.get();
		System.out.println("intValue = " + intValue);
		
		Box<String> box2 = Util.boxing("오정원");
		String strValue = box2.get();
		System.out.println("strValue = " + strValue);
	}

}
