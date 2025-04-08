package action;

import java.util.Scanner;

import dto.IdolGroupDTO;
import service.IdolGroupRegistService;
import util.ConsoleUtil;

// 각 요청을 처리하는 컨트롤러
public class IdolGroupRegistAction implements Action {

	@Override
	public void execute(Scanner scanner) {
		// TODO Auto-generated method stub
		ConsoleUtil consoleUtil = new ConsoleUtil();
		
		IdolGroupDTO newIdolGroupDTO = consoleUtil.getNewIdolGroupDTO(scanner);
		
		// 등록 작업을 처리
		// 실질적인 비지니스 로직은 컨트롤러에 정의되는 것이 아니고
		// Service 클래스에서 처리해야 함
		IdolGroupRegistService idolGroupRegistService
		= new IdolGroupRegistService();
		
		boolean registSuccess = idolGroupRegistService.registIdolGroup(newIdolGroupDTO);
		
		if(registSuccess) {
			consoleUtil.printRegistSuccessMessage(newIdolGroupDTO.getIdolGroupName());
		}
		else {
			consoleUtil.printRegistFailMessage(newIdolGroupDTO.getIdolGroupName());
		}
	}

}
