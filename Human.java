package seleniumtraining;

public class Human {
	
	public int legs;
	public int hands;
	public String mouth;
	
	Human(){
		legs=2;
		hands=2;
		mouth="big mouth";
	}
	
	
	public void walking() {
	System.out.println("I am walking");	
	}
	
	public void talking() {
		System.out.println("I am talking");	

	}
	
	public void currentBill(int moeny,String connectionNum) {
			System.out.println("current biull paid");	
	}
	
	
	public int getMoneyFromATM(int amount,Card c1,int pin) {
		
		System.out.println("getting the amount from atm");
		System.out.println("got the amount and returnd");
		return amount;
	}
	
}
