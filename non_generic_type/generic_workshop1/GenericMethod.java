package generic_workshop1;

class GenericMethod {
    public static <T extends Number, V extends Number>
    double makeRectangle(Point<T, V> p1, Point<T, V> p2) {
        double width = Math.abs(p1.getX() - p2.getX());
        double height = Math.abs(p1.getY() - p2.getY());
        return width * height;
    }
}

//교수님 방식 이거 쓰면 util 안써도 됨
//public class GenericMethod {
//    public static <X, Y> double 
//    makeRectangle(Point<X, Y> point1, Point<X, Y>point2) {
//    	double left = (double)point1.getX();
//    	double right = (double)point2.getX();
//    	
//    	double width = Math.abs(left - right);
//    	double top = (double)point1.getY();		
//    	double bottom = (double)point2.getY();
//    	
//    	double height = Math.abs(top-bottom);
//    	
//    	return width * height;
//    }
//    public static void main(String[] args) {
//    	Point <Double, Double> p1 = new Point<Double, Double>(0.0, 0.0);
//    	Point <Double, Double> p2 = new Point<Double, Double>(10.0, 10.0);
//    	
//    	double result = GenericMethod.<Double,Double> makeRectangle(p1,p2);
//    	System.out.println("면적은 : " + result);
//    }
//}
