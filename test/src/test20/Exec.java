package test20;

public class Exec {

	public static void start(Drive[] ds) {
		for(Drive d : ds) {
		d.start();
		}
	}
	
	public static void attack(Drive[] as) {
		for (Drive d : as) {
			System.out.println(d.attack(30));
		}
	}
	public static void stop (Drive[] ss) {
		for (Drive d : ss) {
		d.stop();
		}
	}
	public static void main(String[] args) {
		Drive[] d = new Drive[2];		//메모리생성한것 아님, 인터페이스는 메모리 생성 불가
		d[0] = new Lulu("루루", 100, 50);
		d[1] = new Solid("솔리드", 80, 70);
		//d[2] = new TraningCart("연습카트", 40, 60);
 		/*Drive d1 = new Lulu("루루", 100, 50);
		Cart sol = new Solid("솔리드", 80, 60);*/
		
		start(d);
		//start(d);
		//attack(d);
		stop(d);
		//start(d[1]);
	}
}
