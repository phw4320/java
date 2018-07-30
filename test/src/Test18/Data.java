package Test18;

public class Data {
	// 이 부분은 선언만가능 
	int a = 3;
	public Data() { 
		// 데이터타입 넣어줄경우 그냥 클래스와 이름이 같은 메소드가됨
		//생성자 (작성하지않으면 자동으로생성)
		System.out.println("나는 생성자");
	}
	public static void main(String[] args) {
		Data d = new Data();
		d.a = 10;
		
		if(d.a == 10) {
			d.a = 4;
			d = new Data();
		}
		System.out.println(d.a);
	}
}
