public class StringMethodMain1 {

	public static void _main(String[] args) {
		
		
		// 1 String immutable
		String st="hello";
		System.out.println(st+st.hashCode());
		st.replace('h', 'H');	//������ �����༭ �ȹٲ�
		System.out.println(st+st.hashCode());
		st=st.replace('h','H');
		System.out.println(st+st.hashCode());
		
		
		//2 String �� ��ġ �޼��� �ε����� 0����
		String test1="Hello my nick name is totoro.\n";
			test1+="I'm 29 years old.\n";
			test1+="I'm a good boy";
		System.out.println("�̱��� ���� :"+test1.length());
		System.out.println("ù ��° .��ġ"+test1.indexOf('.'));	//-1 �̸� ����.
		System.out.println("������° .��ġ"+test1.lastIndexOf('.'));
		System.out.println("ù ��° years ��ġ"+test1.indexOf("years"));
		
		
		//3 ��ġ�� �ִ� �ѱ��ھ� �θ���
		for(int i=0; i<test1.length(); i++) {
			System.out.print(test1.charAt(i));
		}
		System.out.println();
		
		
		//4 ���ϴ� ���ڿ� �迭
		String[] a=test1.split("\n");
		System.out.println(a.length);
		System.out.println(a[0]);
		
		
		//5 ���ڿ� ������ index�� 0���� �����Ѵ�.
		String b=test1.substring(4,8);
		String c=test1.substring(0,5);
		String bb=test1.substring(4);
		System.out.println(b);		//4��° ���ں��� (8-1)��° ���ڱ���
		System.out.println(c);		//0��° ���ں��� (5-1)��° ���ڱ���
		System.out.println(bb);		//0��° ���ں��� (4-1)��° ���ڱ���

	}

}
