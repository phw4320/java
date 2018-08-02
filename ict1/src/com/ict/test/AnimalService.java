package com.ict.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnimalService {
	
	private List<Map<String,String>> dogList;
	private static AnimalService as;
	
	public static AnimalService getAnimalService() {
		if(as == null) {
			as = new AnimalService();
		}
		return as;
	}
	
	public List<Map<String,String>> getAnimalList() {
		if(dogList==null) {
			dogList = new ArrayList<Map<String,String>>();
			for(int i=0; i<10; i++) {
				HashMap<String,String> a = new HashMap<String,String>();
				int rNum = (int)(Math.random()*20)+1;
				a.put("name", "dog"+i);
				a.put("age", rNum+"");
				a.put("kinds", "chiwawa"+i);
				dogList.add(a);
			}
		}
		System.out.println(dogList);
		return dogList;
	}
	
	public List<Map<String,String>> getAnimalList(String searchStr) {
		if(searchStr == null || dogList==null) {
			 return getAnimalList();
		 }
        List<Map<String,String>> dogList2 = new ArrayList<Map<String,String>>();
        for(Map<String, String> hm : dogList) {
           if(hm.get("name").indexOf(searchStr)!=-1){
        	   dogList2.add(hm);
           }
        }
        System.out.println(dogList2);
        return dogList2;   
     }
}
