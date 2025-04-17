package action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import service.IdolGroupListService;
import util.ConsoleUtil;

public class IdolGroupListAction implements Action {

    @Override
    public void execute(Scanner scanner) {
        IdolGroupListService idolGroupListService = new IdolGroupListService();
        
        ArrayList<HashMap<String, String>> idolGroupList = 
        		idolGroupListService.getIdolGroupList();

        ConsoleUtil consoleUtil = new ConsoleUtil();
        consoleUtil.printIdolGroupList(idolGroupList);
    }
}
