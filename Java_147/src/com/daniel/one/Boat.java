package com.daniel.one;

public class Boat extends Ship {

	@Override
	public int move() {
		// TODO Auto-generated method stub
		return 6;
	}	// 사람을 몇명 나르는가?

	@Override
	public int carry() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public String name() {
		return "쌩쌩 보트 : ";
	}
}
