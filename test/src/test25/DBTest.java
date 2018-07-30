package test25;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DBTest {
	static Scanner scan = new Scanner(System.in);
	public static ArrayList<HashMap<String, String>> userList = new ArrayList<HashMap<String, String>>();
	// final 상수로 지정해도 "내부"값은 변경할순있음 //키,밸류가 모두 string인것만 arraylist안에 hashmap넣을 수 있음

	public static int insertUser(HashMap<String, String> user) {
		int result = 0;
		int uNum = userList.size() + 1;
		try {
			user.put("uNum", uNum + "");
			user.put("uAddress", "서울" + uNum + "번가");
			user.put("uEtc", "ㅋㅋ");
			userList.add(user);
			result = 1;
		} catch (Exception e) {
			System.out.println("오류");
		}
		return result;
	}

	/*
	 * public static HashMap<String,String> insertData(String a, String b) { HashMap
	 * hm = new HashMap(); hm.put(a, b); return hm; }
	 */
	public static void selectUserList() {
		System.out.println(userList);
	}

	public static void inputUser() {
		HashMap<String, String> hm = new HashMap<String, String>();
		// insertData("uNum", "33");

		System.out.println("이름 입력");
		String name = scan.nextLine();
		System.out.println("나이 입력");
		String age = scan.nextLine();
		hm.put("uName", name);
		hm.put("uAge", age);

		/*
		 * hm.put("uNum", "1"); hm.put("uName", "홍길동"); hm.put("uAge", "33");
		 * hm.put("uAddress", "서울"); hm.put("uEtc", "비고");
		 */
		int cnt = insertUser(hm);
		if (cnt == 1) {
			System.out.println("리스트에 유저등록 성공");
		} else {
			System.out.println("오류");
		}

	}

	/*
	 * public static void search(String a) { HashMap<String,String> hm = new
	 * HashMap<String,String>(); for(HashMap<String,String> user:userList) {
	 * if(a.equals(user.get("uName"))) { System.out.println("찾았습니다."); String str =
	 * user.get("uNum"); str += user.get("uName"); str += user.get("uAge"); str +=
	 * user.get("uAddress"); str += user.get("uEtc"); System.out.println(str); } } }
	 */

	public static void indexUserList() {
		for (int i = 0; i < userList.size(); i++) {
			HashMap<String, String> user = userList.get(i);
			System.out.println((i + 1) + "번째 유저 정보 : " + user);
		}
	}

	public static HashMap<String, String> getUser(String uName) {

		for (int i = 0; i < userList.size(); i++) {
			HashMap<String, String> user = userList.get(i);
			if (uName.equals(user.get("uName"))) {
				return user;
				// System.out.println("찾았습니다. " +(i+1)+ "번째 유저 : "+user);
			}
		}
		return null;
	}

	public static HashMap<String, String> removeUser(String uName) {
		for (int i = 0; i < userList.size(); i++) {
			HashMap<String, String> user = userList.get(i);
			if (uName.equals(user.get("uName"))) {
				userList.remove(i);
				// userList.remove(user);
				// user.remove("uName");
				// i--;

				return user;
				// System.out.println("찾았습니다. " +(i+1)+ "번째 유저 : "+user);
			}
		}
		return null;
	}

	public static HashMap<String, String> updateUser(String uName) {
		for (int i = 0; i < userList.size(); i++) {
			HashMap<String, String> hm = new HashMap<String, String>();
			HashMap<String, String> user = userList.get(i);

			if (uName.equals(user.get("uName"))) {
				System.out.println("번호 입력");
				String num = scan.nextLine();
				hm.put("uNum", num);
				System.out.println("이름 입력");
				String name = scan.nextLine();
				hm.put("uName", name);
				System.out.println("나이 입력");
				String age = scan.nextLine();
				hm.put("uAge", age);
				System.out.println("주소 입력");
				String address = scan.nextLine();
				hm.put("uAddress", address);
				System.out.println("비고 입력");
				String etc = scan.nextLine();
				hm.put("uEtc", etc);

				userList.set(i, hm);
				System.out.println("값 변경완료");

				// userList.remove(user);
				// user.remove("uName");
				// i--;
				return user;

				// System.out.println("찾았습니다. " +(i+1)+ "번째 유저 : "+user);
			}
		}
		return null;
	}

	/*
	 * public static HashMap<String, String> getUser(String uName) {
	 * for(HashMap<String,String> user:userList) {
	 * if(uName.equals(user.get("uName"))) { System.out.println("찾았습니다."); String
	 * str = user.get("uNum"); str += user.get("uName"); str += user.get("uAge");
	 * str += user.get("uAddress"); str += user.get("uEtc");
	 * //System.out.println(str); System.out.println(user); return user; } } return
	 * null; }
	 */

	public static void main(String[] args) {

		inputUser();
		inputUser();
		inputUser();
		// 모든 데이터타입은 String으로 변환가능
		/*
		 * System.out.println("리스트에 들어있는 갯수 : "+userList.size()); userList.add(hm); //문제
		 * x System.out.println("리스트에 들어있는 갯수 : "+userList.size()); userList.add(hm);
		 * System.out.println("리스트에 들어있는 갯수 : "+userList.size()); hm = new
		 * HashMap<String,String>(); hm.put("uNum", "2"); hm.put("uName", "임꺽정");
		 * hm.put("uAge", "23"); hm.put("uAddress", "대구"); hm.put("uEtc", "비고2");
		 */
		// System.out.println(hm);
		// search("현우");
		// indexUserList();
		for (int i = 0; i < userList.size(); i++) {
			HashMap<String, String> hm = getUser("w");
			//System.out.println(hm);
			//if (hm != null) {
			//	System.out.println("찾았습니다.\n검색된유저: " + getUser("w"));
			//}
		}
		removeUser("e");
		indexUserList();
		System.out.println("바꾸고자 하는 정보의 이름을 입력하세요.");
		String a = scan.nextLine();
		updateUser(a);
		indexUserList();
		/*for(int i=0; i<userList.size(); i++) {
			HashMap<String,String> m = userList.get(i);
			String name = m.get("uName");
			//if()
		}*/
		/*
		 * if(getUser("w")!=null) { System.out.println("찾았습니다.\n검색된유저: " +getUser("w"));
		 * } else System.out.println("찾는 정보가 없습니다.");
		 * 
		 * }
		 */
		// getUser("w");
		// userList.add(hm);
		// selectUserList();
		/*
		 * for(HashMap<String,String> user:userList) { String str = user.get("uNum");
		 * str += user.get("uName"); str += user.get("uAge"); str +=
		 * user.get("uAddress"); str += user.get("uEtc"); System.out.println(str);
		 * 
		 * }
		 */
	}
}
