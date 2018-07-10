package Test11;

public class Exec {

	public static void main(String[] args) {
		
		Student s = new Student();
		s.setclazz("5반");
		s.setName("임꺽정");
		s.setGrade(17);
		s.printInfo();
		Student s1 = new Student();
		s1.setInfo("4반", "홍길동", 18);
		s1.printInfo();
		int[] temperature = new int[5];
		temperature[0] = 3;
		
		
	}

}
