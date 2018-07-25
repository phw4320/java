package Test12;

public class PrintObject {
	
	String str = "poStr";
	public String toString() {
		return "이 클래스의 변수는 " + str + "이라는 값을 가지고 있습니다.";
	}
	public static void main(String[] args) {
		String str = "abc";
		System.out.println(str);
		
		PrintObject po = new PrintObject();
		System.out.println(po);			// 오버라이딩 원래는 쓸수없지만 상속이되어있어 toString메소드 사용가능 
		
	}
}
