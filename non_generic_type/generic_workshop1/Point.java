package generic_workshop1;

class Point<T extends Number, V extends Number> {
	T x;
	V y;

	Point(T x, V y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x.doubleValue();
	}

	public double getY() {
		return y.doubleValue();
	}
}

// 교수님 방법
//public class Point<X, Y>{
//	private X x;
//	private Y y;
//	public Point(X x, Y y) {
//		super();
//		this.x = x;
//		this.y = y;
//	}
//	public X getX() {
//		return x;
//	}
//
//	public Y getY() {
//		return y;
//	}
//
//}

