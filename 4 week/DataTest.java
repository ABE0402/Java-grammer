import java.util.Scanner;

class Date{
	int year;
	int month;
	int date;

	public Date(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}
	
	public void print() {
		System.out.println(year + "."+ month + "." +date );
	}
	public void print2() {
		System.out.println(year + "년"+ month + "월" + date + "일");
	}
}


class Movie{
	String name;
	double score;
	String coach;
	int year;
	
	public Movie(String name, double score, String coach, int year) {
		this.name = name;
		this.score = score;
		this.coach = coach;
		this.year = year;
	}
	
	public void print() {
		System.out.println("영화제목 :" + name);
		System.out.println("평점 :" + score);
		System.out.println("감독 :" + coach);
		System.out.println("발표된 연도 :" + year);
	}
}

//class Out {
//	{
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("문자열을 입력하세요 :");
//		String st = scanner.nextLine();
//	    String reverseStr = "";
//	    
//	    for (int i = 1; i <= st.length(); i++) {
//	        reverseStr += st.charAt(st.length() - i);
//	    }
//	    System.out.println("reverseStr = " + reverseStr);
//		
//
//	}
//
//}
public class DataTest{
	public static void main(String[] args) {
		Date dt = new Date(2018,4,12);
		dt.print();
		dt.print2();
		Movie mv = new Movie("아바타", 9.8, "제임스 카메론",2009);
		mv.print();
		Out();
	}

	private static void Out() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("문자열을 입력하세요 :");
		String st = scanner.nextLine();
	    String reverseStr = "";
	    
	    for (int i = 1; i <= st.length(); i++) {
	        reverseStr += st.charAt(st.length() - i);
	    }
	    System.out.println("역문자열 = " + reverseStr);
	}
	  
}

for (int i = 1; i <= st.length(); i++) {

}	

