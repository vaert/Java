/**
 * 다형성 : 
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
		
		Ball b2=new BaseBall();			//레퍼런스 다형성
		print(b2);
		BaseBall b3=new BaseBall();		//레퍼선스 다형성
		print(b3);						//아규먼트 다형성
	}

	public static void print(Ball b) {	//아규먼트 다형성
		b.printName();					//오버라이딩-->메서드 다형성
		if(b instanceof BaseBall) {		//인스턴스가 어떤 것?
			BaseBall bb=(BaseBall)b;	//캐스팅
			bb.printSize();
		}else if(b instanceof SockerBall) {
			SockerBall bb=(SockerBall)b;//캐스팅
			bb.printSize();
		}
	}
}
