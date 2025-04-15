class Time{
	private int hour;
	private int minute;
	private int second;
	
	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	//만약 해당 클래스객체의 정보를 원하는 형태로 반환하고 싶으면 
	//Object 클래스에서 상속받은 toString() 메소드를 자기자신 클래스에 맞게 재정의하면 된다.
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return hour + "시" + minute + "분" + second + "초";
	}
}
public class ToStringTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Time time = new Time(10, 15, 20);
		
		System.out.println(time);
		//자바에서 객체가 print 메소드의 인자로 지정되면 자동으로 해당 객체의 toString() 메소드가 호출됨
		System.out.println(time.toString());

	}

}
