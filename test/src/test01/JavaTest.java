package test01;

public class JavaTest {
	static int a = 3;
	public static void main(String[] args) {
		int[] arr =new int[3];
		arr[0] = 2;
		arr[1] = 2;
		arr[2] = 2;
		int[] tmpArr = arr;
		
		arr = new int[5];
		arr[0] = tmpArr[0];
		arr[1] = tmpArr[1];
		arr[2] = tmpArr[2];
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr[" + i + "]="+arr[i] );
		}
	}
}
