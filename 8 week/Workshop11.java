import java.util.Scanner;

class StringCountUtil {
	private String originalString;

	public StringCountUtil(String originalString) {
		this.originalString = originalString;
	}

	public int getStringCount(String searchString) {
		int count = 0;
		int index = 0;

		while ((index = originalString.indexOf(searchString, index)) != -1) {
			count++;
			index += searchString.length(); 
		}
		return count;
	}
}

public class Workshop11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("원본 문자열 : ");
		String original = sc.nextLine();

		System.out.print("찾을 문자열 : ");
		String search = sc.nextLine();

		StringCountUtil util = new StringCountUtil(original);
		int count = util.getStringCount(search);

		System.out.printf(original+" 문자열에는"+ search + "문자열이 총 "+ count+"개 존재한다");
	}

}
