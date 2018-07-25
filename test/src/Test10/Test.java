package Test10;

public class Test {						// 오버로딩 사용 이유
	static void printSome(){
		System.out.println("print");
	}
	static void printInt(int a){
		System.out.println("print" + a);
	}
	static void printString(String a){
		System.out.println("print" + a);
	}
	static void printBool(boolean a){
		System.out.println("print" + a);
	}
	static void printDouble(double a){
		System.out.println("print" + a);	// 여러가지다양한 이름의 메소드를 오버로딩으로 메소드명일치화 함으로써 
	}										// 보다 간편하게 사용이 가능
	public static void main(String[] args) {
		printSome();
	}
}
