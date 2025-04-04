
public class ForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		String expression ="";

		//		for (int i = 1; i <=10 ; i++) {
		//			expression += ( i==1) ? i : "+" + i;
		//			sum += i;
		//		}

		//		sum=0;
		//		System.out.println(expression + "= " + sum);
		//		System.out.println("1부터 10까지 짝수의 합을 구함");
		//		for (int i = 1; i <=10 ; i++) {
		//			if( i % 2 ==0) {
		//			expression += ( i==2 ) ? i : "+" + i;
		//			sum += i;
		//			
		//			}
		//		}
		//		System.out.println(expression + "= " + sum);

		sum=0;
		System.out.println(expression + "= " + sum);
		System.out.println("10부터 1까지 감소하면서 합을 구함");
		for (int i = 10; i >= 1 ; i--) {
			expression += ( i==0 ) ? i :"+" + i   ;
			sum += i;


		}
		System.out.println(expression + "= " + sum);

//		System.out.println("for문 무한으로 돌리기");
//		int x= 1;
//		for(;;) {
//			if (x>10) 
//				break;
//			System.out.println(x);
//			x++;
//
//		}

	}

}
