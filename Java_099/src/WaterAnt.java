/**
 * ���, �������̵�
 * @author DooHo
 *
 */
public class WaterAnt extends Ant {
	private String where="water";
	public void show() {
		System.out.println(where+"�ֺ�");
	}
	
	public void print() {
		System.out.println(getName()+"�� "+where+"�� ���.");
	}
	
	public static void main(String[] args) {
		new WaterAnt().print();
	}
}
