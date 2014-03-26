
public class CalendarIn7 {
	private int month[]=new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
	private int lmonth[]=new int[]{31,29,31,30,31,30,31,31,30,31,30,31};
	
	public boolean leapYearTF(int year) {
		boolean yearTF=false;
		if((0==(year%4)&&0!=(year%100))||0==year%400)
			yearTF=true;
		return yearTF;
	}
	
	/**
	 * 1~year ���� ���� Ƚ�� ���ϱ�
	 * @param year
	 * @return
	 */
	public int howManyLeapYear(int year) {
		int count=0;
		for(int i=1; i<year; i++) {
			if(leapYearTF(i))
				count++;
		}
		return count;
	}
	
	/**
	 * 2013/9/25 ���̸� (2013/1/1 ~ 2013/8/31) �� �ϼ� + 25(9��)
	 * @param year
	 * @param month
	 * @param day
	 * @return
	 */
	public int howManyDaysInYearsMonth(int year, int month, int day) {
		int count = day;
		if(leapYearTF(year)) {
			for(int i=0; i<month-1; i++) {
				count+=this.lmonth[i];
			}
		}else {
			for(int i=0; i<month-1; i++) {
				count+=this.month[i];
			}
		}
		return count;
	}
	
	/**
	 * ���� ��¥�� 0-->��, 1-->��, 2-->ȭ, 3-->��, 4-->��, 5-->��, 6-->��
	 * @param year
	 * @param month
	 * @return
	 */
	public int startDayInCal(int year, int month) {
		int count=0;
		int leapYear=howManyLeapYear(year-1);
		int howManyDaysInYear=howManyDaysInYearsMonth(year, month, 1);
		count=((leapYear)*2+(year-1-leapYear)+howManyDaysInYear);
		return count%7;
	}
	
	public boolean isLastDay(int year, int month, int day) {
		boolean isL=false;
		if(!leapYearTF(year)) {
			if(day==this.month[month-1]) {
				isL=true;
			}
		}else {
			if(day==this.lmonth[month-1]) {
				isL=true;
			}
		}
		return isL;
	}
	
	public int getDates(int year, int month) {
		if(leapYearTF(year)) {
			return this.lmonth[month-1];
		}else {
			return this.month[month-1];
		}
	}
	
	public void printCalendar(int year, int month) {
		int linecheck=0;
		String temp="";
		System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
		linecheck=startDayInCal(year,month);	//1���� ���� �����ΰ�?
		for(int j=0; j<linecheck; j++) {
			temp+="\t";
		}
		System.out.print(temp);
		int count=getDates(year,month);		//�� �޿� �� ���� �ִ°�
		
		for(int i=1; i<=count; i++) {
			System.out.print(i+"\t");
			linecheck++;
			if(linecheck==7) {
				if(this.isLastDay(year, month, i)) {
					return;		//������ ���� ������ �� �� �Ʒ��� ���� �ʿ� ����.
				}
				System.out.println();
				linecheck=0;
			}
		}
	}
}
