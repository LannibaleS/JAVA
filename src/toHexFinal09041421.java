
public class toHexFinal09041421 {

	
	public static void main(String[] args){
		//ʮ���� --> ʮ������
				int l = 60;
				String str_hex = toHex(l);
				System.out.println(str_hex);
	}
	
	
	/*
	 * ����ʮ���� --> ʮ������  �ռ���
	 * ˼·��ʮ����ת��ʮ�����Ƶ�ÿһλ����ʮ������Ԫ���е�ĳһ��
	 * ʮ�����Ƶ�Ԫ���кܶ�̶����������һ��ж�Ӧ�ı��
	 * ���Կ���ʹ�ô�˵�еĲ��
	 */
	public static String toHex(int num){
		
		//1��������
		char[] chs = {'0','1','2','3','4','5'
				       ,'6','7','8','9','A',
				       'B','C','D','E','F'};
		
		//2��������ʱ����
		char[] arr = new char[8];
		
		//3������������ʱ�����ĽǱ�
		int index = arr.length;
		
		//4��ͨ��ѭ����num���� &15  >>>������
		while(num != 0){
			//5����num����&����
			int temp = num & 15;
			
			//6�����裻����&�����Ľ����Ϊ�Ǳ�����ȡ��Ӧ���ַ��������ַ��洢����ʱ������
		 	arr[--index] = chs[temp];
			
			//7����num����>>>����
		 	num = num >>> 4;
		}
		return "0x"+toString(arr,index);
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
