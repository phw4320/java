package test09;

public class Excutor /*extends Person*/{

	public static void main(String[] args) {
		Person p = new Person();
		Excutor e = new Excutor();
		p.setName("박경훈1"); 
		p.setAge(25);
		p.setAddress("서울");
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getAddress());
		System.out.println(p.toString());
		System.out.print(p.testStr());		// 상속관계에서 접근
		}
}
