
abstract class Ship3{
	abstract int getPersonNumber();	
	abstract int getWeaponNumber();
	abstract String getName();
}
class Boat extends Ship3{
	@Override
	int getPersonNumber() {
		return 6;
	}
	@Override
	int getWeaponNumber() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	String getName() {
		// TODO Auto-generated method stub
		return "보트";
	}
}

class Crusie extends Ship3{
	@Override
	int getPersonNumber() {
		return 6;
	}
	@Override
	int getWeaponNumber() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	String getName() {
		// TODO Auto-generated method stub
		return "전함무궁화";
	}
}

class ShipUtil {
	public static void search(Ship3 ship) {
		// TODO Auto-generated constructor stub
		System.out.println("사람수 : " + ship.getPersonNumber());
		System.out.println("무기수 : " + ship.getWeaponNumber());
		System.out.println("이름 : " + ship.getName());
	}
}

public class Ship1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShipUtil.search(new Boat());
		ShipUtil.search(new Crusie());

	}

}
