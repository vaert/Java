
public class Airplane2 {
	
	private String nameOfAirp="C10111";
	private int fuel=10000;
	private int goPerL=10;
	
	public Airplane2(String nameOfAirp, int fuel, int goPerL) {
		this.nameOfAirp = nameOfAirp;
		this.setFuel(fuel);
		this.goPerL=goPerL;
	}
	public Airplane2(String nameOString, int fuel) {
		this(nameOString, fuel, 10);
	}
	public Airplane2(String nameString) {
		this(nameString, 10000, 10);
	}
	public Airplane2() {
		this("C10111", 10000, 10);
	}
	
	public String getNameOfAirp() {
		return nameOfAirp;
	}
	public int getFuel() {
		return fuel;
	}
	public void setFuel(int fuel) {
		if(fuel<1000) {
			System.out.println("연료부족위험");
			this.fuel=0;
			return;
		}
		this.fuel=fuel;
	}
}
