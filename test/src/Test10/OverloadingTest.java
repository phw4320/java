package Test10;

public class OverloadingTest {
	int a = 3;
	
	public void test() {	// 오버로딩 : 자바에서는 파라미터까지 포함하여 함수로 판단하기때문에 중복적인 메소드명 사용 가능 
		
	}
	public int test(int a) {
		return 0;
	}
	public int test(String a) {	// 파라미터개수가 같고 데이터 타입이 다르면 다른 함수로 인식
		return 0;
	}
	public void test(String b, int a) {
		
	}
	public void test( int a, String b) {	// 파라미터의 갯수와 데이터 타입 같아도 위치가다르면 다르게 인식
		
	}
	public static void main(String[] args) {
		OverloadingTest ot = new OverloadingTest();
		ot.test();
		ot.test(2);
	}
}
