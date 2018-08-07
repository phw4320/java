package test01;

public class ArrayTest {
	
	int a = 3;

	void test() {
		System.out.println(a);
	}

	public static void main(String[] args) {
		int a = 3;
		
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		System.out.println(arr[0]);
		arr = new int[3];
		System.out.println(arr[0]);
	}
}
