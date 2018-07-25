package test08;

import java.util.Scanner;

public class TypeTest {

	public static void main(String[] args) {
		int num = 2;
		double db = 1.3;
		// num = db; 자료형의 크기가 다르기 때문에 불가능
		num = (int)db;
	}

	
}

