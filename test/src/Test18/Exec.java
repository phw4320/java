package Test18;

import java.util.Scanner;

public class Exec {

	public static void init(Person[] ps) {
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < ps.length; i++) {
			ps[i] = new Person();
			ps[i].rank = 1;
			ps[i].name = (i + 1) + "번째 사람";
			System.out.println(i + 1 + "번째 사람의 점수를 입력해주세요");
			ps[i].point = Integer.parseInt(scan.nextLine());
		}
	}

	public static void rank(Person[] ps) {
		for (int i = 0; i < ps.length; i++) {
			for (int j = 0; j < ps.length; j++) {
				if (ps[i].point < ps[j].point) {
					ps[i].rank++;
				}
			}
		}
	}

	public static void print(Person[] ps) {
		for (int i = 0; i < ps.length; i++) {
			System.out.println(ps[i].name + "의 점수는 " + ps[i].point + "점 입니다.");
			System.out.println(ps[i].name + "의 등수는 " + ps[i].rank + "등 입니다.");
		}
	}

	public static void main(String[] args) {

		Person[] ps = new Person[5];
		init(ps);
		rank(ps);
		print(ps);
	}
}
