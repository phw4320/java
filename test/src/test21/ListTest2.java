package test21;

import java.util.ArrayList;

public class ListTest2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		// ad.add(3.1);//실수형 안됨
		for (int i = 0; i < 6; i++) {
			al.add((int) (Math.random() * 10) + 1);
			
		}
		for (Integer a : al) {
			System.out.print(a+", ");
		}
		System.out.println(al);
	}
}
// arrayList는 중간값삭제시 사이즈는 그대로고 지운값에 배열이 재정렬되어 한칸씩 땡겨지는데 이 배열의 수가 많을수록 과부화가일어난다.