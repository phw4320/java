package Test12;

public class MethodTest {

	public void print() {
		System.out.println("프린트 함수");
	}
	
	public void print(int a) { 
		System.out.println("인트 프린트 함수");
	}
	public void print(String a) {
		System.out.println("문자열 프린트 함수");
	}
	public void print(int a, String b) {
		System.out.println("복합 프린트 함수");
	}
	public static void main(String[] args) {
		MethodTest mt = new MethodTest();
		mt.print();
		mt.print(2);
		mt.print(3,"d");
	}
}
