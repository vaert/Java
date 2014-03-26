
public class Tank {
	public static int howmany=0;	// 다른 클래스에서 Tank.howmany 로 사용할 수 있다.
	public int howfast=100;
	
	public void input() {
		howmany++;
	}
	
	public void increase() {
		howfast+=30;
	}
	
	public static int getHowMany() {
		return howmany;
	}
	
	public int getHowFast() {
		return howfast;
	}
	
	public void showShortLife() {
		int age=5;
		howfast-=age;
	}
}
