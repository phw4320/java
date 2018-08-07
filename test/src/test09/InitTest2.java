package test09;

public class InitTest2 {
	String str = "abc";
	
	public static void main(String[] args) {
		InitTest it = new InitTest();
		InitTest2 it2 = new InitTest2();
		
		String a = "123";
		String b = "123";
		String c = new String("abc");
		String d = new String("abc");
		System.out.println("a==b? "+a==b);
		System.out.println("c==d? "+c==d);
		
		System.out.println("it.str==it2.str? "+it.str==it2.str);
		String str = new String("abc");
		
		String str2 = "abc";
		System.out.println(str.equals(it2));
		System.out.println(str2==it2.str);
	}
}
