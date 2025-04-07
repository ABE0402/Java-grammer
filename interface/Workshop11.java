import java.util.Scanner;

interface Speed{
	int speed =10;
	void upSpeed(int inc) ;
	void downSpeed(int dec);
	void stop();
}

interface Display{
	void disp();
}


class Car2 implements Speed, Display{
	int inputVelocity;
	int velocity = Speed.speed;
	

	void input() {
		Scanner sc= new Scanner(System.in);
		while(true) {
			System.out.print("속도입력 : " );
			inputVelocity= sc.nextInt();

			if (inputVelocity < 0) {
				downSpeed(inputVelocity);
			}
			else if(inputVelocity > 0) {
				upSpeed(inputVelocity);
			}
			if(velocity > 0) {
			disp();
			}
			else {
				stop();
				break;
			}
	}
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stubs
		System.out.println("현재 속도: " + velocity);
	}

	@Override
	public void upSpeed(int inc) {
		// TODO Auto-generated method stub
		velocity += inc;
	}

	@Override
	public void downSpeed(int dec) {
		// TODO Auto-generated method stub
		velocity += dec;
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("정지하였습니다.");
	}
}

public class Workshop11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car2 car = new Car2();
		car.input();
	}

}
