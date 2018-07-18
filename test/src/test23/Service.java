package test23;

import java.util.ArrayList;
import java.util.Scanner;

import test21.a;

public class Service {
	// private static Service s = new Service();
	//private UserDAO ud = new UserDAO();
	private ArrayList<UserDAO> userLists = new ArrayList<UserDAO>();
	Scanner scan = new Scanner(System.in);
	
	Service() {
	}
	/*
	 * public static Service getInstance() { return s; }
	 */
	/*
	 * public void add(UserDAO user) { this.userLists.add(user); }
	 */
	public void print() {
		for (UserDAO str : userLists) {
			System.out.println("이름 : " + str.getName() + ", 나이 : " + str.getAge() + ", 번호 : " + str.getNum());
		}
		// for (int i=0; i < userLists.size(); i++) {
		// System.out.println(userLists.get(i));
		// }	//controller에서 exec로 넘겨줘야함
	}

	public void add() {
		this.userLists.add(
				new UserDAO(scan.nextLine(), Integer.parseInt(scan.nextLine()), Integer.parseInt(scan.nextLine())));
	}

	public int count() {
		return this.userLists.size();
	}

	public void modify() {

		int num = Integer.parseInt(scan.nextLine());
		for (int i = 0; i < userLists.size(); i++) {
			UserDAO d = userLists.get(i);
			/*
			 * if(num == d.getNum()) userLists.set(num,d); }
			 */
			if //(userLists.contains(ud.getNum())) {
				(userLists.get(i).getNum() == num) {
				System.out.println("이름을 새로 선정하세요");
				userLists.get(i).setName(scan.nextLine());
				System.out.println("나이를 새로 선정하세요");
				userLists.get(i).setAge(Integer.parseInt(scan.nextLine()));
				System.out.println("번호를 새로 선정하세요");
				userLists.get(i).setNum(Integer.parseInt(scan.nextLine()));
				System.out.println("값 수정 완료");
			}
		}
	}
	public void delete() {
		
		int num = Integer.parseInt(scan.nextLine());
		for (int i = 0; i < userLists.size(); i++) {
			UserDAO d = userLists.get(i);
			if (userLists.get(i).getNum() == num) {
				userLists.remove(d);
			}
		}
		System.out.println("삭제완료");
	}
	/* 자료 전체 출력용 메소드
	public ArrayList<UserDAO> lists() {
		return this.userLists;
	}*/

	
}
