/**
 * - super() 를 사용하는 이유?
 * ; 생성자 안에서 부모의 생성자 역할을 한다.
 * 
 * @author DooHo
 *
 */
public class AmphibiousPlane extends Airplane2 {
	
	private String landingZone="east sea 110 123";	//착륙 위치
	private int number=5;
	
	public AmphibiousPlane(String nameOfAirp, int fuel, int goPerL, 
								String landingZone, int number) {
		super(nameOfAirp, fuel, goPerL);		//부모 멤버 초기화
		this.landingZone=landingZone;
		this.number=number;
	}
	public AmphibiousPlane(String nameOfAirp, int fuel, String landingZone, int number) {
		this(nameOfAirp, fuel, 10, landingZone, number);
	}
	public AmphibiousPlane(String nameOfAirp, String landingZone) {
		this(nameOfAirp, 10000, 10, landingZone, 5);
	}
	public AmphibiousPlane() {
		//super() -->Airplane2();
	}
	
	public String getLandingZone() {
		return getNameOfAirp()+"의 착륙위치:"+landingZone;
	}
	
	public int getNumber(){return number;}
	//public int getFuel(){return super.fuel;} //super의 멤버가 private이라 X
	
	public String toString() {
		String s="";
		if(getFuel()>999) {
			s=super.toString();
			s+="   착륙 위치는:"+landingZone;
			s+="   승객인원:"+number;
		}else {
			s=super.toString();
		}
		return s;
	}
}
