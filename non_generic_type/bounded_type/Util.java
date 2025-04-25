package bounded_tyoe;

public class Util {
	public static <T extends Number> int compare(T t1, T t2) {
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		
		return Double.compare(v1, v2);
		//앞의 값이 뒤의 값보다 크면 1
		//두 값이 같으면 0
		//앞의 값이 뒤의 값보다 작으면 -1을 반환하게 구현됨
	}

}
