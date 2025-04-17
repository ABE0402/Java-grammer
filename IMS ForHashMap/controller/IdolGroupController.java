package controller;

import java.util.Scanner;

import action.Action;

//클라이언트의 전체 요청을 받는 컨트롤러
public class IdolGroupController {

	public void processRequest(Action action, Scanner scanner) {
		// TODO Auto-generated method stub
		action.execute(scanner);
		
	}
}
