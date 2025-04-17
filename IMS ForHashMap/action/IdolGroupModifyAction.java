package action;

import java.util.HashMap;
import java.util.Scanner;

import dto.IdolGroupDTO;
import service.IdolGroupModifyService;
import util.ConsoleUtil;


public class IdolGroupModifyAction implements Action {

	@Override
	public void execute(Scanner scanner) {
		// TODO Auto-generated method stub
		ConsoleUtil consoleUtil = new ConsoleUtil();
		String idolGroupNameForModify = consoleUtil.getIdolGroupName("수정할 아이돌 그룹 이름 : ", scanner);
		
		IdolGroupModifyService idolGroupModifyService = 
				new IdolGroupModifyService();
		
		HashMap<String, String> oldIdolGroupHashMap = 
				idolGroupModifyService.getOldIdolGroupHashMap(idolGroupNameForModify);
		
		HashMap<String, String> newIdolGroupHashMap = 
				consoleUtil.getNewIdolGroupHashMap(oldIdolGroupHashMap,scanner);
		
		
		boolean modifySuccess = idolGroupModifyService.modifyIdolGroup(oldIdolGroupHashMap);
		
		if(modifySuccess) {
			consoleUtil.printModifySuccessMessage(idolGroupNameForModify);
		}
		else {
			consoleUtil.printModifyFailMessage(idolGroupNameForModify);
		}
	}

}
