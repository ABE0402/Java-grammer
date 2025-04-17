package ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import action.Action;
import action.IdolGroupDeleteAction;
import action.IdolGroupListAction;
import action.IdolGroupModifyAction;
import action.IdolGroupRegistAction;
import action.IdolGroupSearchAction;
import action.IdolGroupViewAction;
import controller.IdolGroupController;

public class IdolGroupUI {
	
	public static ArrayList<HashMap<String, String>> idolGroupList = 
			new ArrayList<HashMap<String, String>>();
	
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

			Action action = null;

			switch (menuNumber) {
			case 1:
				action = new IdolGroupRegistAction(); 
				break;
			case 2:
				action = new IdolGroupListAction();
				break;
			case 3:
				action = new IdolGroupViewAction();
				break;
			case 4:
				action = new IdolGroupModifyAction();
				break;
			case 5: 
				action = new IdolGroupDeleteAction();
				break;
			case 6: 
				action = new IdolGroupSearchAction();
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
