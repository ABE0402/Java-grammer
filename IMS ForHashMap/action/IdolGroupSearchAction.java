package action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import dto.IdolGroupDTO;
import dto.SearchDTO;
import service.IdolGroupSearchService;
import util.ConsoleUtil;

public class IdolGroupSearchAction implements Action {

	@Override
	public void execute(Scanner scanner) {
		
		ConsoleUtil consoleUtil = new ConsoleUtil();
		SearchDTO searchDTO = consoleUtil.getSearchDTO(scanner);
		
		IdolGroupSearchService idolGroupSearchService
		= new IdolGroupSearchService();
		
		if(searchDTO.getSearchCondition().equals("이름")) {
			HashMap<String, String> searchedIdolGroupHashMap = 
					idolGroupSearchService.searchIdolGroupByName(searchDTO.getSearchValue());
			consoleUtil.printSearchedIdolGroupHashMap(searchedIdolGroupHashMap);
			
		}
		else if(searchDTO.getSearchCondition().equals("나이대")) {
			
			ArrayList<HashMap<String, String>> searchedIdolGroupHashMapList = 
					idolGroupSearchService.searchIdolGroupListByGeneration(searchDTO.getSearchValue());
			
			consoleUtil.printSearchedIdolGroupHashMapList(searchedIdolGroupHashMapList);
		}
		
		
		
		
	}

}








