package Test11;

public class CreditCardTest {
	public static void main(String[] args) {
		CreditCard parkCard = new CreditCard();
		CreditCard leeCard = new CreditCard();
		
		parkCard.owner = "박현우";
		parkCard.setNumber(1234_1234_1244_1234L);
		leeCard.owner = "ㅇㅇㅇ";
		leeCard.setNumber(1234_1234_1234_1243L);
		
		parkCard.use(100000);
		leeCard.use(15000);
		parkCard.payBill(50000);
		leeCard.payBill(10000);
		System.out.println(parkCard.owner + " : " + parkCard.getNumber());
		System.out.println("카드대금 잔액 : " + parkCard.getBalance());
		System.out.println("카드포인트 : "+parkCard.getPoint());
		System.out.println(leeCard.owner + " : " + leeCard.getNumber());
		System.out.println("카드대금 잔액 : " + leeCard.getBalance());
		System.out.println("카드대금 잔액 : " + leeCard.getPoint());
	}

}
