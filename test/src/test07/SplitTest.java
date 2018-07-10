package test07;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SplitTest {
	public static void main(String[] args) {
		System.out.println("학생들의 점수를 ,로 구분하여 입력해주세요.");
		Scanner scan = new Scanner(System.in);
		String pointStr = scan.nextLine();
		System.out.println(pointStr);
		String[] arrStr = pointStr.split(",");
		for(int a=0; a<arrStr.length; a++) {
			System.out.println((a+1)+"등 : "+arrStr[a]);
		}
	}
}
