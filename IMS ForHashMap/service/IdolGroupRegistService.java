package service;

import java.util.ArrayList;
import java.util.HashMap;

import ui.IdolGroupUI;

public class IdolGroupRegistService {

    public boolean registIdolGroup(HashMap<String, String> newIdolGroupHashMap) {
        
    	boolean registSuccess = true;
    	
        for (int i = 0; i < IdolGroupUI.idolGroupList.size(); i++) {
			if(IdolGroupUI.idolGroupList.get(i).get("idolGroupName")
					.equals(newIdolGroupHashMap.get("idolGroupName"))) {
				registSuccess = false;
				break;
			}
		}
        
        if(registSuccess) {
        	IdolGroupUI.idolGroupList.add(newIdolGroupHashMap);
        }
        
        return registSuccess;
    }
}

