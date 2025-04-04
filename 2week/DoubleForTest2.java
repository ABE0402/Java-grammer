
public class DoubleForTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		int i, j=0;
		for (i=1; i <= n; i++) {
			for(j=1; j <= n-i; j++) {
				System.out.print(" ");
			}
			for (j=1; j<=2*i-1; j++) {
				System.out.print("" + j);
			}
			System.out.println();
		}
		int n1= 5;
		for (i=n1-1; i >= 1; i--) {
			for(j=1; j <= n1-i; j++) {
				System.out.print(" ");
			}
			for (j=1; j<=2*i-1; j++) {
				System.out.print("" + j);
			}
			System.out.println();
		}
//		int n=5;
//		for (int i = 1; i<=9 ; i++) {
//			int current = ( i <= n) ? i : 2*n-i; 
//			for(j=1; j <= n-current; j++) {
//				System.out.print(" ");	
//			}
//			for (j=1; j<=2*current-1; j++) {
//				System.out.print("" + j);
//			}
//			System.out.println();
			
		}

	}


