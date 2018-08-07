package com.ict.erp.utils;

import java.util.ArrayList;
import java.util.List;

import com.ict.erp.vo.Menu;

public class MenuUtils {
	private static List<Menu> menuList; 
			
	
	public static List<Menu> getMenuList(){
		if(menuList==null) {
			menuList = new ArrayList<Menu>();
			Menu m = new Menu("views/index","home","Home");
			menuList.add(m);
			m = new Menu("views/user/login","login","Login");
			menuList.add(m);
			m = new Menu("views/user/signup","signup","SingUp");
			menuList.add(m);
		}
		return menuList;
	}
}