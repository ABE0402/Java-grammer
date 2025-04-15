
//Object 클래스의 equals 메소드의 기능은 "==" 와 같다. 
//만약, 특정 클래스 객체의 비교방식을 변경하려면 해당 클래스에서 equals 메소드를 업무규칙에 맞게 재정의하면 된다. 

class Student3{
	String name;
	int number;
	public Student3(String name,int number) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.number = number;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		//name 속성값과 number 속성값은 Object 클래스에는 정의되어 있지 않고 
		//Student3 클래스에만 정의됨 
		Student3 student = null;
		if(obj instanceof Student3) {
			student = (Student3)obj;
		}
		return student != null && student.name.equals(name) && student.number == number;
	}
}
public class EqualsTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student3 student1 = new Student3("오정원", 10);
		Student3 student2 = new Student3("오정원", 10);
		Student3 student3 = new Student3("이용빈", 15);
		
		System.out.println("student1 == student2 : " + (student1 == student2));
		System.out.println("student1 == student2 : " + (student1.equals(student2)));
		

	}

}
