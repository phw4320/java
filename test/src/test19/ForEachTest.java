package test19;

import java.util.ArrayList;

public class ForEachTest {

	public static void main(String[] args) {
		String[] arrStr = new String[4];
		
		for(int i=0; i<arrStr.length; i++) {
			arrStr[i] = "테스트  " +i;
		}
		for(String str:arrStr) {
			System.out.println(str);
		}
		
		ArrayList<String> strList = new ArrayList<String>();
		for(int i=0; i<arrStr.length; i++) {
			strList.add("테스트 "+i);
		}
		for(String str:strList) {
			System.out.println(str);
		}
		
		String[] arr = {"가","나","다"};
		System.out.println(arr[1]);
		String[][] multiArr = {{"1","2","3"},{"4","5","6"},{"7"}};
		//System.out.println(multiArr[1][0]);
		for(String[] strs:multiArr) {
			for(String str:strs) {
				System.out.println(str);
			}
		}
	}
}
