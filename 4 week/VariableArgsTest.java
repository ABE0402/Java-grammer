//가변인자 타입 : 메소드를 호출할때 전달하는 인자의 개수를 가변적으로 사용할 수 있다.
public class VariableArgsTest {

	void printInfo(String...info) {
		//가변입자 타입의 전달되는 인자들은 배열객체에 저장됨
		//info가 배열객체로 인식됨

		System.out.println("info.length :" + info.length);

		for(int i = 0; i <info.length; i++) {
			System.out.println("info["+ i +"] =" + info[i]); 
		}
		System.out.println("---------------------------------");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariableArgsTest vat = new VariableArgsTest();
		vat.printInfo("aaa");
		vat.printInfo("");
		vat.printInfo("aaa", "bbb");
	}

}
