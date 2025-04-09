package service;

import UI.IdolGroupUI;
import dto.IdolGroupDTO;

public class IdolGroupModifyService {

	public static IdolGroupDTO getOldIdolGroupDTO(String idolGroupNameModify) {
		// TODO Auto-generated method stub
		IdolGroupDTO oldidolGroupDTO = null;
		for (int i = 0; i < IdolGroupUI.idolGroupArray.length; i++) {
			if(IdolGroupUI.idolGroupArray[i].getIdolGroupName().
					equals(idolGroupNameModify)) {
				oldidolGroupDTO = IdolGroupUI.idolGroupArray[i];
				break;
			}
		}
		return oldidolGroupDTO;
	}

	public boolean modifyIdolGroup(IdolGroupDTO newIdolGroupDTO) {
		// TODO Auto-generated method stub
		boolean modifySuccess = false; 
		for (int i = 0; i < IdolGroupUI.idolGroupArray.length; i++) {
			if(IdolGroupUI.idolGroupArray[i].getIdolGroupName().
					equals(newIdolGroupDTO.getIdolGroupName())) {
	                IdolGroupUI.idolGroupArray[i]= newIdolGroupDTO;
	                modifySuccess = true;
				break;
			}
		}
		return modifySuccess;
	}

}
