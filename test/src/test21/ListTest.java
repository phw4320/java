package test21;

import java.util.ArrayList;
import java.util.Scanner;

public class ListTest {

	public static void main(String[] args) {
		//a ab = new a();
		ArrayList<a> strList = new ArrayList<a>();
		
		/*strList.add(1);
		strList.add(true);
		strList.add(1.1);
		strList.add(new String[2])*/	//선언한 데이터 타입과 파라미터가 다르기때문에 실행오류
		/*strList.add(1+"");
		strList.add(true+"");
		strList.add(1.1+"");
		*/
		System.out.println(strList.size());
		Scanner scan = new Scanner(System.in);
		
		strList.add(new a(scan.nextLine(),scan.nextInt()));
		System.out.println(strList.size());
		strList.add(new a("현우",20));
		strList.add(new a("현우",20));
		System.out.println(strList.size());
		int idx = strList.indexOf("짱");
		System.out.println(idx);
		/*for(Object o :strList) {
			System.out.println(o);	// <String>지우고 선언할 경우 오브젝트데이터 타입가능(옳지않은방법 - 아무거나 다 넣을수 있다.)
		*/
		for(a str : strList) {
			System.out.println(str.getName()+", "+str.getAge());
	}
		
	}

}
