
public class Workshop10 {
	public Workshop10(int x, int y) {
		// TODO Auto-generated constructor stub
		System.out.println(x > y ? "max = " + x : y > x ? "max = " + y : "같다.");
	}
	public Workshop10(char x, char y) {
		// TODO Auto-generated constructor stub
		System.out.println(x > y ? "max = " + x : y > x ? "max = " + y : "같다.");
	}
	public Workshop10(double x, double y) {
		// TODO Auto-generated constructor stub
		System.out.println(x > y ? "max = " + x : y > x ? "max = " + y : "같다.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Workshop10 wr10 = new Workshop10(10, 20);
		Workshop10 wr1 = new Workshop10('A', 'B');
		Workshop10 wr0 = new Workshop10(10.0, 20.0);

	}

}
