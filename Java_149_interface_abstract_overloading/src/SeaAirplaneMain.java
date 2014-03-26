/*

	CS110가 10000마력으로 5명을 나른다.
	
	10000
	엔진과 날개를 이용하여 날아감
	
	5명을 태우고 
	300정을 싣고 가고 있다.
	5명을 태우고 
	300정을 싣고 가고 있다.
	10000
	엔진과 날개를 이용하여 날아감

*/
public class SeaAirplaneMain {

	public static void main(String[] args) {
		SeaAirplane sea=new SeaAirplane("CS110");
		
		Plane p=sea;		// 추상클래스의 객체 생성
		Ship s=sea;			// 인터페이스의 객체 생성
		
		SeaAirplaneUtil.show(sea);
		SeaAirplaneUtil.show(p);
		SeaAirplaneUtil.show(s);
		SeaAirplaneUtil.showOnly(sea);
		SeaAirplaneUtil.showPlane(sea);
	}
}
