
public class CloneMain {
	public static void main(String[] args) {
		Student st = new Student("����",6,"���� ���۱� ��Ѱ���");
		System.out.println("1"+st);
		Student st1= st;			//reference assignment copy
		st1.setAddr("��� ����");
		st1.setId(3);
		System.out.println("2"+st);
		
		Student sts=(Student)st.clone();	//���� ����
		System.out.println("3"+sts);
		
		sts.setAddr("���� ���");
		sts.setId(5);
		System.out.println("4"+st);
		System.out.println("5"+sts);
	}
}
