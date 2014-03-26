
public class Account {
	private double money=500;
	
	public Account(double money) {
		this.money=money;
	}
	
	public Account() {
		
	}
	
	public double getMoney() {
		return money;
	}
	
	//-500원과 같이 음수 돈을 출금하거나, 잔금보다 많은 돈을 출금 못하게
	//하면서 원하는 돈을 출금
	public void withdraw(double amount) {	//출금
		if((amount>0)&&(money-amount>=0)) {
			money-=amount;
		}
	}
	
	//-500원과 같이 음수 돈을 입금 못하게
	//하면서 원하는 돈을 입금
	public void deposit(double amount) {	//입금
		if(amount>0) {
			money+=amount;
		}
	}
}
