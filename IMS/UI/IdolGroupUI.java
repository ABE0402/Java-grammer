package UI;

import java.util.Scanner;

import action.Action;
import action.IdolGroupListAction;
import action.IdolGroupRegistAction;
import controller.IdolGroupController;
import dto.IdolGroupDTO;

public class IdolGroupUI {
	public static IdolGroupDTO[] idolGroupArray = new IdolGroupDTO[0];
	// 나중에 이 배열 영역이 테이블이라고 생각
	// IdolGroupDTO 객체 하나하나가 테이블에 저장되는 인스턴스 즉 레코드라고 생각하면 됨
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean stop = false;
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter(System.getProperty("line.separator"));
		IdolGroupController idolGroupController = new IdolGroupController();

		do {
			System.out.println("=====아이돌 그룹관리=====");
			System.out.println("1. 아이돌 그룹 등록"); // C(Create)
			System.out.println("2. 아이돌 그룹 목록보기"); // R(Read)		
			System.out.println("3. 아이돌 그룹 정보보기"); // R(Read)		
			System.out.println("4. 아이돌 그룹 정보수정"); // U(Update)		
			System.out.println("5. 아이돌 그룹 정보삭제"); // D(Delete)		
			System.out.println("6. 아이돌 그룹 검색"); // R(Read)		
			System.out.println("7. 프로그램 종료");

			System.out.print("메뉴번호 입력 : ");
			int menuNumber = scanner.nextInt();

			// 요청처리는 다형성을 사용해서 처리 - 인터페이스 사용
			Action action = null;

			switch (menuNumber) {
			case 1:
				action = new IdolGroupRegistAction();
				break;
			case 2:
				action = new IdolGroupListAction();
				break;
			default:
				break;
			}

			if(action != null) {
				idolGroupController.processRequest(action, scanner);
			}
		}
		while(!stop);
	}

}
