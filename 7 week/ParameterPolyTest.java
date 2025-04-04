class Gajun{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Gajun";
	}
}
class Refrigerator extends Gajun{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Refrigerator";
	}
}

class MicroOver extends Gajun{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "MicroOver";
	}
}

class Aircon extends Gajun{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Aircon";
	}
}

class Buyer{
	Gajun[] gajunArray = new Gajun[3];
	int index = 0;
	void order(Gajun gajun) {
		gajunArray[index++] = gajun;
		System.out.println(gajun + "을 주문하였습니다.");
	}
	void showOrderedList() {
		String orderedItem = " ";
		for (int i = 0; i < gajunArray.length; i++) {
			orderedItem += (i ==0 ) ? gajunArray[i] : "," + gajunArray[i];
		}
		
		System.out.println("주문 목록 : " + orderedItem);
	}
}

public class ParameterPolyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer by = new Buyer();
		by.order(new Refrigerator());
		by.order(new MicroOver());
		by.order(new Aircon());
		
		//요구사항 추가
		//현재까지 주문한 내역을 출력하라
		by.showOrderedList();

	}

}
