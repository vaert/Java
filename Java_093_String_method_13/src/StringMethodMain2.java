public class StringMethodMain2 {

	public static void main(String[] args) {
		String b="Hello.I love you.";
		
		
		//6 ��ҹ��ڷ�
		String d=b.toUpperCase();
		System.out.println(d);
		String e=b.toLowerCase();
		System.out.println(e);
		
		
		//7 ���� ���� ����
		System.out.println(" �ȳ��ϼ��� ".trim());
		
		
		//8 String<--> int
		int istr=Integer.parseInt("37");
		String stri=String.valueOf(istr);
		String stri2=istr+"";
		
		
		//9 ��ҹ��� ������� ���ϱ�
		System.out.println("hello".compareToIgnoreCase("Hello"));
		System.out.println("Hello".compareToIgnoreCase("hello"));
		
		
		//10 +�� ���� concatenation
		stri=stri.concat("hello");
		System.out.println(stri);
		
		
		//11 ���ڿ� <--> char �迭
		char[] chs=b.toCharArray();
		String copys1=String.copyValueOf(chs);
		String copys2=new String(chs);
		for(char ch:chs) {
			System.out.printf("%c",ch);
		}
		
		
		//12 String format
		String ss=String.format("%s %d %c %f","Hellos",78,'c',8.6);
		System.out.println(ss);
		
		
		//13 ���ڸ� �����ϰ� �ִ°�?
		System.out.println("hello".contains("el"));
	}
}
