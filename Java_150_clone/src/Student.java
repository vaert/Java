
public class Student implements Cloneable{
	private String name;
	private int id;
	private String addr;
	public Student(String name, int id, String addr) {
		this.name=name;
		this.id=id;
		this.addr=addr;
	}	//Student
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String toString() {
		return name+" "+id+" "+addr;
	}
	public Object clone() {
		try {
			return super.clone();
		}catch(CloneNotSupportedException e) {
			return this;
		}
	}
}
