package test19;

public class StaticTest {
	static final int a = 10;
	public static void main(String[] args) {
		//StaticTest.a = 11; 상수로 선언하면 값을 변경할 수 없다.
		System.out.println(a);
		StaticTest st = new StaticTest();
		System.out.println(st.a);
	}
}
// final 클래스는 상속받을 수없다 메소드또한 오버라이딩 할 수 없다.