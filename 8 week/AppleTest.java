import java.text.MessageFormat;

class Apple{
	private int price;
	private String name;
	private String color;
	public Apple(int price, String name, String color) {
		super();
		this.price = price;
		this.name = name;
		this.color = color;
	}
	@Override
	public String toString() {
		return MessageFormat.format("Price : {0} | Name : {1} | Color : {2}", price,name, color);
	}
}
public class AppleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple apple = new Apple(10000, "애플", "white");
		System.out.println(apple);

	}

}
