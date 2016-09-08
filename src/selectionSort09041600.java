 
public class selectionSort09041600 {
	public static void main(String[] args){
		int[] arr = {12,9,23,77,6,34};
		printArray(arr);
		selectionSort(arr);
		printArray(arr); 
		
	}
	
	//打印数组
	public static void printArray(int[] arr){
		for(int x = 0; x < arr.length ; x++){
			if(x != arr.length -1)
				System.out.print(arr[x]+",");
			else
				System.out.println(arr[x]);
		}
	}
	
	/*
	 * 数组的排序
	 * 选择排序
	 * 
	 * 返回值为什么是void
	 * 数组放在堆内存中，arr指向{12,9,23,77,6,34}这个数组，
	 * 调用selectionSort这个方法时，把数组传了进去
	 */
	
	public static void selectionSort(int[] arr){
		for(int x = 0; x < arr.length -1; x++){
			for(int y = x+1 ; y < arr.length; y++){
				if(arr[x] > arr[y]){//起始位置的数大
					int temp = arr[x];
					arr[x] = arr[y];
					arr[y] = temp;
				}
					
			}
		}
	}
}
