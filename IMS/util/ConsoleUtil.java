package util;

import java.util.Scanner;

import dto.IdolGroupDTO;

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
		
		IdolGroupDTO newIdolGroupDTO = new IdolGroupDTO();
		newIdolGroupDTO.setIdolGroupName(idolGroupName);
		newIdolGroupDTO.setCompany(company);
		newIdolGroupDTO.setGender(gender);
		newIdolGroupDTO.setGenre(genre);
		newIdolGroupDTO.setSong(song);
		newIdolGroupDTO.setYear(year);
		
		
		
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

}
