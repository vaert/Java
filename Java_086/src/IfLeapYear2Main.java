
public class IfLeapYear2Main {

	public static void _main(String[] args) {
		IfLeapYear2 leap=new IfLeapYear2();
		leap.setYear(2004);
		System.out.println(leap.isLeapYear());
		leap.print();
		leap.setYear(2005);
		leap.prints();
	}
}
