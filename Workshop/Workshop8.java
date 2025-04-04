class Entry{
	String word;
	 Entry(){
		System.out.println("*****약어 사전 ******");
	}
	Entry(String w) {
		this();
		word = w;
		writeView();
	} // Entry() 호출
	public void writeView() {
		System.out.println("약어 : " + word);
	}
}
class SubClass extends Entry{
	String definition ;
	int year;
	SubClass(String w){
		super(w);
	}; // Entry(String w) 호출
	SubClass(String w, String d, int y){
		this(w);
		definition = d;
		year = y;
		printView();
	};
	
	public void printView() {
		System.out.println("원어 : " + definition);
		System.out.println("시기 : " + year);
	}
}
public class Workshop8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass sbc = new SubClass("OOP", "Object Criented Programing", 1941);
	}

}