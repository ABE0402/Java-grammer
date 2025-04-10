package action;

import java.util.Scanner;

import dto.IdolGroupDTO;
import dto.SearchDTO;
import service.IdolGroupSearchService;
import util.ConsoleUtil;

public class IdolGroupSearchAction implements Action {

	@Override
	public void execute(Scanner scanner) {
		// TODO Auto-generated method stub
		//1. 검색을 하려면 검색조건과 검색값이 필요함
		//검색을 할때는 이 검색조건과 검색값이 관련성 있게 하나의 데이터 단위로 처리되는 것이 좋다.
		//검색조건과 검색값을 하나의 단위에 저장하려면 검색데이터클래스를 정의하고 해당 클래스에
		//검색조건과 검색값을 속성으로 정의해 놓으면 된다.
		//클래스 - 사용자 정의 데이터의 의미도 있다.

		/* 교수님 방법
		ConsoleUtil consoleUtil = new ConsoleUtil();
		SearchDTO searchDTO = consoleUtil.getSearchDTO(scanner);

		//2. 검색 조건에 맞게 검색 
		IdolGroupSearchService idolGroupSearchService 
		= new IdolGroupSearchService();
		if(searchDTO.getSearchCondition().equals("이름")) {
			//이름은 식별자 이기때문에 동일한 이름을 가진 그룹이 2개 이상일 수 없다.
			//따라서 검색메소드의 리턴타입은 아이돌 그룹 하나의 정보를 저장하는 IdolGroupDTO가 되어야한다.
			IdolGroupDTO searchedIdolGroupDTO = 
					IdolGroupSearchService.searchIdolGroupByName(searchDTO.getSearchValues());

			consoleUtil.printSearchIdolGroupByName(searchedIdolGroupDTO);
		}
		else if(searchDTO.getSearchCondition().equals("나이대")) {
			//나이대는 여러개의 아이돌 그룹들이 동일한 값을 가질 수 있다.
			//따라서 검색메소드의 리턴타입은 여러 개의 아이돌 그룹 하나의 정보를 저장하는 IdolGroupDTO[]이 되어야한다.
			IdolGroupDTO[] searchedIdolGroupDTOArray = 
					IdolGroupSearchService.searchIdolGroupByGeneration(searchDTO.getSearchValues());

			consoleUtil.printSearchIdolGroupDTOArray(searchedIdolGroupDTOArray);
		}
		*/ 
		
		ConsoleUtil consoleUtil = new ConsoleUtil();
		IdolGroupSearchService searchService = new IdolGroupSearchService();


		String ctr = consoleUtil.getSearchCondition(scanner);

		if ("이름".equals(ctr)) {
			String name = consoleUtil.getSearchValue("검색할 이름: ", scanner);
			IdolGroupDTO result = searchService.searchIdolGroupByIdolGroupName(name);
			consoleUtil.printSearchIdolGroupByName(result);

		} else if ("나이대".equals(ctr)) {
			int generation = consoleUtil.getSearchNum("검색할 나이대: ", scanner);
			IdolGroupDTO[] resultArray = searchService.searchIdolGroupArrayByGeneration(generation);
			consoleUtil.printSearchIdolGroupArrayByGeneration(resultArray);


		}

	}
}
