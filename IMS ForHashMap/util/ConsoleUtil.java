package util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import dto.SearchDTO;

public class ConsoleUtil {

	public HashMap<String, String> getNewIdolGroupHashMap(Scanner scanner) {
		// TODO Auto-generated method stub
		System.out.println("====등록할 아이돌 그룹 정보 입력====");

		System.out.print("아이돌 그룹 이름: ");
		String idolGroupName = scanner.next();
		System.out.print("아이돌 그룹 소속사: ");
		String company = scanner.next();
		System.out.print("아이돌 그룹 성별: ");
		String gender = scanner.next();
		System.out.print("아이돌 그룹 장르: ");
		String genre = scanner.next();
		System.out.print("아이돌 그룹 데뷔년도: ");
		String year = scanner.next();
		System.out.print("아이돌 그룹 대표곡: ");
		String song = scanner.next();
		System.out.print("아이돌 그룹 세대: ");
		String generation = scanner.next();

		HashMap<String, String> newIdolGroupHashMap 
		= new HashMap<String, String>();
		newIdolGroupHashMap.put("idolGroupName", idolGroupName);
		newIdolGroupHashMap.put("company", company);
		newIdolGroupHashMap.put("gender", gender);
		newIdolGroupHashMap.put("genre", genre);
		newIdolGroupHashMap.put("year", year + "");
		newIdolGroupHashMap.put("song", song);
		newIdolGroupHashMap.put("generation", generation + "");

		return newIdolGroupHashMap;
	}



	public void printRegistSuccessMessage(String idolGroupName) {
		System.out.println("아이돌 그룹 등록 성공");
	}

	public void printRegistFailMessage(String idolGroupName) {
		System.out.println("아이돌 그룹 등록 실패");
	}



	public void printIdolGroupList(ArrayList<HashMap<String, String>> idolGroupList) {
		if (idolGroupList.size() == 0) {
			System.out.println("아직 등록된 아이돌 그룹 정보가 없습니다.");
		} 
		else {
			for (int i = 0; i < idolGroupList.size(); i++) {
				System.out.println(idolGroupList.get(i));
			}
		}
	}



	public String getIdolGroupName(String label, Scanner scanner) {
		//TODO Auto-generated method stub
		System.out.print(label);
		return scanner.next();
	}



	public void printIdolGroupHashMap(HashMap<String, String> idolGroupHashMap) {
		// TODO Auto-generated method stub
		System.out.println(idolGroupHashMap);
	}

	public void printModifySuccessMessage(String idolGroupNameForModify) {
		// TODO Auto-generated method stub
		System.out.println("수정 완료");
	}



	public void printModifyFailMessage(String idolGroupNameForModify) {
		// TODO Auto-generated method stub
		System.out.println("수정 실패");
	}

	public HashMap<String, String> getOldIdolGroupHashMap(HashMap<String, String> oldIdolGroupHashMap) {
		// TODO Auto-generated method stub
		return null;
	}



	public HashMap<String, String> getNewIdolGroupHashMap(HashMap<String, String> oldIdolGroupHashMap,
			Scanner scanner) {
		// TODO Auto-generated method stub
		System.out.println("====등록할 아이돌 그룹 정보 입력====");

		System.out.println("이전 아이돌 그룹 소속사: " + oldIdolGroupHashMap.get("company"));
		System.out.print("아이돌 그룹 소속사: ");
		String company = scanner.next();
		System.out.println("이전 아이돌 그룹 성별: " + oldIdolGroupHashMap.get("gender"));
		System.out.print("아이돌 그룹 성별: ");
		String gender = scanner.next();
		System.out.println("이전 아이돌 그룹 장르: " + oldIdolGroupHashMap.get("genre"));
		System.out.print("아이돌 그룹 장르: ");
		String genre = scanner.next();
		System.out.println("이전 아이돌 그룹 데뷔년도: " + oldIdolGroupHashMap.get("year"));
		System.out.print("아이돌 그룹 데뷔년도: ");
		String year = scanner.next();
		System.out.println("이전 아이돌 그룹 대표곡: " + oldIdolGroupHashMap.get("song"));
		System.out.print("아이돌 그룹 대표곡: ");
		String song = scanner.next();
		System.out.println("이전 아이돌 그룹 세대: " + oldIdolGroupHashMap.get("generation"));
		System.out.print("아이돌 그룹 세대: ");
		String generation = scanner.next();

		HashMap<String, String> newIdolGroupHashMap 
		= new HashMap<String, String>();
		newIdolGroupHashMap.put("idolGropName", oldIdolGroupHashMap.get("idolGropName"));
		newIdolGroupHashMap.put("company", company);
		newIdolGroupHashMap.put("gender", gender);
		newIdolGroupHashMap.put("genre", genre);
		newIdolGroupHashMap.put("year", year + "");
		newIdolGroupHashMap.put("song", song);
		newIdolGroupHashMap.put("generation", generation + "");

		return newIdolGroupHashMap;
	}



	public void printDeleteSuccessMessage(String idolGroupNameToDelete) {
		// TODO Auto-generated method stub
		System.out.println("삭제 성공");
	}



	public void printDeleteFailMessage(String idolGroupNameToDelete) {
		// TODO Auto-generated method stub
		System.out.println("삭제 실패");
	}

	

	public void printSearchedIdolGroupHashMap(HashMap<String, String> searchedIdolGroupHashMap) {
		// TODO Auto-generated method stub
		System.out.println(searchedIdolGroupHashMap);
	}



	public void printSearchedIdolGroupHashMapList(ArrayList<HashMap<String, String>> searchedIdolGroupHashMapList) {
		// TODO Auto-generated method stub
		if(searchedIdolGroupHashMapList == null || searchedIdolGroupHashMapList.size() == 0) {
			System.out.println("검색된 아이돌 그룹 정보가 없습니다.");
		}
		else {
			for (int i = 0; i < searchedIdolGroupHashMapList.size(); i++) {
				System.out.println(searchedIdolGroupHashMapList.get(i));
			}
		}
	}



	public SearchDTO getSearchDTO(Scanner scanner) {
		// TODO Auto-generated method stub
		System.out.print("검색조건(이름 | 나이대) : ");
		String searchCondition = scanner.next();
		
		if(searchCondition.equals("이름")) {
			System.out.print("검색할 이름 : ");
		}
		else if(searchCondition.equals("나이대")) {
			System.out.print("검색할 나이대 : ");
		}
		String searchValue = scanner.next();
		
		SearchDTO searchDTO = new SearchDTO();
		searchDTO.setSearchCondition(searchCondition);
		searchDTO.setSearchValue(searchValue);
		
		return searchDTO;
	}

}

