package Test10;

public class ClassTest {
	int num;
	String str;

	public void test() {
		System.out.println(num);
	}
	public static void main(String[] args) {
		ClassTest ct = new ClassTest(); // 객체생성하면서 자바가 초기화를 시킴
		ct.num = 10;
		System.out.println(ct.num);
		ct.test();
		(new ClassTest()).num = 10;
		(new ClassTest()).test();	// 각 생성된 객체가 바라보는 시선이 다르다.
	}
}
