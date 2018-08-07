package test09;

import org.omg.CORBA.PUBLIC_MEMBER;

class Test{
	static int numSt;
	
	public static void dd() {
		int num;
	}
}

public class StaticTest {
	int num = 20;		// 변수	(메모리를 생성하여 변수에 저장해야함, 객체소멸시 값도 소멸)
	static int numSt=10;		// static 변수 ( 접근하여 저장할때 메모리를 생성하지 않음) 

	public static void main(String[] args) {
		//StaticTest.numSt = 30;
		Test t = new Test();
		StaticTest st = new StaticTest();
		st.num = 90;
		StaticTest.numSt = 100;
		
		System.out.println(st.num);		// 생성된 객체의 변수내용을 바꿔주기 때문에 그 객체에만 유효 
		System.out.println(StaticTest.numSt);	// 객체의 변수가 아니라 클래스의 변수로 어떤 객체가 생성되더라도 동일한 주소의 하나의 변수를 참조
		
		st = new StaticTest();			
		
		System.out.println(st.num);
		System.out.println(st.numSt);
		Test1.chNum();
		
		
		System.out.println(st.num);
		System.out.println(st.numSt);
		
		//Test.numSt = 50;
		//numSt = 20;
		StaticTest t1 = new StaticTest();
		t1 = new StaticTest();
		System.out.println(t1.num);
		System.out.println(t1.numSt);
	/*	Test1 t = new Test1();
		t.chNum();
		System.out.println(StaticTest.numSt);
		System.out.println(t1.num);*/
	}
}
