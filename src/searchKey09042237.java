
public class searchKey09042237 {
	public static void main(String[] args){
		
	}
	
	//二分查找，折半查找
	//前提：数组必须是有序的
	
	
	
	/*
	 * 查找
	 * 需求：查找一个元素在数组中第一次出现的位置。
	 */
	public static int searchKey(int[] arr, int key){
		//遍历数组查找
		for(int x = 0; x < arr.length; x++){
			if(arr[x] == key)
				return x;
		}
		return -1;  //-1，代表的是角标不存在的情况；-2，也可以，一般用-1
	}
}
