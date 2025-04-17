package service;

import java.util.ArrayList;
import java.util.HashMap;

import ui.IdolGroupUI;

public class IdolGroupDeleteService {

    public boolean deleteIdolGroup(String idolGroupNameToDelete) {
        ArrayList<HashMap<String, String>> idolGroupList = IdolGroupUI.idolGroupList;
        boolean deleteSuccess = false;
        
        for (int i = 0; i < idolGroupList.size(); i++) {
            if (idolGroupList.get(i).get("idolGroupName").equals(idolGroupNameToDelete)) {
                idolGroupList.remove(i); 
                deleteSuccess = true;
                return deleteSuccess; 
            }
        }

        return deleteSuccess; 
    }
}
