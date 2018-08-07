package Test10;

public class Calc {
	// 더하기 add()
	// 빼기    minus()
	// 곱하기 multiple()
	// 나누기 divide()
	public void add(int a, int b) {
		System.out.println("더하기 : "+(a+b));
	}
	public void minus(int a, int b) {
		System.out.println("빼기 : "+(a-b));
	}
	public void multiple(int a, int b) {
		System.out.println("곱하기 : "+(a*b));
	}
	public void divide(int a, int b) {
		System.out.println("나누기 : "+(a/b));
	}
	public Calc() {
		System.out.println("디폴트생성자입니다.");
	}
	/*public void calc(String op, int num1, int num2) {
		if(op.equals("+")) {
			add(num1,num2);
		}
		else if(op.equals("-")) {
			minus(num1,num2);
		}
		else if(op.equals("*")) {
			multiple(num1,num2);
		}
		else if(op.equals("/")) {
			divide(num1,num2);
		}*/
}
/*	public static void main(String[] args) {
		Calc c = new Calc();
		c.add(1,2);
		c.minus(2, 6);
		c.multiple(4, 6);
		c.divide(7, 4);
	}*/

