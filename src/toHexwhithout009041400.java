
public class toHexwhithout009041400 {
	public static void main(String[] args){
		//ʮ���� --> ʮ������
				int l = 60;
				String str_hex = toHex(l);
				System.out.println(str_hex);
	}
	
	
	/*
	 * ����ʮ���� --> ʮ������
	 * ���裺&15  >>>4 ѭ��
	 * 
	 * ���������⣺
	 * 1��ѭ����
	 * 2��ȥ�������0
	 * 
	 * ���������
	 * 1��û�����һλ���Ȳ��洢����Ҫ����
	 * 
	 * 2�����ȥ��
	 * ��Ҫת�������ݻ᲻�����ƣ��������ʣ��Ľ���Ķ����ƶ���0��Ҳ����û����Чλ
	 * �Ͳ���Ҫ����&�����ˣ�Ҳ���ǲ���Ҫ���������д洢��
	 * 
	 */
	public static String toHex(int num){
		
		//1�������������洢�����ַ�������Ϊ8��һ���������8��ʮ������λ
		char[] chs = new char[8]; //һ������Ĭ����32��������λ������ܻ�����8��ʮ������λ
		
		// 2������һ�����ڲ������������
		int index = chs.length;
		
		//for(int x = 0; num!= 00 && x < 8; x++)
		while(num != 0){
			int temp = num & 15;
			
			if(temp > 9)
				chs[--index] = ((char)(temp-10+'A'));
			else
				chs[--index] = (char)(temp+'0');
			
			// 3����������-
			//index--;
			num = num >>> 4;
			//System.out.print(chs[x]);
		}
		System.out.println("index="+index);
		return "0x"+toString(chs,index);
		//return null;
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
