package test25;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import com.sun.glass.ui.Menu;

public class MenuList {
	private static ArrayList<HashMap<String,String>> menuList = new ArrayList<HashMap<String,String>>();
	static Scanner scan = new Scanner(System.in);
	
	public static int insertMenu(HashMap<String,String> menu) {
		menuList.add(menu);
		
		return 0;
	}
	public static void printMenu() {
		for(int i=0; i<menuList.size(); i++) {
		System.out.println(menuList.get(i));
		}
	}
	
	public static void inputData() {
		//스캐너사용
		//mName(메뉴명), mPrice(가격), mCnt(인분)을 받아 
		//menuList에 추가하는 로직만들기
		HashMap<String,String> hm = new HashMap<String,String>();
		
		System.out.println("메뉴명을 입력하세요.");
		String mName = scan.nextLine();
		System.out.println("가격을 입력하세요.");
		String mPrice = scan.nextLine();
		System.out.println("인분을 입력하세요.");
		String mCnt = scan.nextLine();
		
		hm.put("mName", mName);
		hm.put("mPrice", mPrice);
		hm.put("mCnt", mCnt);
		
		if (insertMenu(hm)!=1) {
			System.out.println("추가완료");
		} else {
			System.out.println("오류");
		}
		
	}
	
	public static HashMap<String,String> getMenu(String mName) {
		for( HashMap<String,String> hm: menuList)
		{
			if (mName.equals(hm.get("mName"))) {
				System.out.println("찾았습니다.");
				System.out.println(hm);
				return hm;
			}
		}
		return null;
	}
	
	public static HashMap<String,String> deleteMenu(String mName) {
		for( HashMap<String,String> hm: menuList)
		{
			if (mName.equals(hm.get("mName"))) {
				menuList.remove(hm);
				System.out.println("삭제완료");
				return hm;
			}
			else {
				System.out.println("[ "+mName+" ] 없어서 삭제불가");
				return null;
			}
		}
		return null;
	}

	public static HashMap<String,String> updateMenu(String a) {
		HashMap<String,String> tmp = new HashMap<String,String>();
		for(int i=0; i<menuList.size(); i++)	
		{
			HashMap<String,String> hm = menuList.get(i);
			if (a.equals(hm.get("mName"))) {
				
				System.out.println("메뉴명 입력");
				String mName = scan.nextLine();
				tmp.put("mName", mName);
				
				System.out.println("가격 입력");
				String mPrice = scan.nextLine();
				tmp.put("mPrice", mPrice);
				
				System.out.println("명수 입력");
				String mCnt = scan.nextLine();
				tmp.put("mCnt", mCnt);
				
				menuList.set(i, tmp);
				System.out.println("수정 완료");
				return menuList.get(i);
			}
			else {
				System.out.println("[ "+a+" ] 없어서 수정불가");
				return null;
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		
		inputData();
		inputData();
		inputData();
		getMenu("치킨");
		deleteMenu("피자");
		printMenu();
		System.out.println("바꾸고자 하는 메뉴의 이름을 입력");
		String a = scan.nextLine();
		updateMenu(a);
		printMenu();
	}
}
