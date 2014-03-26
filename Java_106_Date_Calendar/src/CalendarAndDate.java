import java.util.Date;
import java.util.Calendar;

public class CalendarAndDate {
	public static void main(String[] args) {
		Date d1=new Date();								//오늘
		System.out.println(d1.toString());
		Date d2=new Date(System.currentTimeMillis());	//오늘
		System.out.println(d2.toString());
		System.out.println(d1.compareTo(d2));			//d1과 d2 비교
		System.out.println(d1.after(d2));				//is d1 afterday?
		System.out.println(d1.before(d2));				//is d2 beforeday?
		long longDays=d1.getTime();						//
		Date d3=(Date)d1.clone();
		d3.setTime(longDays+1000*60*60*24*3);		//3일 후
		System.out.println(d3);
		System.out.println(d1);
		
		Calendar cal=Calendar.getInstance();			//new 로 객체 생성하지 않는다.
		System.out.println(cal.toString());
		System.out.println(cal.getTime());
		System.out.println(cal.getTime().getTime());
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(new Date(cal.getTime().getTime()));

	}

}
