package com.ict.erp.service;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public interface UserService {
	void login(HttpServletRequest req);
	String id = req.getParameter("id");
	String pwd = req.getParameter("pwd");
	
	Map<String,String> rMap = new HashMap<String,String>();
	rMap.put("msg","¼º°ø");
	rMap.put("url","views/index");
	req.setAttribute("rMap",rMap);
	if(id.equals("phw4320")) {
		if(pwd.equals("123456789")) {
			return;
		}
	}
}
