

class Student1 {
	//학교 종류를 상수로 다루지 않고, enum 단위로 다룸
	SchoolType schoolType;
	
	public Student1(SchoolType schoolType) {
		// TODO Auto-generated constructor stub
		this.schoolType = schoolType;
		
	}
	
}

enum SchoolType{
	 ELEMENTARY, MIDDLE, HIGH, UNIVERSITY
}
public class EnumTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Student1 student1 = new Student1(SchoolType.ELEMENTARY);
		
		System.out.println("student1.schoolType = " + student1.schoolType);
		
		
		if(student1.schoolType == SchoolType.ELEMENTARY) {
			System.out.println("초등학생입니다.");
		}
	}

}
