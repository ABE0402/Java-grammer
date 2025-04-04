
public class DoubleWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 
		int i = 1;
		while( i <= 5) {
			int j= 1;
			while( j <= 5-i) {
				System.out.print(" ");
				
			}
			while(j<=(2*i-1)) {
					System.out.print(j);
					j++;
				}
			System.out.println();
			i++;
		}
			int k=0;
		while(k>=1) {
			int l=1;
			while( l <= 5-i) {
				System.out.print(" ");
				l++;
			}
			while(l<=(2*i-1)) {
					System.out.print(l);
					l++;
				}
			System.out.println();
			k--;
		}
	}
}
