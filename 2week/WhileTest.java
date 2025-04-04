
public class WhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int i =1;
		String expression = "";

		while( i<=10) {
			expression += (i==1) ? i : "+" + i;
			sum += i;
			i++;
		}
		System.out.println("sum= " + sum);
	}
	i = 1;
	expression = "";
	do {
		expression += (i==1) ? i : " + " +i;
		sum += i;
		i++;
	}while(i<=10) {
		System.out.println("sum= " + sum);
	}

}
