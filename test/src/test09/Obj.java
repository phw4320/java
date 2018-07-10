package test09;

import java.util.*;

class tmp {
	void tmp2() { // 다른 클래스의 변수와 메소드의 접근
		System.out.println("다른 클래스 오브젝트 테스트");
	}
}

public class Obj { // 변수와 메소드의 접근

	public int num = 3;
	boolean bl = true;
	boolean bl2 = false;

	public void setNum(int num) {
		this.num = num;
	}
	public int getNum() {	// 접근제어자 private
		return 1352;
	}
	
	protected String getStr() {	// 접근제어자 default
		return "abc";
	}
	
	Obj getObj() {
		return this;	// 빌드패턴할 때 사용
	}

	void test() { // 함수에게만 void 선언 가능
		int num = 10;
		boolean bl = false;
		System.out.println(this.num); // 클래스의 필드 값을 가르킴 (파라미터 x)
		System.out.println(this.bl);
		System.out.println(num);
		System.out.println(bl);
		System.out.println("난 Obj의 테스트 함수!");
	}

	void test2() {
		System.out.println(num);
		System.out.println(bl);
		test();
	}

	public static void main(String[] args) {	// void 반환값 x

		Person[] ps;
		ps = new Person[10];

		for (int i = 0; i < ps.length; i++)
			ps[i] = new Person();
	/*	ps[0].name = "이순신";
		ps[0].age = 100;
		ps[0].address = "서울";
		ps[0].run();
		ps[0].eat();
		ps[0].sleep();
		ps[1].name = "ddd";
		ps[1].run();*/
		Obj o = new Obj();
		// o.num = 10;
		o.test();
		int a = o.getNum();
		System.out.println(a);
		String b = o.getStr();
		System.out.println(b);
		System.out.println(o.getStr().length());
	}
}


