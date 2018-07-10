package test09;

public class Person {
	private String name;
	private int age;
	private String address;

	protected void setName(String name) {			// 설정자
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getName() {					// 접근자
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public String getAddress() {
		return this.address;
	}
	public String toString() {
		String str = "내이름은 : " + this.name;
		str +=", 나이는 : " + this.age;
		str +=", 주소는 : " + this.address;
		return str;
	}
	protected String testStr() {
		return "상속받았습니다.";
	}
}

