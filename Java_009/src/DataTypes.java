
public class DataTypes {
	public static void main(String[] args){
		//�⺻Ÿ��
		int primitiveInt = 19;
		double primitiveLong = 3.1454;
		
		//����Ÿ��
		String refStr = "�ȳ��ϼ���";
		Object refObj = new Object();
		
		//���� Ŭ����(����)
		Integer wrapInt = new Integer(19);
		Double wrapDouble = new Double(3.1453);
		
		//�迭(����)
		int[] a= {1,2,3};
		
		System.out.println("1:"+primitiveInt);
		System.out.println("2:"+primitiveLong);
		System.out.println("3:"+refStr);
		System.out.println("4:"+refStr.indexOf('��'));
		System.out.println("5:"+refStr.hashCode());
		System.out.println("6:"+refObj);
		System.out.println("7:"+refObj.getClass());
		System.out.println("8:"+refObj.hashCode());
		System.out.println("9:"+wrapInt);
		System.out.println("10:"+wrapInt.intValue());
		System.out.println("11:"+wrapDouble);
		System.out.println("12:"+wrapDouble.doubleValue());
		System.out.println("13:"+a);
		System.out.println("14:"+a.length);
		System.out.println("15:"+a[1]);
		
	}
}
