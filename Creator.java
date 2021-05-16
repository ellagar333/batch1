package seleniumtraining;

public class Creator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Human raj=new Human();
		Human prasad=new Human();
		
		Card c1=new Card("1234567890");
		
		raj.currentBill(1200, "DS-3456");
		int atmMoney=prasad.getMoneyFromATM(2000, c1, 5000);
		System.out.println("amount recived from atm:"+atmMoney);
		
		
		
		
	}

}
