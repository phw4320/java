package test24;

public class FinallyTest {

	public static void main(String[] args) {
		String numStr = "12a";

		try {
			int num = Integer.parseInt(numStr);
			System.out.println(numStr +"은 숫자");

		} catch (Exception e) {
			System.out.println(numStr +"은 문자");
		} finally {	// 무조건실행되는 구역
			System.out.println(numStr +"은 숫자나 문자상관없이 호출");
		}
	}
}
