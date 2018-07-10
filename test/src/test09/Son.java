package test09;

public class Son extends Father {
	public void run() {
		System.out.println("dddd");
	}
	public void test() {
		System.out.println("아들의 테스트 함수");
		this.run();			// 자신의 메소드 호출
		super.test();		// 상위클래스의 메소드 호출
	
	}
	public static void main(String[] args) {
		Son s = new Son();
		s.run();
		s.test();
	}
}

