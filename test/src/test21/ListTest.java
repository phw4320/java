package test21;

import java.util.ArrayList;

public class ListTest {

	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<>();
		
		/*strList.add(1);
		strList.add(true);
		strList.add(1.1);
		strList.add(new String[2])*/	//선언한 데이터 타입과 파라미터가 다르기때문에 실행오류
		/*strList.add(1+"");
		strList.add(true+"");
		strList.add(1.1+"");
		*/
		System.out.println(strList.size());
		strList.add("현우");
		System.out.println(strList.size());
		strList.add("멋쟁이");
		strList.add("짱");
		System.out.println(strList.size());
		int idx = strList.indexOf("짱");
		System.out.println(idx);
		/*for(Object o :strList) {
			System.out.println(o);	// <String>지우고 선언할 경우 오브젝트데이터 타입가능(옳지않은방법 - 아무거나 다 넣을수 있다.)
		*/
		for(String str : strList) {
			System.out.println(str);
	}
		
	}

}
