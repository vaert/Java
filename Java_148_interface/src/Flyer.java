/**
 * 		�������̽� Ư¡
 * 
 * 1) ������ �ڵ����� ����� �ȴ�.
 * 2) void show() -->  public abstract void show()
 * 3) �ٵ� ({}) �� ������ �ʴ´�.
 * 4) �߻�޼��带 �������� ���ϸ� �ڽ� Ŭ������ �߻�Ŭ������ �ȴ�.
 * 5) �������̽��� ������ �� �� implements IFish, IBird
 * 6) ����� �켱�̴�. extends Animal implements IFish
 * 7) �������̽��� �������� �������̽��� ����� �� �ִ�. IPenguin extends IAnimal, IFish, IBird 
 * 
 * @author DooHo
 *
 */
public interface Flyer {
	int fast=100;			//����� ��
	void fly();
	boolean isAnimal();
}
