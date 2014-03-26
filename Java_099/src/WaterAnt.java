/**
 * 상속, 오버라이딩
 * @author DooHo
 *
 */
public class WaterAnt extends Ant {
	private String where="water";
	public void show() {
		System.out.println(where+"주변");
	}
	
	public void print() {
		System.out.println(getName()+"은 "+where+"에 산다.");
	}
	
	public static void main(String[] args) {
		new WaterAnt().print();
	}
}
