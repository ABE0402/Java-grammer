package generic_workshop1;

public class Util {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point <Integer, Integer> p1 = new Point<Integer, Integer>(6, 10);
    	Point <Integer, Integer> p2 = new Point<Integer, Integer>(10, 4);
    	double result = GenericMethod.makeRectangle(p1, p2);
    	System.out.println("면적은 : " + result);
	}

}
