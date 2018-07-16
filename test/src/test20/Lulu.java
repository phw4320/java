package test20;

public class Lulu extends Cart{

	public Lulu(String name, int speed, int dameage) {
		super(name, speed, dameage);
	}
	
	public void stop() {
		System.out.println(name +"이 정지");
	}
}
