

//상수 : 특정값을 상수명을 정의하고 해당 값을 사용할 때는 상수명으로 사용함으로써 가독성을 향상 


class Student{
	int schoolType; 
	
	//학교 종류를 상수로 정의함 
	public final static int ELEMENTARY = 1;
	public final static int MIDDLE = 2;
	public final static int HIGH = 3;
	public final static int UNIVERSITY = 4;
	
	
	//객체를 생성할때 학교종류를 초기화 시키는 생성자를 정의 
	public Student(int schoolType) {
		// TODO Auto-generated constructor stub
		this.schoolType = schoolType;
		
	}
	
	//학교 종류를 상수로 정의한 이유는 
	//학교종류값을 다룰때는 꼭 상수를 사용해서 가독성을 향상시키는 것이 목적이다. 
}
public class EnumTest1 {

	
		public static void main(String[] args) {
			Student student1 = new Student(Student.ELEMENTARY);//정확한 사용
			Student student2 = new Student(1);//상수의 사용목적에 어긋남 
			
			if(student1.schoolType == Student.ELEMENTARY) {
				System.out.println("초등학생입니다.");//정확한 사용
			}
			if(student1.schoolType == 1) {
				System.out.println("초등학생입니다.");//상수의 사용목적에 어긋남
			}
			
			System.out.println("student1.schoolType = " + student1.schoolType);
			//ELEMENTARY 라고 출력되면 좋을텐데.. 결과값은 1 이 나옴 
			
		}
}
