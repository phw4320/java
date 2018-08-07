package test09;

public class FunctionTest {
	static void print(String str) {
		System.out.println("sadad");
	}
	static void sum(int num1, int num2) {
		System.out.println(num1+num2);
	}
	static int getNum() {
		return 0;
	}
	static FunctionTest getFT() {
		return new FunctionTest();
	}
	public static void main(String[] args) {
		FunctionTest f = getFT();
		print(null);
		sum(3,4);
		String str = getNum()+"";
		System.out.println(str);	
		}
	}



