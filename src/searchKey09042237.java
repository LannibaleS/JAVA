
public class searchKey09042237 {
	public static void main(String[] args){
		
	}
	
	//���ֲ��ң��۰����
	//ǰ�᣺��������������
	
	
	
	/*
	 * ����
	 * ���󣺲���һ��Ԫ���������е�һ�γ��ֵ�λ�á�
	 */
	public static int searchKey(int[] arr, int key){
		//�����������
		for(int x = 0; x < arr.length; x++){
			if(arr[x] == key)
				return x;
		}
		return -1;  //-1��������ǽǱ겻���ڵ������-2��Ҳ���ԣ�һ����-1
	}
}
