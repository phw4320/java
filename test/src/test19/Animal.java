package test19;

public class Animal implements Action {
	@Override
	public void eat() {
		System.out.println("동물이 밥을 먹는다.");
	}

	@Override
	public void sleep() {
		System.out.println("동물이 잠을 잔다.");
	}

	@Override
	public void move() {
		System.out.println("동물이 움직인다.");
	}
	
	public void hunt() {
		System.out.println("동물이 사냥한다.");
	}
}
