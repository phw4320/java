package test22;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class TestPage {

	public static int num=0;
	static Scanner scan = new Scanner(System.in);

	public static boolean err() {
		try {

			num = scan.nextInt();
			System.out.println("입력받은 정수 값은 " + num);
			num = scan.nextInt();
			System.out.println("입력받은 정수 값은 " + num);
//			num = Integer.parseInt(scan.nextLine());
			
			return false;
		}  catch (InputMismatchException  tion ) {
			System.out.println("에러입니다.1");
			return true;
		} catch (NoSuchElementException tion ) {
			System.out.println("에러입니다.2");
			return true;
		} catch (IllegalStateException tion ) {
			System.out.println("에러입니다.3");
			return true;
		} 
		
	}

	public static void main(String[] args) {
	
		
		//int num;3
		boolean isOk = true;
		System.out.println("숫자를입력");
		
		while(isOk) {
			isOk = err();
		}
		
		System.out.println("종료");
	}

}
