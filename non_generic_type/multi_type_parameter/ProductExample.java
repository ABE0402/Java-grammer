package multi_type_parameter;

public class ProductExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product<Tv, String> product1 = new Product<Tv, String>();
		product1.setKind(new Tv());
		product1.setModel("Samsung TV");
		String Tvmodel = product1.getModel();
		System.out.println("나의 Tv는 " + Tvmodel + "입니다.");
		
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();
		
		System.out.println("tv = " + tv);
		System.out.println("tvModel = " + tvModel);
		
		Product<Car, String> product2 = new Product<Car, String>();
		product2.setKind(new Car());
		product2.setModel("전기차");
		Car car = product2.getKind();
		String carModel = product2.getModel();
		
		System.out.println("car = " + car);
		System.out.println("carModel = " + carModel);
		
	}

}
