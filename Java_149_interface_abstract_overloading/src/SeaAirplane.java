
public class SeaAirplane extends Plane implements Ship {

	private String id="Air Balls";
	public SeaAirplane(String id) {
		this.id=id;
	}
	public SeaAirplane() {
		this("LeeMass");
	}
	
	//인터페이스
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
	
	//추상화
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("엔진과 날개를 이용하여 날아감");
	}

	@Override
	public int power() {
		// TODO Auto-generated method stub
		return 10000;
	}

	public String toString() {
		return this.id+"가 "+power()+"마력으로 "+move()+"명을 나른다.";
	}
}
