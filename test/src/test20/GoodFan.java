package test20;

public class GoodFan extends Fan {

	public GoodFan(String type, String color, int pow) {
		super(type, color, pow);
	}
	
	public void turnOff() {
		System.out.println(color + "색깔의 선풍기가 꺼졌습니다.");
	}
}

