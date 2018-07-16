package test20;

public class Solid extends Cart {

	public Solid(String name, int speed, int dameage) {
		super(name, speed, dameage);
		
	}

	public String attact(int demeage) {
		return this.dameage + dameage + "만큼 공격";
	}
}
