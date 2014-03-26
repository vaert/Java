import java.util.Calendar;

public class HowManyDaysMain {

	public static void main(String[] args) {
		HowManyDays how=new HowManyDays();
		System.out.println(how.howManyDays());
		how.setFrom(HowManyDays.makeDay(1986, 8, 30));
		how.setTo(HowManyDays.makeDay(2013, 10, 30));
		//how.setTo(Calendar.getInstance());
		System.out.println(how.howManyDays());
		System.out.println(how.howManyDays()*24);
		System.out.println(how.howManyDays()*24*60);
	}
}
