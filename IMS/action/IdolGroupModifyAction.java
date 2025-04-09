package action;

import java.util.Scanner;

import dto.IdolGroupDTO;
import service.IdolGroupModifyService;
import util.ConsoleUtil;


public class IdolGroupModifyAction implements Action {

	@Override
	public void execute(Scanner scanner) {
		// TODO Auto-generated method stub
		//1. 수정 작업을 하려면 우선 어떤 아이돌 그룹 정보를 수정할 지 수정할 아이돌 그룹 이름을 먼저 입력 받는다.
		ConsoleUtil consoleUtil = new ConsoleUtil();
		String idolGroupNameForModify = consoleUtil.getIdolGroupName("수정할 아이돌 그룹 이름 : ", scanner);
		
		//2. 사용자가 입력한 아이돌 그룹 이름을 가지고 있는 아이돌 그룹의 이전 정보를 가져온다.
		//웹 화면에서도 회원정보 수정할때 등록할 때 입력한 정보를 보여주듯이
		IdolGroupModifyService idolGroupModifyService
		= new IdolGroupModifyService();
		IdolGroupDTO oldidolGroupDTO = IdolGroupModifyService.getOldIdolGroupDTO(idolGroupNameForModify);
		
		//3. 사용자에게 이전정보를 보여주면서 수정할 새 정보를 입력 받는다.
		//새 정보들은 하나의 아이돌 그룹 정보(IdolGroupDTO)로 반환 받는다.
		IdolGroupDTO newIdolGroupDTO = consoleUtil.getNewIdolGroupDTO(oldidolGroupDTO, scanner);

		//4. 이전 정보를 새로운 정보로 수정
		//수정 성공여부는 반환 받아야 함
		boolean modifySuccess = idolGroupModifyService.modifyIdolGroup(oldidolGroupDTO);
		
		//5. 수정 결과출력(응답)
		if(modifySuccess) {
			consoleUtil.printModifySuccessMessage(idolGroupNameForModify);
		}
		else {
			consoleUtil.printModifyFailMessage(idolGroupNameForModify);
		}
	}

}
