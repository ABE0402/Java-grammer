package service;

import java.util.ArrayList;
import java.util.HashMap;

import ui.IdolGroupUI;

public class IdolGroupViewService {

    public HashMap<String, String> getIdolGroup(String idolGroupName) {
        HashMap<String, String> idolGroupHashMap = null;

        for (int i = 0; i < IdolGroupUI.idolGroupList.size(); i++) {
			if(IdolGroupUI.idolGroupList.get(i).get("idolGroupName")
					.equals(idolGroupName)) {
				idolGroupHashMap = IdolGroupUI.idolGroupList.get(i);
				break;
			}
		}
        return idolGroupHashMap;
    }
}


