package com.daniel.main;
import com.daniel.cars.*;

public class Case5 {

	public static void _main(String[] args) {
		Car car6=new Dump();
		Dump dum1=new Dump();
		Dump dum2=(Dump)car6;
		Truck truc3=(Truck)car6;
		Dump dum3=(Dump)truc3;
		Truck dum4=new Dump();
		
		dum2.show();
		System.out.println(dum2.speed());
		dum2.pass();
		dum2.tone();
	}
}
