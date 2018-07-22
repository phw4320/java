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

		System.out.println("등록할 명수를 입력");
		int cnt = Integer.parseInt(scan.nextLine());
		for (int i = 0; i < cnt; i++) {
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

			user.put("uiName", name);
			user.put("uiAge", age);
			user.put("uiCredat", credat);
			user.put("uiCretim", cretim);
			user.put("uiEtc", etc);

			if (udao.insertUserList(user) == 1) {
				System.out.println("추가 성공");
			} else {
				System.out.println("추가 실패");
			}
		}

		System.out.println("삭제할 이름 입력");
		String delName = scan.nextLine();
		user.put("uiName", delName);
		if (udao.deleteUserList(user) != 0) {
			System.out.println("삭제 성공");
		} else {
			System.out.println("삭제 실패");
		}

		System.out.println("수정할 이름 입력");
		String chName = scan.nextLine();
		user.put("uiName", chName);
		System.out.println(chName + "의 나이 수정");
		String chAge = scan.nextLine();

		System.out.println(chName + "의 날짜 수정");
		String chCredat = scan.nextLine();

		System.out.println(chName + "의 시간 수정");
		String chCretim = scan.nextLine();

		System.out.println(chName + "의 비고 수정");
		String chEtc = scan.nextLine();

		user.put("uiAge", chAge);
		user.put("uiCredat", chCredat);
		user.put("uiCretim", chCretim);
		user.put("uiEtc", chEtc);
		if (udao.updateUserList(user) == 1) {
			System.out.println("수정 성공");
		} else {
			System.out.println("수정 실패");
		}
		userList = udao.selectUserList(null);
		for (int i = 0; i < userList.size(); i++) {
			System.out.println(userList.get(i));
		}
	}

}
