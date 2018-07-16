package test19;

public interface Action {
	public void eat(); //{	//인터페이스 안의 접근제어자는 default가 아닌 public이다.
		//System.out.println("밥먹다");   //몸통안이 비어있어야한다.
	//}
	public void sleep();
	public void move();
	/*
	public static void test() {
		System.out.println("1.8부터 사용가능");
	}*/
}
