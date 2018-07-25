package test08;

public class LottoTest {
	public static void main(String[] args) {
		int[] Lotto = new int[6]; 
		
		for (int i=0; i<Lotto.length; i++) {
		
			Lotto[i] =(int)(Math.random()*5);
			System.out.println(Lotto[i]);
		}
	}
}
