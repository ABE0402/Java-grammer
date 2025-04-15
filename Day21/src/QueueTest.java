import java.util.LinkedList;

public class QueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] carArray = {"그랜져", "k9", "포르쉐", "레이", "지바겐", "페라리"};
		
		LinkedList<String> queue = new LinkedList<String>();
		for(String car : carArray) {
			queue.offer(car);
		}
		
		System.out.println("queue 의 크기 :" + queue.size());
		
		String data = "";
		while((data = queue.poll()) != null) {
			System.out.println(data);
		}
		System.out.println("queue 의 크기 :" + queue.size());
		
		
	}

}
