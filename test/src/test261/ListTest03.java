package test261;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListTest03 {
	public static void main(String[] args) {
		List<Person> pList = new ArrayList<Person>();
		//Person p = new Person("홍길동", 22);
		// System.out.println(p.getAge());
		// pList.add(new Person("홍길동", 22));
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.println("이름을 입력");
			String name = scan.nextLine();
			System.out.println("나이를 입력");
			int age = Integer.parseInt(scan.nextLine());
			pList.add(new Person(name,age));
			//System.out.println(pList.get(i).getName() + " " + pList.get(i).getAge());
		}
		//compareTo(pList);
		for (Person p : pList) {
			System.out.println(p);
		}
	}
}

