/**
 * ������ : 
 * @author DooHo
 *
 */
public class BallMain {

	public static void main(String[] args) {
		Ball b1=new Ball();
		b1.printName();
		System.out.println(b1.getName());
		BaseBall bs1=new BaseBall();
		bs1.printName();
		bs1.printSize();
		SockerBall cs1=new SockerBall();
		cs1.printName();
		cs1.printSize();
		
		Ball b2=new BaseBall();			//���۷��� ������
		print(b2);
		BaseBall b3=new BaseBall();		//���ۼ��� ������
		print(b3);						//�ƱԸ�Ʈ ������
	}

	public static void print(Ball b) {	//�ƱԸ�Ʈ ������
		b.printName();					//�������̵�-->�޼��� ������
		if(b instanceof BaseBall) {		//�ν��Ͻ��� � ��?
			BaseBall bb=(BaseBall)b;	//ĳ����
			bb.printSize();
		}else if(b instanceof SockerBall) {
			SockerBall bb=(SockerBall)b;//ĳ����
			bb.printSize();
		}
	}
}
