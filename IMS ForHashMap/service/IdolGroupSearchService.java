package service;

import java.util.ArrayList;
import java.util.HashMap;

import dto.IdolGroupDTO;
import ui.IdolGroupUI;

public class IdolGroupSearchService {

	public HashMap<String, String> searchIdolGroupByName(String idolGroupName) {
		// TODO Auto-generated method stub
		HashMap<String, String> searchedIdolGroupHashMap = null;
		
		for (int i = 0; i < IdolGroupUI.idolGroupList.size(); i++) {
			if(IdolGroupUI.idolGroupList.get(i).get("idolGroupName")
					.equals(idolGroupName)) {
				searchedIdolGroupHashMap = IdolGroupUI.idolGroupList.get(i);
				break;
			}
		} 
		
		return searchedIdolGroupHashMap;
	}


	public ArrayList<HashMap<String, String>> searchIdolGroupListByGeneration(String generation) {
		// TODO Auto-generated method stub
		ArrayList<HashMap<String, String>> searchedIdolGroupList = null;
		
		for (int i = 0; i < IdolGroupUI.idolGroupList.size(); i++) {
			if(IdolGroupUI.idolGroupList.get(i).get("generation").equals(generation)) {
				if(searchedIdolGroupList == null) {
					searchedIdolGroupList = new ArrayList<HashMap<String,String>>();
				}
				
				searchedIdolGroupList.add(IdolGroupUI.idolGroupList.get(i));
				
			}
		}
		
		return searchedIdolGroupList;
	}

}














