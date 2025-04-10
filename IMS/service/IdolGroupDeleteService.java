package service;

import dto.IdolGroupDTO;
import UI.IdolGroupUI;

public class IdolGroupDeleteService {

	public boolean deleteIdolGroup(String idolGroupNameToDelete) {
		//1. 삭제할 대상 아이돌 그룹 객체를 저장하고 있는 배열의 인덱스 위치를 찾는다.
		//교수님 방법
		//		for (int i = 0; i <IdolGroupUI.idolGroupArray.length; i ++) {
		//			if(IdolGroupUI.idolGroupArray[i].getIdolGroupName().equals(idolGroupNameToDelete)) {
		//				index = 1;
		//				break;
		//			}
		//		}

		IdolGroupDTO[] groupArray = IdolGroupUI.idolGroupArray;
		int indexToDelete = -1;

		// 1. 이름 일치하는 인덱스 찾기
		for (int i = 0; i < groupArray.length; i++) {
			if (groupArray[i].getIdolGroupName().equals(idolGroupNameToDelete)) {
				indexToDelete = i;
				break;
			}
		}
		//2. 찾은 index 값이 -1이 아니면
		//즉, 삭제할 아이돌 그룹 정보가 배열에 있으면
		//삭제 작업 수행

		if (indexToDelete != -1) {
			//2-1 기존 배열을 백업
			//IdolGroupDTO[] tempArray = IdolGroupUI.idolGroupArray;

			//2-2 기존 배열의 크기보다 하나가 작은 배열 객체 생성
			IdolGroupDTO[] newArray = new IdolGroupDTO[groupArray.length - 1];

			//2-3 기존 배열에 저장된 아이돌 그룹 객체를 삭제할 아이돌 그룹 객체만 제외하고
			//새로운 배열객체에 복사
			//교수님 방법
//			for (int i = 0, j = 0; i < groupArray.length; i++) {
//				if (i < indexToDelete) {
//					IdolGroupUI.idolGroupArray[i] = tempArray[i];
//				}
//				else if(i >index) {
//					IdolGroupUI.idolGroupArray[i-1] = tempArray[i];
//				}
//			}
			for (int i = 0, j = 0; i < groupArray.length; i++) {
				if (i != indexToDelete) {
					newArray[j++] = groupArray[i]; // 삭제 대상 제외하고 복사
				}
			}

			IdolGroupUI.idolGroupArray = newArray;
			System.out.println(idolGroupNameToDelete + " 아이돌 그룹 삭제 성공!"); 
			return true;
		} 

		else {
			System.out.println(idolGroupNameToDelete + " 아이돌 그룹을 찾을 수 없습니다.");
		}
		return false;



	}

}
