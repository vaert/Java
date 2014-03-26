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
				System.out.println(year+"는 윤년입니다.");
			}else {
				System.out.println(year+"는 윤년이 아닙니다.");
			}
		}
	}
}

/*
	Learning Point
	- 클래스, 생성자, 인터페이스 는 대문자로 시작 (파스칼 방식)
	- 메서드, 멤버 필드는 소문자로 시작, 새로운 단어에 대문자를 사용 (카멜 방식)
	- 상수는 모두 대문자 사용
*/