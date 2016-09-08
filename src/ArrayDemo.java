
public class ArrayDemo {
	public static void main(String[] args){
		
		//数组的定义方式
		/*
		 * 数组好处：数组可以存储多个数据，而且可以对数据进行编号，从0开始，操作元素完全可以通过索引（编号）完成。
		 */
		//元素类型[] 数组名称 = new 元素类型[元素个数或者组长度]
		int[] arr = new int[3]; /*通过new关键字创建了一个长度为3，元素类型为int的数组实体*/
		System.out.println(arr[0]);
		//System.out.println(arr[3]); //ArrayIndexOutOfBoundsException 访问到了数组不存在的索引
		//arr = null;
		//System.out.println(arr[0]); //NullPointerException
		//当使用没有任何实体指向的引用变量操作实体时，运行会发生该异常
		
		//元素类型[] 数组名称 = new 元素类型[]{数组值}
		int[] arr1 = new int[]{1,2,3,4,5};
		
		//元素类型[] 数组名称 = {数组值}
		int[] arr2 = {1,3,5,7,44,245,667,8975,423};
		//如何获取数组的长度呢？通过数组的属性length
		System.out.println("arr2.length");
		for(int i = 0 ; i< arr2.length ; i++){
			System.out.println("arr2["+i+"]="+arr2[i]);
			
		}
		
		

		//调用add方法
		int[] arr5 = {12,3,4,5,6,7,7,8,3,2};
		int[] arr4 = {312,5436,7,86,9,352,8634};
		int sum = add(arr5);
		System.out.println(sum);
		System.out.println("sum="+sum);
	}
	
	//获取多个数的和的方式
	/*明确1：结果？和 int
	 * 明确2：参数？多个数，定义多个参数合适吗？既然是一组数，数组
	 */
	static int add(int[] array){
		//1、定义变量记录和
		int sum = 0;
		//2、通过循环对数组进行遍历
		for(int j = 0; j < array.length ;j++){
			sum = sum + array[j];
		}
		return sum;
	}
}