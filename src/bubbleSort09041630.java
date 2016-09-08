import java.util.Arrays;
public class bubbleSort09041630 {
	public static void main(String[] args){
		int[] arr = {12,9,23,77,6,34};
		printArray(arr);
		//selectionSort(arr);
		bubbleSort(arr);
		
		/*
		 * /java自带算法，开发用这个
		 */
		Arrays.sort(arr);
		
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
		 * 冒泡排序
		 * 
		 * 返回值为什么是void
		 * 数组放在堆内存中，arr指向{12,9,23,77,6,34}这个数组，
		 * 调用selectionSort这个方法时，把数组传了进去
		 */
		
		public static void bubbleSort(int[] arr){
			for(int x = 0; x < arr.length -1; x++){
				for(int y = 0 ; y < arr.length-1-x; y++){
					if(arr[y] > arr[y+1]){//起始位置的数大
						/*int temp = arr[y];
						arr[y] = arr[y+1];
						arr[y+1] = temp;*/
						swap(arr, y, y+1);
					}		
				}
			}
		}
		
		
		//发现排序方法，位置置换代码重复，代码抽取
		public static void swap(int[] arr , int a, int b){
			int temp = arr[a];
			arr[a] = arr[b];
			arr[b] = temp;
		}
}
