package com.ict.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UserService {
	private static UserService us = new UserService();
	private List<HashMap<String, String>> userList;

	public static UserService getUserService() {
	
			us = new UserService();


		return us;
	}

	public List<HashMap<String, String>> getUserList() {
		for (int i = 1; i <= 10; i++) {
			HashMap<String, String> hm = new HashMap<String, String>();
			int rNum = (int) (Math.random() * 100);
			hm.put("name", "홍길동" + i);
			hm.put("age", rNum + "");
			hm.put("id", "hello" + i);
			hm.put("address", "천안시 동남구 " + rNum + "번지");

			userList.add(hm);
		}

		return userList;
	}

	public List<HashMap<String, String>> getUserList(String searchStr) {

		if (searchStr == null || userList == null) {
			return getUserList();
		}
		List<HashMap<String, String>> userList2 = new ArrayList<HashMap<String, String>>();
		for (HashMap<String, String> hm : userList) {
			if (hm.get("id").indexOf(searchStr) != -1) {
				userList2.add(hm);
			}
		}
		return userList2;
	}

}
