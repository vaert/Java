public class IfLeapYear {

	public static void main(String[] arg) {
		
		for(int year=1998; year<2006; year++) {	
			boolean yearTF = false;
			if( (0==(year%4)) && 0!=(year%100) || 0==year%400 ) {
				yearTF = true;
			} else {
				yearTF = false;
			}
			
			if(yearTF) {
				System.out.println(year+"�� �����Դϴ�.");
			}else {
				System.out.println(year+"�� ������ �ƴմϴ�.");
			}
		}
	}
}

/*
	Learning Point
	- Ŭ����, ������, �������̽� �� �빮�ڷ� ���� (�Ľ�Į ���)
	- �޼���, ��� �ʵ�� �ҹ��ڷ� ����, ���ο� �ܾ �빮�ڸ� ��� (ī�� ���)
	- ����� ��� �빮�� ���
*/