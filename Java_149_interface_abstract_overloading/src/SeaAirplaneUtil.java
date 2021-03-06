/**
 *	오버로딩 된 show 함수
 *	
 * @author Daniel
 *
 */
public class SeaAirplaneUtil {
	public static void show(Plane p) {
		System.out.println(p.power());
		p.fly();
	}
	
	public static void show(Ship s) {
		System.out.println(s.move()+"명을 태우고 ");
		System.out.println(s.carry()+"정을 싣고 가고 있다.");
	}
	
	public static void show(SeaAirplane s) {
		System.out.println(s);
	}
	
	public static void showOnly(Ship s) {
		System.out.println(s.move()+"명을 태우고 ");
		System.out.println(s.carry()+"정을 싣고 가고 있다.");
	}
	
	public static void showPlane(Plane p) {
		System.out.println(p.power());
		p.fly();
	}
}
