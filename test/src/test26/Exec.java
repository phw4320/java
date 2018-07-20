package test26;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import test26.impl.UserDAOImpl;

public class Exec {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap<String, String> user = new HashMap<String, String>();
		UserDAO udao = new UserDAOImpl();
		ArrayList<HashMap<String, String>> userList = udao.selectUserList(null);
		for (int i = 0; i < userList.size(); i++) {
			System.out.println(userList.get(i));
		}

		/*System.out.println("이름입력");
		String name = scan.nextLine();

		System.out.println("나이입력");
		String age = scan.nextLine();

		System.out.println("날짜입력");
		String credat = scan.nextLine();

		System.out.println("시간입력");
		String cretim = scan.nextLine();

		System.out.println("비고입력");
		String etc = scan.nextLine();

		user.put("uiName", name);
		user.put("uiAge", age);
		user.put("uiCredat", credat);
		user.put("uiCretim", cretim);
		user.put("uiEtc", etc);

		if (udao.insertUserList(user) == 1) {
			System.out.println("추가성공");
		} else {
			System.out.println("추가실패");
		}*/
	}

}
