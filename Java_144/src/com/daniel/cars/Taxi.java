package com.daniel.cars;

public class Taxi extends Car {
	private int sped=6;
	public void show() {
		System.out.println("Taxi~~6"+sped);
	}
	public int speed() {
		return sped;
	}
}
