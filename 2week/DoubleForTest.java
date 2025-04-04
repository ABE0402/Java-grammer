import java.util.Scanner;

public class DoubleForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		Scanner scanner = new Scanner(System.in);
		//		System.out.println("정수를 입력하세요 :");
		//		int number = scanner.nextInt();
		for (int i=1; i <= 5; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		for (int i=5; i >= 1; i--) {
			for (int j=1; j<=i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}


	}

}
