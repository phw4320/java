package test261;

public class Person {
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	private String name;
	private int age;
	
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int compareTo(Person p) {
		if(this.age<p.age) {
			return 1;
		} else if (this.age>p.age) {
			return -1;
		}
		return 0;
	}
}
