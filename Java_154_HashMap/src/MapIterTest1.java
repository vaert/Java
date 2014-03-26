import java.util.*;

public class MapIterTest1 {

	public static void main(String[] args) {
		
		HashMap<String,Comparable> list=new HashMap<String,Comparable>();
		
		list.put("0","lee");	// 0
		list.clear();			// 모두 제거
		list.put("1","cho");	// 1
		list.put("2","kim");	// 2
		list.put("3","chung");	// 3
		list.put("4","min");	// 4
		list.put("3","chung");	// 3과 동일
		System.out.println(list.size());	//size()
		System.out.println(list.containsKey("3"));
		list.remove("2");		// 2 제거 키를 이용
		System.out.println(list.size());
		print(list);			// Map에서 Set 만들기
	}
	
	// GitHub 테스트
	
	public static void print(Map sets) {
		Set set=sets.keySet();			//키를 Set으로
		Iterator iter=set.iterator();
		while(iter.hasNext()) {
			String key=(String)iter.next();
			System.out.println(key+" "+sets.get(key));	//value
		}
	}
}