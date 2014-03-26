
public class SansuStatic {
	public static final int MAN = 1;
	public static final int WOMAN = 2;
	
	public static void main(String[] args){
		int people1=MAN;
		switch(people1){
			case 1: System.out.println("害切");break;
			case 2: System.out.println("食切");break;
		}
		//int SansuStatic.WOMAN=4;
		int people2=SansuStatic.WOMAN;
		switch(people2){
			case 1: System.out.println("害切");break;
			case 2: System.out.println("食切");break;
		}
	}
}
