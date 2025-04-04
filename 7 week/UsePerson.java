class Person {
	private String name; //외부에서 내부에 속성에 접근 못하게 캡슐화해서 막아준다.
	private int age;
	private String address;


	//드레그하고 alt+shift+s Generate getter setter 클릭 후 만들면 아래 생성
	
	public void setName(String name) {
		this.name= name; 
	}
	public String getName() {
		return this.name;
	}
	public void setAge(int age) {
		this.age= age;
	}
	public int getAge(){
		return this.age;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress(){
		return this.address;
	}
	@Override
	public String toString() {
		return name + " " + age + " "+ address;
	}
}
public class UsePerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person []pArr = new Person[3];
		for(int i=0; i<pArr.length; i++) {
			pArr[i]= new Person();
		}
		pArr[0].setName("홍길동1");
		pArr[1].setAge(21);
		pArr[2].setAddress("서울시 구로구 구로동 212번지");
		
		pArr[0].setName("홍길동2");
		pArr[1].setAge(22);
		pArr[2].setAddress("서울시 구로구 구로동 213번지");
		
		pArr[0].setName("홍길동3");
		pArr[1].setAge(23);
		pArr[2].setAddress("서울시 구로구 구로동 214번지");
		
		for(int i=0; i<pArr.length; i++) {
			System.out.println(pArr[i]);
		}
		
		
	}

}