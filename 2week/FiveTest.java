import java.util.Scanner;

public class FiveTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하세요 :");
		int number = scanner.nextInt();
		int i, sum=0, j, count=0;
		for (i=1; i<=number; i++) {
			if (i % 5 == 0) {
				count++;
				 sum += i;	
			}
		}
		System.out.println("1부터 입력 받은 정수까지 5의 배수의 개수 :" + count);
		System.out.println("1부터 입력 받은 정수까지 5의 배수의 합 : " + sum);
	}

}
