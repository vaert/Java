package com.daniel.one;

public class MyMotherSecret {
	protected int age=35;
	String blood="A";					//default
	private double slushMoney=300;		//���ڱ�
	
	public MyMotherSecret(int age, String blood, double slushMoney) {
		this.age=age;
		this.blood=blood;
		this.slushMoney=slushMoney;
	}
	public MyMotherSecret() {
		this(35, "A", 300);
	}
	
	public double getSlushMoney() {
		return slushMoney;
	}
	public String toString() {
		return "����:"+age+",������:"+blood+",���ڱ�:"+slushMoney;
	}
}
