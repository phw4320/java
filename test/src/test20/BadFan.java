package test20;

public class BadFan extends Fan {

	public BadFan(String type, String color, int pow) {
		super(type, color, pow);
		// TODO Auto-generated constructor stub
	}
	public void turnOn() {
		System.out.println(type + "용 선풍기가 켜졌습니다.");
	}
}
