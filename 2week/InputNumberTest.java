import java.util.Scanner;

public class InputNumberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		boolean stop = false;
		
		int rightNumber = (int)(Math.random()*100)+1;
		
		do {
			System.out.println("숫자입력 :");
			int inputNumber = scanner.nextInt();
			
			if(inputNumber > rightNumber) {
				System.out.println("더 작은 숫자를 입력하세요");
			}
			else if(inputNumber < rightNumber) {
				System.out.println("더 큰 숫자를 입력하세요");
			}
			else {
				System.out.println("정답입니다.");
				stop = true;
			}
		}while(!stop);

	}

}
