
public class SeaAirplane extends Plane implements Ship {

	private String id="Air Balls";
	public SeaAirplane(String id) {
		this.id=id;
	}
	public SeaAirplane() {
		this("LeeMass");
	}
	
	//�������̽�
	@Override
	public int move() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public int carry() {
		// TODO Auto-generated method stub
		return 300;
	}
	
	//�߻�ȭ
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("������ ������ �̿��Ͽ� ���ư�");
	}

	@Override
	public int power() {
		// TODO Auto-generated method stub
		return 10000;
	}

	public String toString() {
		return this.id+"�� "+power()+"�������� "+move()+"���� ������.";
	}
}
