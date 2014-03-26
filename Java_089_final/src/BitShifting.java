
public class BitShifting {
	public static final int BITMASK=1;
	
	public String makeBit(int value) {
		//char 배열을 String 으로 만들기 위해
		char[] val=new char[32];
		for(int i=31; i>=0; i--){
			if((value & BITMASK)==1) {
				val[i]='1';
			}else {
				val[i]='0';
			}
			value>>>=1;		//부호 무시 오른쪽 이동
		}
		return new String(val);
	}
	
	public String makeBit(int orgin, int shift) {
		String temp="";
		if(shift>=0){
			temp=makeBit(orgin>>shift);
		}else {
			temp=makeBit(orgin<<(-shift));
		}
		return temp;
	}
}
