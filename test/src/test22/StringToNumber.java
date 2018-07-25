package test22;

import java.util.Scanner;

public class StringToNumber {
	static Scanner scan = new Scanner(System.in);
	static int num = 0;
	
	public static boolean parseInt() {
		try {
			num = Integer.parseInt(scan.nextLine());
			return false;
		} 
		catch (Exception e) {
			System.out.println("에러");
		}
		return true;
	}

	
	public static void main(String[] args) {
		System.out.println("숫자 입력 프로그램 시작");
		System.out.println("숫자를 입력해주세요");
		
		boolean isOk = true;
		while (isOk) {
			isOk = parseInt();
		}
		System.out.println("내가 입력한 숫자는 " + num + "입니다.");
		System.out.println("프로그램이 정상적으로 종료");
	}

}
