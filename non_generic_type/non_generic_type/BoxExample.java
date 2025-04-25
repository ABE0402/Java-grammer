package non_generic_type;

public class BoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box = new Box();
		box.set("홍길동");
		String name = (String)box.get();
		System.out.println("name =" + name);
		
		box.set(new Apple());
		Apple apple = (Apple)box.get();
		System.out.println("apple =" + apple);
	}

}
