import java.util.*;

public class JCFTest {

	public static void main(String[] args) {
		Set<Comparable> set=new HashSet<Comparable>();
		set.add("lee");			// 1
		set.add("lee");			// 1 �ߺ� �ȵ�
		set.add(new Integer(23));	// 3 primitive �� �� java 2
		System.out.println(set);
		
		List<String> list=new ArrayList<String>();
		list.add("lee");		// 0
		list.add("lee");		// 1 �ߺ���
		list.set(0,"cho");		// �ε��� ��ġ�� ����
		System.out.println(list);
		
		Vector<String> v=new Vector<String>(5);
		v.addElement("lee");
		v.add("lee");
		v.set(1,"cho");
		v.setElementAt("kim", 0);
		System.out.println(v);
		
		Map<String, Comparable> map=new HashMap<String, Comparable>();
		map.put("1", new Integer(3));
		map.put("2", "cho");
		map.put("2", "cho");
		System.out.println(map);
	}
}
