 
public class selectionSort09041600 {
	public static void main(String[] args){
		int[] arr = {12,9,23,77,6,34};
		printArray(arr);
		selectionSort(arr);
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
	 * ѡ������
	 * 
	 * ����ֵΪʲô��void
	 * ������ڶ��ڴ��У�arrָ��{12,9,23,77,6,34}������飬
	 * ����selectionSort�������ʱ�������鴫�˽�ȥ
	 */
	
	public static void selectionSort(int[] arr){
		for(int x = 0; x < arr.length -1; x++){
			for(int y = x+1 ; y < arr.length; y++){
				if(arr[x] > arr[y]){//��ʼλ�õ�����
					int temp = arr[x];
					arr[x] = arr[y];
					arr[y] = temp;
				}
					
			}
		}
	}
}
