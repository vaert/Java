
public class VariableArguments {

	public static void main(String[] args) {
		print(3,4,5,6,7);
		int[] aa={5,4,7,1,9,12,0,3,2,6};
		print(aa);
		int a=4;
		print(a);
		String[] sNames={"¼ÒÃ¶","¹«±ÃÈ­","°³³ª¸®","Ã¶Âß"};
		print(sNames);
		print("µ¿¹é");
		Flower flo=Flower.LILY;
		print(flo);
		print(Flower.values());
		String s="Welcome to the Java Programming";
		//String[] ss=s.split("");
		print(s.split(" "));
	}
	
	public static void print(int ... p) {
		for(int en:p){
			System.out.printf("[%d]",en);
		}
		System.out.printf("%n");
	}
	
	public static void print(String ... p) {
		for(String en:p){
			System.out.printf("[%s]", en);
		}
		System.out.printf("%n");
	}
	
	public static void print(Flower ... p) {
		for(Flower en:p) {
			System.out.printf("[%s]", en);	//en.toString() --> en.name()
		}
		System.out.printf("%n");
	}

}
