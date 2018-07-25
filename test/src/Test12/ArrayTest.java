package Test12;

import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] numArr = new int[5];
		System.out.println("숫자를 1부터 5까지 중 5개의 숫자를 중복없이 입력하세요.");

		for (int i = 0; i < numArr.length; i++) {
			System.out.print((i+1)+"번째 숫자 : ");
			String numStr = scan.nextLine();
			numArr[i] = Integer.parseInt(numStr);
			if (numArr[i]<1|| numArr[i]>numArr.length) {
				System.out.println("범위 밖입니다. 다시입력해주세요.");
				i--;
			}
			for (int check = 0; check < i; check++) { 
				
				if (numArr[i] == numArr[check]) {
					System.out.println("중복값입니다. 다시입력해주세요.");
					i--;
				}
			}
		}
		for (int a = 0; a < numArr.length; a++) {
			System.out.print("["+numArr[a]+"]" + " ");
		}
		System.out.print("\n프로그램종료");
		scan.close();
	}
}
