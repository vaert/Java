
public class DataTypes {
	public static void main(String[] args){
		//기본타입
		int primitiveInt = 19;
		double primitiveLong = 3.1454;
		
		//참조타입
		String refStr = "안녕하세요";
		Object refObj = new Object();
		
		//랩퍼 클래스(참고)
		Integer wrapInt = new Integer(19);
		Double wrapDouble = new Double(3.1453);
		
		//배열(참고)
		int[] a= {1,2,3};
		
		System.out.println("1:"+primitiveInt);
		System.out.println("2:"+primitiveLong);
		System.out.println("3:"+refStr);
		System.out.println("4:"+refStr.indexOf('녕'));
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
