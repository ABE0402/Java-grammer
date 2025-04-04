import java.util.Scanner;

public class Loginprocess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 데이터베이스 데이터
		String dbId = "java";
		String dbPasswd = "1111";
		boolean stop = false;
		// 1. 사용자 입력
		Scanner scanner = new Scanner(System.in);

		    do {
			System.out.print("아이디 : ");
			String userId = scanner.next();
			System.out.print("비밀번호 : ");
			String userPasswd = scanner.next();

			// 메모리 주소를 비교하려면 == 사용
			// 문자열 값을 비교하려면 .equals() 사용
			// 2. 연산
			int loginResult;

			if(!dbId.equals(userId)) {
				loginResult = 1;
			}
			else if(!dbPasswd.equals(userPasswd)) {
				loginResult = 2;
			}
			else {
				loginResult = 3;
			}	

			// 3. 결과 출력
			if(loginResult == 1) {
				System.out.println("당신은 우리 회원이 아닙니다.");
			}
			else if(loginResult == 2) {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
			else {
				System.out.println("로그인 성공");
			} 
		    }
		while(!stop);
		}
	}



