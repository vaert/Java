import java.util.*;

public class MapIterTest1 {

	public static void main(String[] args) {
		
		HashMap<String,Comparable> list=new HashMap<String,Comparable>();
		
		list.put("0","lee");	// 0
		list.clear();			// ��� ����
		list.put("1","cho");	// 1
		list.put("2","kim");	// 2
		list.put("3","chung");	// 3
		list.put("4","min");	// 4
		list.put("3","chung");	// 3�� ����
		System.out.println(list.size());	//size()
		System.out.println(list.containsKey("3"));
		list.remove("2");		// 2 ���� Ű�� �̿�
		System.out.println(list.size());
		print(list);			// Map���� Set �����
	}
	
	// GitHub �׽�Ʈ
	
	public static void print(Map sets) {
		Set set=sets.keySet();			//Ű�� Set����
		Iterator iter=set.iterator();
		while(iter.hasNext()) {
			String key=(String)iter.next();
			System.out.println(key+" "+sets.get(key));	//value
		}
	}
}