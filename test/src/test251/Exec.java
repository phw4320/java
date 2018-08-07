package test251;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import test251.impl.UserDAOImpl;

public class Exec {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap<String,String> userInfo = new HashMap<String,String>();
		UserDAO udao = new UserDAOImpl();	// 패키지 추가 해야함.
		//userInfo.put("uiName", "e");
		ArrayList<HashMap<String,String>> userList = udao.selectUserList(null);
		
		
		for (int i = 0; i < userList.size(); i++) {
			System.out.println(userList.get(i));
		}  
 
		System.out.println("이름입력");
		String name = scan.nextLine();

		System.out.println("나이입력");
		String age = scan.nextLine();

		System.out.println("날짜입력");
		String credat = scan.nextLine();

		System.out.println("시간입력");
		String cretim = scan.nextLine();

		System.out.println("비고입력");
		String etc = scan.nextLine();

		userInfo.put("uiName", name);
		userInfo.put("uiAge", age);
		userInfo.put("uiCredat", credat);
		userInfo.put("uiCretim", cretim);
		userInfo.put("uiEtc", etc);

		if (udao.insertUserList(userInfo) == 1) {
			System.out.println("추가성공");
		} else {
			System.out.println("추가실패");
		}
	}
}
