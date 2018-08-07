package Test11;

public class Car {

	private int speed;
	private String name;
	private String company;
	
	void setInfo( String company, String name, int speed) {
		this.speed = speed;
		this.name = name;
		this.company = company;
	}
	
	void printInfo()
	{
		System.out.println(" 차이름 : " +name+ ", 회사명 : "+company+", 속도 : "+speed);		
	}
	
	
}
