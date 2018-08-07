package Test11;

public class Student {
	private String clazz;
	private String name;
	private int grade;
	
	public void setInfo(String clazz, String name, int grade) {
		this.clazz = clazz;
		this.name = name;
		this.grade = grade;
	}
	
	public void setclazz(String clazz) {
		this.clazz = clazz;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void printInfo() {
		System.out.println("반 : "+clazz+", 이름 : "+name+", 학년 : "+grade);
	}
}
