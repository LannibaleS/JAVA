
public class HexOctDelure09041500 {
	public static void main(String[] args){
		int num = 60;
		
		//ʮ���� --> ������
		String str_bin = toBinary(num);
		System.out.println("Bin:"+str_bin);
		//ʮ���� --> �˽���
		String str_oct = toOctal(num);
		System.out.println("Oct:"+str_oct);
		
		//ʮ���� --> ʮ������
		String str_hex =  toHex(num);
		System.out.println("Hex:"+str_hex);
		
		//Java�Ѿ��ṩ�Ĺ��ܣ����������
		System.out.println(Integer.toBinaryString(60));
		System.out.println(Integer.toOctalString(60));
		System.out.println(Integer.toHexString(60));
		
	}
	
	//ʮ���� --> ʮ������
	public static String toHex(int num){
		return "0x"+trans(num, 15, 4);
	}
	//ʮ���� --> ������
	public static String toBinary(int num){
		return trans(num, 1, 1);
	}
	//ʮ���� --> �˽���
	public static String toOctal(int num){
		return "0"+trans(num, 7, 3);
	}
	//����ת��
	public static String trans(int num, int base, int offset){//base ������offset ƫ����
		//����������0
		if(num == 0)
			return "0";
		
		//1��������
		char[] chs = {'0','1','2','3','4','5'
			       ,'6','7','8','9','A',
			       'B','C','D','E','F'};
		
		//2��������ʱ����
		char[] arr = new char[32];
		
		//3������������ʱ�����ĽǱ�
		int index = arr.length;
		
		//4��ͨ��ѭ����num���� &15  >>>������
		while(num != 0){
			//5����num����&����
			int temp = num & base;
			
			//6�����裻����&�����Ľ����Ϊ�Ǳ�����ȡ��Ӧ���ַ��������ַ��洢����ʱ������
		 	arr[--index] = chs[temp];
			
			//7����num����>>>����
		 	num = num >>> offset;
		}
		return toString(arr,index);
}
	
	//����һ�����ܣ����ַ�����ת���ַ���
	public static String toString(char[] arr, int index){
		String temp = "";
		for(int x = index ; x < arr.length ; x++){
			temp = temp + arr[x];
		}
		return temp;
	}
}
