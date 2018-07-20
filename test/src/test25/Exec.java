package test25;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import test25.impl.UserDAOImpl;
import test26.UserDAO;

public class Exec {

	public static void main(String[] args) {
		UserDAOImpl udao = new UserDAOImpl();
		HashMap<String, String> userInfo = new HashMap<String, String>();
		//userInfo.put("uiName","y");
	//	userInfo.put("uiName","q");
		
		ArrayList<HashMap<String, String>> userList = udao.selectUserInfo(null);
		//ArrayList<HashMap<String, String>> userList = udao.selectUserInfo(userInfo);
		for(int i = 0; i<userList.size(); i++) {
			System.out.println(userList.get(i));
		}

		/*userInfo.put("uiName","q");
		if(udao.deleteUserInfo(userInfo)==1)
		{
			System.out.println("삭제완료");
		} else  {
			System.out.println("삭제오류");
		}
		userInfo.put("uiEtc","dddddd");
		userInfo.put("uiName","y");
		if(udao.updateUserInfo(userInfo)==1)
		{
			System.out.println("변경완료");
		} else  {
			System.out.println("변경오류");
		}
		
		for (HashMap<String, String> a : userList) {
			String str = a.get("uiNum");
			str += a.get("uiName");
			str += a.get("uiAge");
			str += a.get("uiCredat");
			str += a.get("uiCretim");
			str += a.get("uiDelete");
			str += a.get("uiEtc");
			System.out.println(str);
		}
		
		
		//System.out.println(userList);
		
		Scanner scan = new Scanner(System.in);
		//System.out.println(userInfo);
		System.out.println("등록명수입력");
		int max = Integer.parseInt(scan.nextLine());
		for (int i = 0; i < max; i++) {
			System.out.println("이름 입력");
			String name = scan.nextLine();
			System.out.println("나이 입력");
			String age = scan.nextLine();
			System.out.println("비고 입력");
			String etc = scan.nextLine();
			userInfo.put("uiName", name);
			userInfo.put("uiAge", age);
			userInfo.put("uiEtc", etc);

			if (udao.insertUserInfo(userInfo) == 1) {
				System.out.println("등록 성공");
			} else {
				System.out.println("등록 실패");
			}
		}*/
	}

}

// tcl = 트랜잭션 컨트롤