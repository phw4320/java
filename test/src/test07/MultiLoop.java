package test07;

public class MultiLoop {
	public static void main(String[] args) {
		String str = "a d,da";
		String[] arrStr = new String[3];
		
		arrStr = str.split(" ");
		for(int i =0; i<arrStr.length; i++) {
			
		System.out.printf(arrStr[i]);
		}
		
	}
}
