import java.util.Scanner;

class HealthSuper {
	protected char gender;
	protected double tall;
	protected double weight;
	
	void Health() {
		this.gender=gender;
		this.tall=0.0;
		this.weight=0.0;
	}
	public void input()	{
		Scanner sc = new Scanner(System.in);
		System.out.print("성별(m/f)을 입력하세요 : ");
		gender = sc.next().charAt(0);
		System.out.print("신장을 입력하세요 : ");
		tall = sc.nextDouble();
		System.out.print("체중을 입력하세요 : ");
		weight = sc.nextDouble();

	}
	public void output1() {
		System.out.println("성별(M/F) : " + gender);
		System.out.println("신장(Cm) : " + tall);
		System.out.println("체중(Kg) : " + weight);
	}

}

class HealthChild extends HealthSuper {
	private double s_weight;
	private double fat;
	private String result ;

	public void calculate(){
		if(gender == 'm') {
			s_weight = (tall-100)*0.9;
		}
		else if (gender == 'f') {
			s_weight = (tall-100)*0.85;
		}
		else {
			System.out.println("성별을 잘못 입력하셨습니다.");
		}

		fat = (weight / s_weight)*100;

		if (fat <= 90) {
			result = "저체중입니다.";
		}
		else if (fat <= 110) {
			result = "정상(표준체중)입니다.";
		}
		else if (fat <= 120) {
			result = "과체중입니다.";
		}
		else if (fat <= 130) {
			result = "경도비만입니다.";
		}
		else if (fat <= 150) {
			result = "중도비만입니다.";
		}
		else {
			result = "고도비만입니다.";
		}
	}
	public void output2() {
		output1();
		System.out.println("성별 - " + gender );
		System.out.println("신장 - " + tall );
		System.out.println("체중 - " + weight );

		System.out.printf("당신의 비만도는 %.2f이고, %s",fat,result );
	}

}

public class Workshop7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HealthChild hc = new HealthChild();
		hc.input();
		hc.calculate();
		hc.output2();

	}

}