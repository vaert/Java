
public class Car {
	//�ɹ� �ʵ� Field
	private int speed = 0;
	private int direction = 0;
	
	//������ Constructor
	public Car() {
		
	}
	
	//�޼��� Method
	public void speedUp() {
		speed+=5;
	}
	
	public void speedDown() {
		speed-=5;
	}
	
	public int carSpeed() {
		return speed;
	}
	
	public void turnDirect(int dir) {
		direction+=dir;
	}
	
	public int carDirect() {
		return direction;
	}
}
