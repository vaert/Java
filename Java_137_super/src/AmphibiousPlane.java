/**
 * - super() �� ����ϴ� ����?
 * ; ������ �ȿ��� �θ��� ������ ������ �Ѵ�.
 * 
 * @author DooHo
 *
 */
public class AmphibiousPlane extends Airplane2 {
	
	private String landingZone="east sea 110 123";	//���� ��ġ
	private int number=5;
	
	public AmphibiousPlane(String nameOfAirp, int fuel, int goPerL, 
								String landingZone, int number) {
		super(nameOfAirp, fuel, goPerL);		//�θ� ��� �ʱ�ȭ
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
		return getNameOfAirp()+"�� ������ġ:"+landingZone;
	}
	
	public int getNumber(){return number;}
	//public int getFuel(){return super.fuel;} //super�� ����� private�̶� X
	
	public String toString() {
		String s="";
		if(getFuel()>999) {
			s=super.toString();
			s+="   ���� ��ġ��:"+landingZone;
			s+="   �°��ο�:"+number;
		}else {
			s=super.toString();
		}
		return s;
	}
}
