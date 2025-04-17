package action;

import java.util.HashMap;
import java.util.Scanner;

import service.IdolGroupViewService;
import util.ConsoleUtil;

public class IdolGroupViewAction implements Action {

    @Override
    public void execute(Scanner scanner) {
        ConsoleUtil consoleUtil = new ConsoleUtil();
        String idolGroupName = consoleUtil.getIdolGroupName("조회할 아이돌 그룹 이름 : ", scanner);

        IdolGroupViewService idolGroupViewService = new IdolGroupViewService();
        HashMap<String, String> idolGroupHashMap = 
        		idolGroupViewService.getIdolGroup(idolGroupName);

        consoleUtil.printIdolGroupHashMap(idolGroupHashMap);
    }
}
