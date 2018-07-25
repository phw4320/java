package test19;

public class Person implements Action{

	@Override
	public void eat() {
		System.out.println("사람이 밥을 먹는다.");
	}

	@Override
	public void sleep() {
		System.out.println("사람이 잠을 잔다.");
	}

	@Override
	public void move() {
		System.out.println("사람이 움직인다.");
	}
	
	public void work() {
		System.out.println("사람이 일한다.");
	}
}
