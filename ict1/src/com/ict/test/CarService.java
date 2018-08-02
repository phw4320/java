package com.ict.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarService {
	private List<Map<String, String>> carList;
	private static CarService cs;

	public static CarService getCarService() {
		if (cs == null) {
			cs = new CarService();
		}
		return cs;
	}

	public List<Map<String, String>> getCarList() {
		if (carList == null) {
			carList = new ArrayList<Map<String, String>>();

			for (int i = 0; i < 10; i++) {
				Map<String, String> c = new HashMap<String, String>();
				c.put("carName", "audi" + i);
				c.put("carPrice", i + "000");
				c.put("carCompany", "hyundai" + i);
				carList.add(c);
			}
		}
		return carList;
	}

	public List<Map<String, String>> getCarList(String searchStr) {
		if(searchStr == null || carList==null) {
			 return getCarList();
		 }
        List<Map<String,String>> carList2 = new ArrayList<Map<String,String>>();
        for(Map<String, String> hm : carList) {
           if(hm.get("carName").indexOf(searchStr)!=-1){
           	carList2.add(hm);
           }
        }
        System.out.println(carList2);
        return carList2;   
     }
}
