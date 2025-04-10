package action;

import java.util.Scanner;

import service.IdolGroupDeleteService;
import util.ConsoleUtil;

public class IdolGroupDeleteAction implements Action {

    @Override
    public void execute(Scanner scanner) {
    	//1. 삭제할 아이돌 그룹의 이름을 사용자로부터 입력 받기
        ConsoleUtil consoleUtil = new ConsoleUtil();
        String idolGroupNameToDelete = consoleUtil.getIdolGroupName("삭제할 아이돌 그룹 이름: ", scanner);

        //2. 입력받은 아이돌 그룹 이름을 가지고 있느 아이돌 그룹을 삭제
        IdolGroupDeleteService deleteService = new IdolGroupDeleteService();
        boolean deleteSuccess = deleteService.deleteIdolGroup(idolGroupNameToDelete);
       
        //3. 삭제 성공 여부에 따라서 응답 메시지 출
        if (deleteSuccess) {
            consoleUtil.printDeleteSuccessMessage(idolGroupNameToDelete);
        } else {
            consoleUtil.printDeleteFailMessage(idolGroupNameToDelete);
        }
    }
}
