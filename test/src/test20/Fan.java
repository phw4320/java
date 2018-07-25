package test20;

public class Fan implements Action {
	protected String type;
	protected String color;
	protected int pow;
	
	public Fan(String type, String color, int pow) {
		this.type = type;
		this.color = color;
		this.pow = pow;
	}
	
	@Override
	public void turnOn() {
		System.out.println("전원이 켜졌습니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("전원이 꺼졌습니다.");
	}

	@Override
	public String power(int pow) {
		return pow+"세기로 돌아가고 있습니다.";
	}

	
}
