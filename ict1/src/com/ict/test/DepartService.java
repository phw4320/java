package com.ict.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class DepartService {
	private static DepartService ds;
	private List<HashMap<String, String>> departList;
	
	public static DepartService getDepartSv() {
		if (ds == null) {
			ds = new DepartService();
		}
		return ds;
	}

	public List<HashMap<String, String>> getDepartService() {
		if (departList == null) {
			departList = new ArrayList<HashMap<String, String>>();

			for (int i = 0; i < 20; i++) {
				int rNum = (int)(Math.random()*100);
				HashMap<String, String> hm = new HashMap<String, String>();
				hm.put("deName", "depart " + i);
				String deCode = StringUtils.leftPad(rNum+"",3,'0');
				hm.put("deCode", deCode);
				hm.put("deCnt", (i + 20) + "");
				departList.add(hm);
			}
		}
		return departList;
	}
	
	 public List<HashMap<String,String>> getDepartService(String searchStr){
		 if(searchStr == null || departList==null) {
			 return getDepartService();
		 }
         List<HashMap<String,String>> departList2 = new ArrayList<HashMap<String,String>>();
         for(HashMap<String,String> hm : departList) {
            if(hm.get("deCode").indexOf(searchStr)!=-1){
            	departList2.add(hm);
            }
         }
      return departList2;   
      }
}