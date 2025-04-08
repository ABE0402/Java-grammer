package service;

import java.util.Iterator;

import UI.IdolGroupUI;
import dto.IdolGroupDTO;

public class IdolGroupRegistService {

	public boolean registIdolGroup(IdolGroupDTO newIdolGroupDTO) {
		// TODO Auto-generated method stub
		//아이돌 그룹이름 중복체크
		boolean registSuccess = true;
		for (int i = 0; i < IdolGroupUI.idolGroupArray.length; i++) {
			if(IdolGroupUI.idolGroupArray[i].getIdolGroupName().equals(newIdolGroupDTO.getIdolGroupName())) {
				registSuccess =false;
				break;
			}
		}
		
		//등록작업
		if(registSuccess) {
			IdolGroupDTO[] tempArray =IdolGroupUI.idolGroupArray;
			IdolGroupUI.idolGroupArray=new IdolGroupDTO[IdolGroupUI.idolGroupArray.length + 1];
			
			//기존 배열에 저장되었던 값들을 새로운 배열에 복사
			for (int i = 0; i < tempArray.length; i++) {
				IdolGroupUI.idolGroupArray[i] = tempArray[i];
			}
			//기존배열보다 새로운 배열이 크기가 하나 더 크기 떄문에
			//for 문이 다 실행되고 나면 새로운 배열의 마지막 인덱스 영역에는 값이 저장되지 않는다.
			//마지막 인덱스 영역에는 새로 등록할 아이돌 그룹 객체를 저장하면 된다.
			IdolGroupUI.idolGroupArray[IdolGroupUI.idolGroupArray.length-1] = newIdolGroupDTO;
		}
		
		return registSuccess;
	}


	
}
