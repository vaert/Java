package com.dan.cars;

public class Case1 {

	public static void main(String[] args) {
		Car car1=new Car();
		Bus bus1=new Bus();
		Car car2=new Bus();		//���۷��� ������
		
		car1.show();
		System.out.println(car1.speed());
		
		bus1.show();
		System.out.println(bus1.speed());
		bus1.move();
		
		car2.show();
		System.out.println(car2.speed());
		//car2.move(); (X)
		Bus buc1=(Bus)car2;
		buc1.move();
		Car car0=buc1;			//�ƱԸ�Ʈ ������
		car0.show();
		System.out.println(car0.speed());
		//car0.move();
		System.out.println("+++++++++++++++++++++");
		//Bus buc2=(Bus)car1;
		//ClassCastException �߻�
		//buc2.show()
		//System.out.println(buc2.speed());
		//buc2.move();
	}
}
