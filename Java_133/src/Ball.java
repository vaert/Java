/**
 * 은닉화 : 멤버필드는 private, 메서드는 public
 * 상속
 * @author DooHo
 *
 */
public class Ball {
	private String name="Ball";		//field private
	public void printName() {
		System.out.println("name:"+name);
	}
	public String getName() {
		return name;
	}
}
