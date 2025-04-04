import java.util.Scanner;

class member{
	int balance = 0; 

	public void money1(int deposit2) {
		balance += deposit2 ;
	}
	public void money2(int withdraw2) {
		if (withdraw2 > balance) {
			System.out.println("잔고가 부족합니다.");
		} else {
			balance -= withdraw2;  
		}
	}
	public void money3() {
		System.out.println("현재 잔액은 (" + balance +")원 입니다.");  
	}
}



public class Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		member mb = new member();

		while (run) {
			System.out.println("--------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("--------------------------------");
			System.out.print("선택> ");

			int num = scanner.nextInt();


			scanner.nextLine(); 


			if (num == 1) {
				System.out.println("선택 > " + num);
				System.out.print("예금액 > ");
				int deposit = scanner.nextInt();
				mb.money1(deposit);
			} 
			else if (num == 2) {
				System.out.println("선택 > " + num);
				System.out.print("출금액 > ");
				int withdraw = scanner.nextInt();
				mb.money2(withdraw);
				
			} 
			else if (num == 3) {
				System.out.println("선택 > " + num);
				mb.money3();
			} 
			else if (num == 4) {
				System.out.println("선택 > " + num);
				run = false;  
			} 
			else {
				System.out.println("잘못된 선택입니다.");
			}
		}

		scanner.close();
		System.out.println("프로그램 종료");
	}
}


