import java.util.Scanner;

public class Workshop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		
		while(run) {
			System.out.println("---------------");
			System.out.println("1. 에코 | 2. 종료");
			System.out.println("---------------");
			System.out.println("선택> ");
			
			int chose = 0 ;
			String menNum = scanner.nextLine();
			if (chose == 1) {
				System.out.print("입력 > " + menNum);
				System.out.print("에코 > " + menNum);
			}
			else if(chose == 2){
				run = false;
				break;
			}
		}
		
		scanner.close();
		System.out.println("프로그램 종료");
		

	}

}
