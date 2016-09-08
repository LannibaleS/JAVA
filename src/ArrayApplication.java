
public class ArrayApplication {
	public static void main(String[] args){
		int[] arr = {231,2,532,3,6,78,41,642};
		int max = getMax(arr);
		System.out.println("max="+max);
		
		int max_2 = getMax_2(arr);
		System.out.println("max_2="+max_2);
	}
	/*ls13400364 456852ssss
	 * ���󣺻�ȡ��������е����ֵ
	 * ˼·��1�����ݶ���Ϊ�˱��ڲ������ȴ洢��������Ҫ������������
	 *     2�����������Ҫ���бȽϡ�ÿ�ζ��нϴ��������Ҫ��¼��������һ�����Ƚ�
	 *     3���������е�Ԫ�ض���һ�顣��󣬾��������ֵ
	 * ���裺1����Ҫ����
	 *     2������һ����������¼�ϴ����
	 *     3����������б�������Ԫ�غͽϴ��ֵ���бȽ�
	 *       ���Ԫ�ش��ڽϴ�������ñ�����¼��Ԫ��
	 *     4��������ɺ󣬱����м�¼�ľ������ֵ
	 *     
	 * ���幦�ܣ�
	 * ��ȷ1�������int
	 * ��ȷ2������? int[]
	 */
	public static int getMax(int[] arr ){
		//1�������������ʼ��Ϊ�����е�����һ��Ԫ�أ�����ǵ�һ��Ԫ��
		int max = arr[0];
		
		//2����������
		for(int x = 1; x<arr.length; x++){
			/*
			 * ������Ԫ��ֻҪ��max�󣬾���max��¼���������max��¼�ľ������ֵ
			 */
			if(arr[x] > max)
				max = arr[x];
		}
		return max;
	}
	
	/*
	 * ������
	 */
	public static int getMax_2(int[] arr ){
		int max = 0; //��ʼ��Ϊ�����е�����һ������
		
		for(int y = 1; y<arr.length; y++){
			if(arr[y] > arr[max])
				max = y;
		}
		return arr[max];
	}
	public static int add(int[] array){
		//1�����������¼��
		int sum = 0;
		//2��ͨ��ѭ����������б���
		for(int j = 0; j < array.length ;j++){
			sum = sum + array[j];
		}
		return sum;
	}
}
