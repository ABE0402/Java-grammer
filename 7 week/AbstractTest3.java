// 추상클래스에 의한 다형성

abstract class Vehicle{
	abstract void transfer();
}

class Car extends Vehicle{
	@Override
	void transfer() {
		// TODO Auto-generated method stub
		System.err.println("차도로 나른다");
	}
}
class Ship extends Vehicle{
	@Override
	void transfer() {
		// TODO Auto-generated method stub
		System.err.println("바다로 나른다");
	}
}
class Plane extends Vehicle{
	@Override
	void transfer() {
		// TODO Auto-generated method stub
		System.err.println("하늘로 나른다");
	}
}

class VehicleInfo{
	void printTransferStyle(Vehicle vehicle) {
		vehicle.transfer();
	}
}
public class AbstractTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VehicleInfo vi = new VehicleInfo();
		vi.printTransferStyle(new Car());
		vi.printTransferStyle(new Ship());
		vi.printTransferStyle(new Plane());

	}

}
