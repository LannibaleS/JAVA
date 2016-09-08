
public class ArrayApplication {
	public static void main(String[] args){
		int[] arr = {231,2,532,3,6,78,41,642};
		int max = getMax(arr);
		System.out.println("max="+max);
		
		int max_2 = getMax_2(arr);
		System.out.println("max_2="+max_2);
	}
	/*ls13400364 456852ssss
	 * 需求：获取多个整数中的最大值
	 * 思路：1、数据多了为了便于操作，先存储起来。需要容器，用数组
	 *     2、多个数据需要进行比较。每次都有较大的数，需要记录下来和下一个数比较
	 *     3、将数组中的元素都比一遍。最后，就有了最大值
	 * 步骤：1、需要数组
	 *     2、定义一个变量，记录较大的数
	 *     3、对数组进行遍历，让元素和较大的值进行比较
	 *       如果元素大于较大的数，用变量记录该元素
	 *     4、遍历完成后，变量中记录的就是最大值
	 *     
	 * 定义功能：
	 * 明确1：结果？int
	 * 明确2：参数? int[]
	 */
	public static int getMax(int[] arr ){
		//1、定义变量。初始化为数组中的任意一个元素，最好是第一个元素
		int max = arr[0];
		
		//2、遍历数组
		for(int x = 1; x<arr.length; x++){
			/*
			 * 遍历的元素只要比max大，就用max记录下来，最后max记录的就是最大值
			 */
			if(arr[x] > max)
				max = arr[x];
		}
		return max;
	}
	
	/*
	 * 方法二
	 */
	public static int getMax_2(int[] arr ){
		int max = 0; //初始化为数组中的任意一个索引
		
		for(int y = 1; y<arr.length; y++){
			if(arr[y] > arr[max])
				max = y;
		}
		return arr[max];
	}
	public static int add(int[] array){
		//1、定义变量记录和
		int sum = 0;
		//2、通过循环对数组进行遍历
		for(int j = 0; j < array.length ;j++){
			sum = sum + array[j];
		}
		return sum;
	}
}
