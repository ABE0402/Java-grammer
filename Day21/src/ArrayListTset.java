import java.util.ArrayList;

public class ArrayListTset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		
		//C(Create)
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");
		
		//R(Read)
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//특정 인덱스 위치에 요소 삽입
		list.add(1, "삽입1");
		System.out.println("list.add(1, \"삽입\");");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//특정 컬렉션에 있는 요소들을 한번에 추가 
		ArrayList<String> appendList = new ArrayList<String>();
		
		appendList.add("111");
		appendList.add("222");
		appendList.add("333");
		
		
		list.addAll(appendList);
		System.out.println("list.addAll(appendList)");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//특정 인덱스 위치에 특정 컬렉션에 있는 요소들을 한번에 삽입
		ArrayList<String> insertList = new ArrayList<String>();
		
		insertList.add("insert1");
		insertList.add("insert2");
		insertList.add("insert3");
		
		list.addAll(1, insertList);
		System.out.println("list.addAll(appendList)");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//U (Update)
		list.set(0, "수정데이터");
		System.out.println("list.set(0, \"수정데이터\");");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//D(Delete)
		list.remove(1);
		System.out.println("list.remove(1);");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//삭제할 요소 지정해서 삭제
		list.remove("insert2");
		System.out.println("list.remove(\"insert2\");");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		

	}

}
