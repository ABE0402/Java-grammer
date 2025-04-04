
public class Student extends Person1 {
	String schoolkind;
	int grade;
	@Override
	void showSleepingStyle() {
		// TODO Auto-generated method stub
		System.out.println("학생들의 수면스타일은 규칙적이다.");
	}
	
	//부모클래스에 정의되어 있지 않은 메소드
	
	public void Student() {
		System.out.println("공부를 한다");
	}
}
