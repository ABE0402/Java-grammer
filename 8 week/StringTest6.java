
public class StringTest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "aaa";
		String str2 = "aaa";
		StringBuilder str3 = new StringBuilder("aaa");
		
		//equals
		System.out.println("str1.equals(str2) : " + str1.equals(str2));
		System.out.println("str1.equals(str3) : " + str1.equals(str3));
		
		//contentEquals
		System.out.println("str1.contentequals(str2) : " + str1.contentEquals(str2));
		System.out.println("str1.contentequals(str3) : " + str1.contentEquals(str3));
		

	}

}
