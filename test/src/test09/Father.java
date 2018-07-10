package test09;

public class Father {
	public void test() {
		System.out.println("아빠의 테스트 함수");
		this.run();
	}
	public static void main(String[] args) {
		Father f = new Father();
	}
	protected void run() {
		System.out.println("아빠 달린다");
	}
	public void sleep() {
		System.out.println("아빠 잔다");
	}	
}
