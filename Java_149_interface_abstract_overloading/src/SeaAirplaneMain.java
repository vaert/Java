/*

	CS110�� 10000�������� 5���� ������.
	
	10000
	������ ������ �̿��Ͽ� ���ư�
	
	5���� �¿�� 
	300���� �ư� ���� �ִ�.
	5���� �¿�� 
	300���� �ư� ���� �ִ�.
	10000
	������ ������ �̿��Ͽ� ���ư�

*/
public class SeaAirplaneMain {

	public static void main(String[] args) {
		SeaAirplane sea=new SeaAirplane("CS110");
		
		Plane p=sea;		// �߻�Ŭ������ ��ü ����
		Ship s=sea;			// �������̽��� ��ü ����
		
		SeaAirplaneUtil.show(sea);
		SeaAirplaneUtil.show(p);
		SeaAirplaneUtil.show(s);
		SeaAirplaneUtil.showOnly(sea);
		SeaAirplaneUtil.showPlane(sea);
	}
}
