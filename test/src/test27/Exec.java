package test27;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import test27.impl.MemberDAOImpl;

public class Exec {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<HashMap<String, String>> userList = new ArrayList<HashMap<String, String>>();
		MemberDAO mdao = new MemberDAOImpl();
		HashMap<String, String> user = new HashMap<String, String>();
		//user.put("memName", "장발장");
		ArrayList<HashMap
		
		<String, String>> user1 = mdao.selectMember(null);
		for (int i = 0; i < user1.size(); i++) {
			System.out.println(user1.get(i));
		} 
		
		System.out.println("이름입력");
		String name = scan.nextLine();

		System.out.println("아이디입력");
		String id = scan.nextLine();

		System.out.println("비밀번호입력");
		String pwd = scan.nextLine();

		System.out.println("나이입력");
		String age = scan.nextLine();

		System.out.println("비고입력");
		String etc = scan.nextLine();

		user.put("memName", name);
		user.put("memId", id);
		user.put("memPwd", pwd);
		user.put("memAge", age);
		user.put("memEtc", etc);

		if (mdao.insertMember(user) == 1) {
			System.out.println("추가 성공");
		} else {
			System.out.println("추가 실패");
		}
		
		System.out.println("삭제할 이름을 입력하세요");
		String delName = scan.nextLine();
		user.put("memName", delName);

		if (mdao.deleteMember(user) == 1) {
			System.out.println("삭제 성공");
		} else {
			System.out.println("삭제 실패");
		}
		
		System.out.println("수정할 이름 입력");
		String chName = scan.nextLine();
		user.put("memName", chName);
		System.out.println(chName + "의 아이디 수정");
		String chId = scan.nextLine();

		System.out.println(chName + "의 비밀번호 수정");
		String chPwd = scan.nextLine();

		System.out.println(chName + "의 나이 수정");
		String chAge = scan.nextLine();

		System.out.println(chName + "의 비고 수정");
		String chEtc = scan.nextLine();

		user.put("memId", chId);
		user.put("memPwd", chPwd);
		user.put("memAge", chAge);
		user.put("memEtc", chEtc);
		if (mdao.updateMember(user) == 1) {
			System.out.println("수정 성공");
		} else {
			System.out.println("수정 실패");
		}
		userList = mdao.selectMember(null);
		for (int i = 0; i < userList.size(); i++) {
			System.out.println(userList.get(i));
		}
	}
}
