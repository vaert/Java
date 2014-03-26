package com.daniel.main;
import com.daniel.cars.*;

public class Case6 {

	public static void main(String[] args) {
		Car car7=new Cargo();
		
		Truck truc5=new Cargo();
		Cargo cago2=(Cargo)car7;
		Cargo cago3=(Cargo)truc5;
		Truck truc7=(Truck)car7;
		
		car7.show();
		System.out.println(car7.speed());
		
		Cargo cago1=new Cargo();
		cago1.show();
		System.out.println(cago1.speed());
		cago1.tone();
		cago1.passing();
		
		cago2.show();
		System.out.println(cago2.speed());
		cago2.tone();
		cago2.passing();
		

	}

}
