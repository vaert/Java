
public class AmphibiousPlaneMain {

	public static void main(String[] args) {
		AmphibiousPlane amphi=new AmphibiousPlane("SeaHawk", 6000, "Eastsea", 8);
		AmphibiousPlane amphi2=new AmphibiousPlane();
		System.out.println(amphi);
		System.out.println(amphi2);
		System.out.println(amphi2.getLandingZone());
	}
}
