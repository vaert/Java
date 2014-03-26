import com.daniel.one.MyMotherSecret;
import com.daniel.one.MyTopSecret;

public class PackageUsingSecretMain {

	public static void main(String[] args) {
		MyMotherSecret mother=new MyMotherSecret();
		MyTopSecret my=new MyTopSecret();
		//private,(default),protected 가 안보임
		System.out.println(mother.getSlushMoney());
		System.out.println(mother);				//public
		System.out.println(my.getSlushMoney());
		System.out.println(my);
	}
}
