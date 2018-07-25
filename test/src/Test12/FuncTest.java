package Test12;

public class FuncTest {

	public void printLoop(int start, int end) {
		for(int i=start; i<=end; i++) {
			System.out.println(i);
		}
	}
	public void printReverseLoop(int end, int start) {
		for(int i=end; i>=start; i--) {
			System.out.println(i);
		}
	}	
	public static void main(String[] args) {
		FuncTest ft = new FuncTest();
		ft.printLoop(1, 10);
		ft.printReverseLoop(10, 0);
	}
}
