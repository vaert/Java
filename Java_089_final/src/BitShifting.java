
public class BitShifting {
	public static final int BITMASK=1;
	
	public String makeBit(int value) {
		//char �迭�� String ���� ����� ����
		char[] val=new char[32];
		for(int i=31; i>=0; i--){
			if((value & BITMASK)==1) {
				val[i]='1';
			}else {
				val[i]='0';
			}
			value>>>=1;		//��ȣ ���� ������ �̵�
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
