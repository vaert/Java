
public class AccountInstanceMain {

	public static void main(String[] args) {
		//섹션 81의 Account 이용
		Account acc1=new Account();
		Account acc2=new Account(1000);
		Account acc3=new Account(1000);
		
		System.out.println(acc2==acc3);
		System.out.println(acc3.equals(acc3));
	}
}
