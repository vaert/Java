package com.daniel.cars;

public class Dump extends Truck {
	private int weight=14;
	public void show() {
		System.out.println("Dump~~12 "+weight);
	}
	public int speed() {
		return sped;
	}
	public void pass() {
		System.out.println("Dump~~14 "+weight+" sped "+sped);
	}
}
