package action;

import java.util.HashMap;
import java.util.Scanner;

import service.IdolGroupRegistService;
import util.ConsoleUtil;

public class IdolGroupRegistAction implements Action {

	@Override
	public void execute(Scanner scanner) {
	    ConsoleUtil consoleUtil = new ConsoleUtil();
	    
	    HashMap<String, String> newIdolGroupHashMap = 
	    		consoleUtil.getNewIdolGroupHashMap(scanner);

	    IdolGroupRegistService idolGroupRegistService = new IdolGroupRegistService();
	    boolean registSuccess = idolGroupRegistService.registIdolGroup(newIdolGroupHashMap);

	    if (registSuccess) {
	        consoleUtil.printRegistSuccessMessage(newIdolGroupHashMap.get("idolGroupName"));
	    } else {
	        consoleUtil.printRegistFailMessage(newIdolGroupHashMap.get("idolGroupName"));
	    }
	}

}

