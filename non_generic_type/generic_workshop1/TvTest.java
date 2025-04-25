package generic_workshop1;

public class TvTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv<String> tv = new Tv<String>();
		tv.setE("Smart Tv");
		
		String tvName = tv.getE();
		System.out.println("나의 TV는 " + tvName + "입니다.");
	}

}
