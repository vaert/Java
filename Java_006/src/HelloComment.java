/**
 * Created on 2013.10.29<br>
 * 주석 사용법 소스<br>
 * javadoc -use HelloComment.java
 * @author DooHo
 */
public class HelloComment {
	public boolean isPre(int a) {
		boolean isP=true;
		int b=(int)Math.sqrt(a);	//50이면 2부터 7까지
		for(int i=2; i<=b; i++) {
			if(a%i==0) {			// (50,2) (50,3) (50,4) ....
				isP=false;
				break;		// for 탈출
			}else isP=true;
		}
		return isP;
	}
	
	public static void main(String[] args) {
		System.out.println(new HelloComment().isPre(50));
	}
}

