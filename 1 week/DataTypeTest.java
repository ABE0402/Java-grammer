
public class DataTypeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b1 = 122;
		short b2 = 200;
		
		int num1 = 010;//8진수
		System.out.println("num1 =" + num1);
		int num2 = 0X11;//16진수
		System.out.println("num2 =" + num2);
		int num3 = 0B0011;//2진수
		System.out.println("num3 =" + num3);

		long longNumber = 123_123_123_1231L;
		System.out.println("longNumber" + longNumber);
		
		int binaryNumber = 0B1111_0000_1010_0000;
		System.out.println("binaryNumber" + binaryNumber);
		
		char english = 0X0041; // 4 *16 +1 ==> 65
		System.out.println("english =" + english);
		
		char hangul = 0XAC00;
		System.out.println("hangul =" + hangul );

		char japanes = 0X3055;
		System.out.println("japanes =" + japanes);
		
		String str1 = "";
		String str2 = "aaaaa";
		
		boolean bool1 = false;
		boolean bool2 = true;
		
		double avg = 220 /3d;
		System.out.println("avg = %.1f" + avg );
	}

}
