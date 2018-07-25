package test07;

import java.util.Scanner;

public class condition {public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("A학생의 점수를 입력하세요:");
		String aStu = scan.nextLine();
		System.out.print("B학생의 점수를 입력하세요:");
		String bStu = scan.nextLine();
		System.out.print("c학생의 점수를 입력하세요:");
		String cStu = scan.nextLine();	
		int aNum = Integer.parseInt(aStu);
		int bNum = Integer.parseInt(bStu);
		int cNum = Integer.parseInt(cStu);
		
		int First = (aNum>bNum)&&(aNum>cNum)?aNum:(cNum>bNum?cNum:bNum);
		int Second = (bNum>aNum)&&(cNum>aNum)?bNum:(cNum>aNum?cNum:aNum);
		int Third = (cNum>aNum)&&(cNum>bNum)?cNum:(cNum>bNum?cNum:bNum);

	}
}
