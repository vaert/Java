import java.lang.reflect.Constructor;

public class UsingObject {

	public static void main(String[] args) {
		
		Object obj1=new Object();
		Object obj2=new Object();
		
		System.out.println(obj1.hashCode());
		System.out.println(obj1==obj2);
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1);
		System.out.println(obj2.toString());
		
		System.out.println(obj1.getClass().getName());	//Ŭ���� �̸�
		String str=obj1.getClass().getName() + "@" + Integer.toHexString(obj1.hashCode());
		System.out.println(str);
		
		Object objstr=new String("Good");				//������
		System.out.println(objstr.toString());
		System.out.println(objstr instanceof Object);		//��ü Ÿ���� Ȯ���Ѵ�
		System.out.println(objstr instanceof String);
		
		Class classes=obj1.getClass();
		System.out.println(classes.getName());		//Ŭ���� �̸�
		//System.out.println("---------constructor------");
		Constructor[] cons=classes.getDeclaredConstructors();	//��� �����ڸ� �����Ѵ�
		for(int i=0; i<cons.length; i++) {
			//for(Constructor con:cons){
			System.out.println(cons[i].getName());
			//System.out.println(con.getName());
		}
	}

}
