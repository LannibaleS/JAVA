
public class ArrayAppliction {
	public static void main(String[] args){
		
		//���� --�� �ַ���
		int[] arr = {34,12,67,90};
		String str = toString(arr);
		System.out.println(str);
		
		//�������ڼ�
		int num = 3;
		String week = getWeek(num);
		System.out.println("������"+week);
		
		//ʮ���� --> ʮ������
		int l = 60;
		String str_hex = toHex(l);
		System.out.println(str_hex);
		
	}
	
	/*
	 * ����1�����幦�ܣ���{34,12,67}�����е�Ԫ��ת�����ַ���"[34,12,67]"
	 * ��ȷ1�����?�ַ���
	 * ��ȷ2������������
	 * 
	 * ˼·��
	 * �򵥵ķ�ʽ���������ַ������κ�������Ӷ���������  "5+5="+5+5  55
	 */
	public static String toString(int[] array){
		//1�������ַ�������
		String temp = "[";
		
		//2���������飬��ÿһ�������Ԫ�غ��ַ���������
		for(int i = 0 ; i < array.length ; i++){
			 
			//�жϣ�����������һ��Ԫ�أ����Ӷ���
			if(i != (array.length - 1)){
				temp = temp + array[i] + ",";
			}else{
				temp = temp + array[i] + "]";
			}
				
		}
		//3�������Ӻ���ַ�������
		return temp;
	}
	
	
	/*
	 * �������õĺ���˼��
	 * ������1���̶�����
	 *      2��Ԫ�ض�������
	 * ʲôʱ��ʹ�������أ�
	 * ���ݶ��ˣ������Ƚ��д洢��Ȼ���ٽ��в���
	 * 
	 * ������������ʲôʱ�����أ�
	 * ���ݶ࣬����ȷ���������ж�Ӧ��ϵ
	 * �ڷ�������ʱ��1�������е����ݣ��Ƿ��ж�Ӧ�������ţ�
	 *             2�������е����ݣ��Ƿ���Ҫ����ı�ţ�
	 *             ����о�������洢
	 * 
	 * ��1��һ������ 34 89 12 78 45 Ҫ�����ǽ��в���
	 *     ��Ҫ��ţ����������ס�
	 * 
	 * ��2�������û���������ݣ���ʾ��Ӧ�����ڡ�
	 * ˼����
	 * 1�������ж���������̶�
	 * 2�������ж�Ӧ�������ţ�����ı�žͿ�����Ϊ����
	 * ���Կ���ʹ���������ֽṹ���д洢
	 * 
	 */
	
	/*
	 * ����һ�����ܣ����ݸ��������ݣ���ȡ��Ӧ����Ϣ
	 * 
	 * ���������֮������Ŷ�Ӧ�Ĺ�ϵ��ͨ����ϵ�е�һ����ѯ��һ�������õ����
	 *        ����Ӧ��ϵ���ڣ�û��һ����������ʱ��ʹ����һ������map
	 */
	public static String getWeek(int num){
		
		if(num > 7 || num < 1){
			return num+"û�ж�Ӧ������"; 
			//throw new RuntimeExcpetion(num+"û�ж�Ӧ������");
		}
		//1������һ�����飬�洢�̶���������
		String[] weeks = {"","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		//��ʵ���Ǹ���ָ���������ڲ��

		//2������
		return weeks[num];
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
	 */
	public static String toHex(int num){
		
		//1�������������洢�����ַ�������Ϊ8��һ���������8��ʮ������λ
		char[] chs = new char[8]; //һ������Ĭ����32��������λ������ܻ�����8��ʮ������λ
		
		// 2������һ�����ڲ������������
		int index = chs.length;
		
		for(int x = 0; x < 8; x++){
			int temp = num & 15;
			
			if(temp > 9)
				chs[--index] = ((char)(temp-10+'A'));
			else
				chs[--index] = (char)(temp+'0');
			
			// 3������������
			//index--;
			num = num >>> 4;
			// 4����������
			/*for(int i = 0; i < chs.length ; i++){
				System.out.println(chs[x]);
			}*/
			
			//System.out.print(chs[x]);
			
			return "0x"+toString(chs);
		}
		return null;
	}
	
	//����һ�����ܣ����ַ�����ת���ַ���
	public static String toString(char[] arr){
		String temp = "";
		for(int x = 0 ; x < arr.length ; x++){
			temp = temp + arr[x];
		}
		return temp;
	}
	
	
	
	
	
	
	
	
	
}
