/**
 * 		인터페이스 특징
 * 
 * 1) 변수는 자동으로 상수가 된다.
 * 2) void show() -->  public abstract void show()
 * 3) 바디 ({}) 를 붙이지 않는다.
 * 4) 추상메서드를 구현하지 못하면 자식 클래스는 추상클래스가 된다.
 * 5) 인터페이스가 여러개 일 때 implements IFish, IBird
 * 6) 상속이 우선이다. extends Animal implements IFish
 * 7) 인터페이스는 여러개의 인터페이스를 상속할 수 있다. IPenguin extends IAnimal, IFish, IBird 
 * 
 * @author DooHo
 *
 */
public interface Flyer {
	int fast=100;			//상수가 됨
	void fly();
	boolean isAnimal();
}
