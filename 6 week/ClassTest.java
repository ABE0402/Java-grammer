import java.util.Scanner;

class Calculate1{
	int i=0;
	int result1=1;
	int result2=0;
	public void factorial(int num2) {
		for(i=1; i<=num2; i++) {
			result1 =result1 * i ;
		}
		System.out.println("factorial : " + result1);
	}
	public void power(int num2) {
		for (i=1; i<=num2; i++) {
			result2 += i*i;
		}
		System.out.println("power : " + result2);
	}
}



public class ClassTest {

	public static void main(String[] args) {
		Calculate1 cl = new Calculate1();
		Scanner scanner = new Scanner(System.in);
		System.out.print("연산할 값:");
		int num = scanner.nextInt();
		cl.factorial(num);
		cl.power(num);


	}

}
