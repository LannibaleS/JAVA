
public class ArrayDemo {
	public static void main(String[] args){
		
		//����Ķ��巽ʽ
		/*
		 * ����ô���������Դ洢������ݣ����ҿ��Զ����ݽ��б�ţ���0��ʼ������Ԫ����ȫ����ͨ����������ţ���ɡ�
		 */
		//Ԫ������[] �������� = new Ԫ������[Ԫ�ظ��������鳤��]
		int[] arr = new int[3]; /*ͨ��new�ؼ��ִ�����һ������Ϊ3��Ԫ������Ϊint������ʵ��*/
		System.out.println(arr[0]);
		//System.out.println(arr[3]); //ArrayIndexOutOfBoundsException ���ʵ������鲻���ڵ�����
		//arr = null;
		//System.out.println(arr[0]); //NullPointerException
		//��ʹ��û���κ�ʵ��ָ������ñ�������ʵ��ʱ�����лᷢ�����쳣
		
		//Ԫ������[] �������� = new Ԫ������[]{����ֵ}
		int[] arr1 = new int[]{1,2,3,4,5};
		
		//Ԫ������[] �������� = {����ֵ}
		int[] arr2 = {1,3,5,7,44,245,667,8975,423};
		//��λ�ȡ����ĳ����أ�ͨ�����������length
		System.out.println("arr2.length");
		for(int i = 0 ; i< arr2.length ; i++){
			System.out.println("arr2["+i+"]="+arr2[i]);
			
		}
		
		

		//����add����
		int[] arr5 = {12,3,4,5,6,7,7,8,3,2};
		int[] arr4 = {312,5436,7,86,9,352,8634};
		int sum = add(arr5);
		System.out.println(sum);
		System.out.println("sum="+sum);
	}
	
	//��ȡ������ĺ͵ķ�ʽ
	/*��ȷ1��������� int
	 * ��ȷ2������������������������������𣿼�Ȼ��һ����������
	 */
	static int add(int[] array){
		//1�����������¼��
		int sum = 0;
		//2��ͨ��ѭ����������б���
		for(int j = 0; j < array.length ;j++){
			sum = sum + array[j];
		}
		return sum;
	}
}