import java.util.Scanner;

public class Calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int result=0 , num =0;
		while(true) {
			System.out.println("숫자를 입력해주세요 :");
			num = scanner.nextInt();
			if (num == 0) {
				break;
			}
			result += num;
		}
		System.out.println("총합 : " + result);

	}
}
