package test08;

import test06.test;

public class IntegerArray {

	public static void main(String[] args) {
	/*	pub p = new pub();
		pro p1 = new pro();
		test111 t = new test111();	// 다른 클래스
		test t1 = new test();
		
		System.out.println(p.a);
		System.out.println(p.b);	
		//System.out.println(p.c);	// 오류 : 해당클래스에서 접근가능
		System.out.println(p1.d);
		System.out.println(p1.e);
		//System.out.println(p1.f);	// 오류 : 해당클래스에서 접근가능
		System.out.println(t.g);
		System.out.println(t1.t12);
		
	}
}

class pro extends IntegerArray {
	public String d = "ddd";
	protected String e = "eee"; 
	private String f = "fff";
}

class pub {
	public String a = "aaa";		// 어떤 클래스에서도 접근가능
	protected String b = "bbb";		// 동일 패키지 내 클래스나 상속관계에 있는 클래스에서 접근가능
	private String c = "ccc";		// 해당 클래스에서만 접근 가능
*/	
	
/*		int size = 4;
		int[] arr = new int[size];

		for(int i=0; i<arr.length; i++) {
			int ran = (int)(Math.random()*45)+1;
			arr[i] = ran;
				System.out.println(arr[i]);
			
		}*/
		double d = Math.random();
		int i = (int)(d*10);
		System.out.println(d);
		System.out.println(i);
	}
}