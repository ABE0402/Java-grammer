package action;

import java.util.Scanner;

import service.IdolGroupDeleteService;
import util.ConsoleUtil;

public class IdolGroupDeleteAction implements Action {

    @Override
    public void execute(Scanner scanner) {
        ConsoleUtil consoleUtil = new ConsoleUtil();
        String idolGroupNameToDelete = consoleUtil.getIdolGroupName("삭제할 아이돌 그룹 이름: ", scanner);

        IdolGroupDeleteService deleteService = new IdolGroupDeleteService();
        boolean deleteSuccess = deleteService.deleteIdolGroup(idolGroupNameToDelete);
       
        if (deleteSuccess) {
            consoleUtil.printDeleteSuccessMessage(idolGroupNameToDelete);
        } else {
            consoleUtil.printDeleteFailMessage(idolGroupNameToDelete);
        }
    }
}
