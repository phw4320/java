package Test12;

public class Son extends Father{

	void work() {		// 상속관계에서 데이터타입도 같아야한다. // 덮어씌워서 재정의
		System.out.println("나는 다른일을 한다.");	// 접근제어자를 넣으려면 아버지의 접근제어자보다 권한이 높아야한다.
	}
	void work(int a) {
		System.out.println("이것은 오버라이드로 덮어쓴것이 아닌 파라미터가 들어간 다른 함수입니다.");
	}
	public static void main(String[] args) {
		Son s = new Son();
		s.work();
	}
}


