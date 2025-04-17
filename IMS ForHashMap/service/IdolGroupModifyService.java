package service;

import java.util.HashMap;
import java.util.Scanner;
import ui.IdolGroupUI;

public class IdolGroupModifyService {


	public boolean modifyIdolGroup(HashMap<String, String> newIdolGroupHashMap) {
		// TODO Auto-generated method stub
		boolean modifySuccess = false;

		for (int i = 0; i < IdolGroupUI.idolGroupList.size(); i++) {
			if(IdolGroupUI.idolGroupList.get(i).get("idolGroupName")
					.equals(newIdolGroupHashMap.get("idolGroupName"))) {
				IdolGroupUI.idolGroupList.set(i, newIdolGroupHashMap);
				modifySuccess = true;
				break;
			}
		}
		return modifySuccess;
	}
	
	public HashMap<String, String> getOldIdolGroupHashMap(String idolGroupNameForModify) {
		// TODO Auto-generated method stub
		HashMap<String, String> oldIdolGroupHashMap = null;

		for (int i = 0; i < IdolGroupUI.idolGroupList.size(); i++) {
			if(IdolGroupUI.idolGroupList.get(i).get("idolGroupName")
					.equals(idolGroupNameForModify)) {
				oldIdolGroupHashMap = IdolGroupUI.idolGroupList.get(i);
				break;
			}
		}
		return oldIdolGroupHashMap;
	}

}
