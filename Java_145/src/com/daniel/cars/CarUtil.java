package com.daniel.cars;

public class CarUtil {
	public static void print(Car car) {
		//¸Þ¼­µå
		car.show();
		System.out.println(car.speed());
	}
	public static void showInstace(Car car) {
		if(car instanceof Bus) {
			Bus b=(Bus)car;
			b.move();
		}else if(car instanceof Truck) {
			Truck t=(Truck)car;
			t.tone();
		}
	}
}
