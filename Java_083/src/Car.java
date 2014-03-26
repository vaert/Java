
public class Car {
	//맴버 필드 Field
	private int speed = 0;
	private int direction = 0;
	
	//생성자 Constructor
	public Car() {
		
	}
	
	//메서드 Method
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
