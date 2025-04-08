package action;

import java.util.Scanner;
import service.IdolGroupListService;
import dto.IdolGroupDTO;
import util.ConsoleUtil;

public class IdolGroupListAction implements Action {

	@Override
	public void execute(Scanner scanner) {
		// TODO Auto-generated method stub
		
	
		IdolGroupListService idolGroupListService = new IdolGroupListService();
		
		IdolGroupDTO[] idolGroupArray = idolGroupListService.getIdolGroupArray();
		
		 ConsoleUtil consolUtil = new ConsoleUtil();
		 
		 consolUtil.printIdolGroupList(idolGroupArray);

	}

}
