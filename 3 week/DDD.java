
public class DDD {

	public static void main(String[] args) {
		// Upper half of the pattern (increasing)
		int i = 1;
		while (i <= 5) {
			int j = 1;
			while (j <= 5 - i) {
				System.out.print(" ");
				j++;
			}
			j = 1;
			while (j <= 2 * i - 1) {
				System.out.print(j);
				j++;
			}
			System.out.println();
			i++;
		}

		i = 4;
		while (i >= 1) {
			int j = 1;
			while (j <= 5 - i) {
				System.out.print(" ");
				j++;
			}

			j = 1;
			while (j <= 2 * i - 1) {
				System.out.print(j);
				j++;
			}
			System.out.println();
			i--;
		}

	}
}