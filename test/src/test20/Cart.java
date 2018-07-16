package test20;

public class Cart implements Drive{
	protected String name;
	protected int speed;
	protected int dameage;
	public Cart(String name, int speed, int dameage) {
		this.name = name;
		this.speed = speed;
		this.dameage = dameage;
	}
	
	@Override
	public String attack(int dameage) {
		// TODO Auto-generated method stub
		return dameage +"로 공격";
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println(speed + "로 달림");
	}

	@Override
	public void stop() {
		System.out.println("정지");
	}
	

}
