package test20;

public class Exec1 {
	public static void turnOn(Action[] at1) {
		for (Action a : at1) {
			a.turnOn();
		}
	}

	public static void turnOff(Action[] at1) {
		for (Action a : at1) {
			a.turnOff();
		}
	}
	
	public static void power(Action[] at1) {
		for (Action a : at1) {
			System.out.println(a.power(20));
		}
	}

	public static void main(String[] args) {

		/*Action a = new GoodFan("탁상", "파랑", 3);

		Action a1 = new SosoFan("벽걸이", "빨강", 2);
		Action a2 = new BadFan("스탠드", "노랑", 1);
		a.turnOff();
		a1.turnOn();
		System.out.println(a2.power(6));*/

		Action[] at = new Action[1];
		at[0] = new GoodFan("탁상", "주황", 5);
		//at[1] = new SosoFan("날개없는", "보라", 8);
		//at[2] = new BadFan("휴대", "검정", 10);
		
		turnOn(at);
		turnOff(at);
		System.out.println(at[0].power(40));
		//power(at);
	}
}
