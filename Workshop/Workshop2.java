
public class Workshop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]array = {"one","two","three","four"};
		boolean stop = false;
		int index = 0;
		
		while(!stop) {
			for(int i=0; i<array.length; i++) {
			String item = array[index];
			index++;
			if(item.equals("three")) {
				stop = true;
				break;
			}
			else {
				System.out.println(item);
			}
			}
		}
		

	
	}
}
