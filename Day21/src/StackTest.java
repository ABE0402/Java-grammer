import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] flowerArray = {"국화", "벚꽃", "진달래", "코스모스", "장미", "무궁화"};
		
		Stack<String> stack = new Stack<String>();
		for(String flower:flowerArray) {
			stack.push(flower);
		}
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}

	}

}
