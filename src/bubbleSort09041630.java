import java.util.Arrays;
public class bubbleSort09041630 {
	public static void main(String[] args){
		int[] arr = {12,9,23,77,6,34};
		printArray(arr);
		//selectionSort(arr);
		bubbleSort(arr);
		
		/*
		 * /java�Դ��㷨�����������
		 */
		Arrays.sort(arr);
		
		printArray(arr); 
		
		
	}
		
		//��ӡ����
		public static void printArray(int[] arr){
			for(int x = 0; x < arr.length ; x++){
				if(x != arr.length -1)
					System.out.print(arr[x]+",");
				else
					System.out.println(arr[x]);
			}
		}
		
		/*
		 * ���������
		 * ð������
		 * 
		 * ����ֵΪʲô��void
		 * ������ڶ��ڴ��У�arrָ��{12,9,23,77,6,34}������飬
		 * ����selectionSort�������ʱ�������鴫�˽�ȥ
		 */
		
		public static void bubbleSort(int[] arr){
			for(int x = 0; x < arr.length -1; x++){
				for(int y = 0 ; y < arr.length-1-x; y++){
					if(arr[y] > arr[y+1]){//��ʼλ�õ�����
						/*int temp = arr[y];
						arr[y] = arr[y+1];
						arr[y+1] = temp;*/
						swap(arr, y, y+1);
					}		
				}
			}
		}
		
		
		//�������򷽷���λ���û������ظ��������ȡ
		public static void swap(int[] arr , int a, int b){
			int temp = arr[a];
			arr[a] = arr[b];
			arr[b] = temp;
		}
}
