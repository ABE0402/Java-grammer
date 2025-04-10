package util;

import java.util.Iterator;
import java.util.Scanner;

import dto.IdolGroupDTO;
import dto.SearchDTO;

//주로 콘솔에서 
public class ConsoleUtil {

	public IdolGroupDTO getNewIdolGroupDTO(Scanner scanner) {
		// TODO Auto-generated method stub
		System.out.println("====등록별 아이돌 그룹 정보 입력====");
		System.out.println("아이돌 그룹이름:");
		String idolGroupName = scanner.next();
		System.out.println("아이돌 그룹소속사:");
		String company = scanner.next();
		System.out.println("아이돌 그룹 성별:");
		String gender = scanner.next();
		System.out.println("아이돌 그룹 장르:");
		String genre = scanner.next();
		System.out.println("아이돌 그룹 데뷔년도:");
		int year = scanner.nextInt();
		System.out.println("아이돌 그룹 대표곡:");
		String song = scanner.next();
		System.out.println("아이돌 그룹 세대:");
		int generation = scanner.nextInt();

		IdolGroupDTO newIdolGroupDTO = new IdolGroupDTO();
		newIdolGroupDTO.setIdolGroupName(idolGroupName);
		newIdolGroupDTO.setCompany(company);
		newIdolGroupDTO.setGender(gender);
		newIdolGroupDTO.setGenre(genre);
		newIdolGroupDTO.setSong(song);
		newIdolGroupDTO.setYear(year);
		newIdolGroupDTO.setGeneration(generation);



		return newIdolGroupDTO;
	}

	public void printRegistSuccessMessage(String idolGroupName) {
		// TODO Auto-generated method stub
		System.out.println(idolGroupName + "아이돌 그룹 등록 성공");

	}

	public void printRegistFailMessage(String idolGroupName) {
		// TODO Auto-generated method stub
		System.out.println(idolGroupName + "아이돌 그룹 등록 실패");
	}

	public void printIdolGroupList(IdolGroupDTO[] idolGroupArray) {
		if(idolGroupArray.length == 0) {
			System.out.println("아직 등록된 아이돌 그룹이 없습니다.");
		}
		else {
			for (int i = 0; i < idolGroupArray.length; i++) {
				System.out.println(idolGroupArray[i]);
			}
		}
	}

	public String getIdolGroupName(String label, Scanner scanner) {
		// TODO Auto-generated method stub
		System.out.print(label);
		return scanner.next();
	}

	public void printIdolGroupDTO(IdolGroupDTO idolGroupDTO) {
		// TODO Auto-generated method stub
		System.out.println(idolGroupDTO);
	}

	public IdolGroupDTO getNewIdolGroupDTO(IdolGroupDTO oldidolGroupDTO, Scanner scanner) {
		// TODO Auto-generated method stub
		System.out.println("====수정할 아이돌 그룹 정보 입력====");

		System.out.println("이전 그룹 소속사 : " + oldidolGroupDTO.getCompany());	
		System.out.println("아이돌 그룹소속사:");
		String company = scanner.next();

		System.out.println("이전 그룹 성별 : " + oldidolGroupDTO.getGender());	
		System.out.println("아이돌 그룹 성별:");
		String gender = scanner.next();

		System.out.println("이전 그룹 장르 : " + oldidolGroupDTO.getGenre());	
		System.out.println("아이돌 그룹 장르:");
		String genre = scanner.next();

		System.out.println("이전 그룹 데뷔년도 : " + oldidolGroupDTO.getYear());	
		System.out.println("아이돌 그룹 데뷔년도:");
		int year = scanner.nextInt();

		System.out.println("이전 그룹 대표곡 : " + oldidolGroupDTO.getSong());	
		System.out.println("아이돌 그룹 대표곡:");
		String song = scanner.next();

		IdolGroupDTO newIdolGroupDTO = new IdolGroupDTO();
		newIdolGroupDTO.setCompany(company);
		newIdolGroupDTO.setGender(gender);
		newIdolGroupDTO.setGenre(genre);
		newIdolGroupDTO.setIdolGroupName(oldidolGroupDTO.getIdolGroupName());
		newIdolGroupDTO.setSong(song);
		newIdolGroupDTO.setYear(year);

		return newIdolGroupDTO;
	}

	public void printModifySuccessMessage(String idolGroupNameForModify) {
		// TODO Auto-generated method stub
		System.out.println(idolGroupNameForModify + "아이돌 그룹 정보 수정 성공");
	}

	public void printModifyFailMessage(String idolGroupNameForModify) {
		// TODO Auto-generated method stub
		System.out.println(idolGroupNameForModify + "아이돌 그룹 정보 수정 실패");

	}

	public void printDeleteSuccessMessage(String idolGroupNameToDelete) {
		// TODO Auto-generated method stub
		System.out.println(idolGroupNameToDelete + " 아이돌 그룹 정보 삭제 성공");
	}
	public void printDeleteFailMessage(String idolGroupNameToDelete) {
		// TODO Auto-generated method stub
		System.out.println(idolGroupNameToDelete + " 아이돌 그룹 정보 삭제 실패");
	}

	public String getSearchCondition(Scanner scanner) {
		System.out.print("검색 조건 (이름 or 나이대): ");
		return scanner.next();
	}


	public String getSearchValue(String label, Scanner scanner) {
		System.out.print(label);
		return scanner.next();
	}

	public int getSearchNum(String label, Scanner scanner) {
		// TODO Auto-generated method stub
		System.out.print(label);
		return scanner.nextInt();
	}


	public void printSearchIdolGroupByName(IdolGroupDTO dto) {
		if (dto != null) {
			System.out.println("=== 검색 결과 ===");
			System.out.println(dto);
		} else {
			System.out.println("해당 이름의 아이돌 그룹을 찾을 수 없습니다.");
		}
	}
	
	//searchaction 교수님이 만든거
	public void printSearchIdolGroupDTOArray(IdolGroupDTO[] searchedIdolGroupDTOArray) {
		// TODO Auto-generated method stub
		for (int i = 0; i < searchedIdolGroupDTOArray.length; i++) {
			System.out.println(searchedIdolGroupDTOArray[i]);
		}
	}

	public void printSearchIdolGroupArrayByGeneration(IdolGroupDTO[] groupArray) {
		if (groupArray.length == 0) {
			System.out.println("해당 나이대에 속한 아이돌 그룹이 없습니다.");
		} else {
			System.out.println("=== 검색 결과 ===");
			for (IdolGroupDTO group : groupArray) {
				System.out.println(group);
			}
		}
	}
	//교수님 방법
	public SearchDTO getSearchDTO(Scanner scanner) {
		// TODO Auto-generated method stub
		System.out.println("검색조건(이름 | 나이대) : ");
		String searchCondition = scanner.next();

		if(searchCondition.equals("이름")) {
			System.out.println("검색할 이름 : ");
		}
		else if(searchCondition.equals("나이대")) {
			System.out.println("검색할 나이대: ");
		}
		String searchValue = scanner.next();

		dto.SearchDTO searchDTO = new SearchDTO();
		searchDTO.setSearchCondition(searchCondition);
		searchDTO.setSearchValues(searchValue);

		return searchDTO;
	}

	




}


