package test07;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortTest {
	public static void main(String[] args) {

		/*int[] arr = new int[5];
		List<int[]> list = Arrays.asList(arr);
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 70;
		arr[3] = 50;
		arr[4] = 40;

		Collections.reverse(list);
		for (int i = 0; i < arr.length; i++) {
			if ([i]%20==0 && arr[i]!=0)
			System.out.println(arr[i]);
		}
		System.out.println(list);*/
		
/*		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println(str);*/
		
		/*String str = "asdasdqweqwe";
		System.out.println(str.length());
	*/
		/*String[] arrStr = new String[5];
		arrStr[0] = "a";
		arrStr[1] = "b";
		arrStr[2] = "c";
		arrStr[3] = "d";
		arrStr[4] = "e";
		for(int i=0; i<arrStr.length; i++)
		System.out.println(arrStr[i]);
		*/
/*		String str = "a,b,c,d,e";
		String[] arrStr = str.split(",");
		for(int a=0; a<arrStr.length; a++) {
			System.out.println(arrStr[a]);
		}
*/		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("학생들의 점수를 ,로 구분하여 입력");
		String pointStr = scan.nextLine();
		scan.close();
		
		String[] arrStr = pointStr.split(","); // 구분자
		int[] arrInt = new int[arrStr.length];
		for (int i = 0; i < arrStr.length; i++) {
			arrInt[i] = Integer.parseInt(arrStr[i]);
		}
		for (int i = 0; i < arrInt.length; i++) {
			for (int j = i + 1; j < arrInt.length; j++) {
				if (arrInt[i] < arrInt[j]) {
				    int temp = arrInt[i];
					arrInt[i] = arrInt[j];
					arrInt[j] = temp;				//비교하여 내림차순을 위한 로직
				}
			}
		}
		for (int a = 0; a < arrInt.length; a++) {
			System.out.println(arrInt[a]);
		}
	}
}
 