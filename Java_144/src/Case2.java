import com.daniel.cars.*;

public class Case2 {

	public static void _main(String[] args) {
		Car car3=new Truck();
		Truck truck1=new Truck();
		
		car3.show();		// 오버라이딩
		System.out.println(car3.speed());
		//car3.tone();		// (X)
		
		truck1.show();		// 오버라이딩
		System.out.println(truck1.speed());
		truck1.tone();
	}
}
