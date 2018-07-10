package Test10;

public class FuncTest {
	public void add(int a, int b) {
		System.out.println("인트더하기 : " + a + b);
	}

	public void add(long a, long b) {
		System.out.println("롱더하기 : " + a + b);
	}

	public void add(float a, float b) {
		System.out.println("플롯더하기 : " + a + b);
	}
	
	public static void main(String[] args) {
		FuncTest ft = new FuncTest();
		ft.add(2, 3);
		ft.add(234l,324l);
		ft.add(643f,856f);
	}
}
