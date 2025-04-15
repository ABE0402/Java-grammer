
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	TreeSet<Integer> set = new TreeSet<Integer>();
		
		for (int i = 0; set.size() < 6; i++) {
			//size()
			//컬렉션에 저장된 요소의 개수를 반환
			int num = (int)(Math.random()*45 ) + 1;
			set.add(num);
		}
		System.out.println(set);

	}

}
