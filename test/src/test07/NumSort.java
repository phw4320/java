package test07;

import java.util.Scanner;

public class NumSort {
	public static void main(String[] args) {
		int[] arrNum = new int[3];
		Scanner scan = new Scanner(System.in);
		arrNum[0] = scan.nextInt();
		arrNum[1] = scan.nextInt();
		arrNum[2] = scan.nextInt();

		for (int i = 0; i < arrNum.length; i++) {
			for (int j = i + 1; j < arrNum.length; j++) {
				if (arrNum[i] < arrNum[j]) {
					int temp = arrNum[i];
					arrNum[i] = arrNum[j];
					arrNum[j] = temp;
				}
			}
		}
		for (int a = 0; a < arrNum.length; a++) {
			System.out.printf("start : " + arrNum[a] + " end : " + arrNum[a]);
		}
	}
}
