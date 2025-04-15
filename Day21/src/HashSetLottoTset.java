import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class HashSetLottoTset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//컬렉션 
		//배열은 크기가 한번 정해지면 변경할 수 없지만 
		//컬렌션은 크기보다 더 많은 데이터를 저장하면 컬렉션의 크기가 자동으로 증가됨
		//데이터를 삭제하면 뒤의 요소들이 자동으로 쉬프트됨
		HashSet<Integer> set = new HashSet<Integer>();
		
		for (int i = 0; set.size() < 6; i++) {
			//size()
			//컬렉션에 저장된 요소의 개수를 반환
			int num = (int)(Math.random()*45 ) + 1;
			set.add(num);
		}
		
		//HashSet은 정렬은 안됨
		
		List<Integer> list = new LinkedList<Integer>(set);//LinkedList(Collection c)
		Collections.sort(list);
		System.out.println(list);
	}

}
