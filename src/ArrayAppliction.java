
public class ArrayAppliction {
	public static void main(String[] args){
		
		//数组 --》 字符串
		int[] arr = {34,12,67,90};
		String str = toString(arr);
		System.out.println(str);
		
		//今天星期几
		int num = 3;
		String week = getWeek(num);
		System.out.println("今天是"+week);
		
		//十进制 --> 十六进制
		int l = 60;
		String str_hex = toHex(l);
		System.out.println(str_hex);
		
	}
	
	/*
	 * 需求1：定义功能，将{34,12,67}数组中的元素转化成字符串"[34,12,67]"
	 * 明确1：结果?字符串
	 * 明确2：参数？数组
	 * 
	 * 思路：
	 * 简单的方式就是利用字符串和任何数据相加都是相连接  "5+5="+5+5  55
	 */
	public static String toString(int[] array){
		//1、定义字符串变量
		String temp = "[";
		
		//2、遍历数组，将每一个数组的元素和字符串相连接
		for(int i = 0 ; i < array.length ; i++){
			 
			//判断：如果不是最后一个元素，最后加逗号
			if(i != (array.length - 1)){
				temp = temp + array[i] + ",";
			}else{
				temp = temp + array[i] + "]";
			}
				
		}
		//3、将连接后的字符串返回
		return temp;
	}
	
	
	/*
	 * 数组是用的核心思想
	 * 容器：1、固定长度
	 *      2、元素都有索引
	 * 什么时候使用容器呢？
	 * 数据多了，必须先进行存储。然后再进行操作
	 * 
	 * 对于数组容器什么时候用呢？
	 * 数据多，个数确定，而且有对应关系
	 * 在分析需求时：1、需求中的数据，是否有对应的有序编号？
	 *             2、需求中的数据，是否需要有序的编号？
	 *             如果有就用数组存储
	 * 
	 * 例1：一组数： 34 89 12 78 45 要对他们进行操作
	 *     需要编号，操作更容易。
	 * 
	 * 例2：根据用户输入的数据，显示对应的星期。
	 * 思考：
	 * 1、星期有多个，个数固定
	 * 2、星期有对应的有序编号，有序的编号就可以做为索引
	 * 所以可以使用数组这种结构进行存储
	 * 
	 */
	
	/*
	 * 定义一个功能：根据给定的数据，获取对应的信息
	 * 
	 * 查表法：数据之间存在着对应的关系，通过关系中的一方查询另一方，而得到结果
	 *        当对应关系存在，没有一方是有序编号时，使用另一个容器map
	 */
	public static String getWeek(int num){
		
		if(num > 7 || num < 1){
			return num+"没有对应的星期"; 
			//throw new RuntimeExcpetion(num+"没有对应的星期");
		}
		//1、定义一个数组，存储固定的星期数
		String[] weeks = {"","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		//其实就是根据指定的索引在查表

		//2、返回
		return weeks[num];
	}
	
	/*
	 * 需求：十进制 --> 十六进制
	 * 步骤：&15  >>>4 循环
	 * 
	 * 遇到的问题：
	 * 1、循序反了
	 * 2、去除多余的0
	 * 
	 * 解决方法：
	 * 1、没运算出一位，先不存储，需要容器
	 */
	public static String toHex(int num){
		
		//1、定义容器。存储的是字符，长度为8，一个整数最多8个十六进制位
		char[] chs = new char[8]; //一个整数默认是32个二进制位，最多能换出出8个十六进制位
		
		// 2、定义一个用于操作数组的索引
		int index = chs.length;
		
		for(int x = 0; x < 8; x++){
			int temp = num & 15;
			
			if(temp > 9)
				chs[--index] = ((char)(temp-10+'A'));
			else
				chs[--index] = (char)(temp+'0');
			
			// 3、让索引自增
			//index--;
			num = num >>> 4;
			// 4、遍历数组
			/*for(int i = 0; i < chs.length ; i++){
				System.out.println(chs[x]);
			}*/
			
			//System.out.print(chs[x]);
			
			return "0x"+toString(chs);
		}
		return null;
	}
	
	//定义一个功能，将字符数组转成字符串
	public static String toString(char[] arr){
		String temp = "";
		for(int x = 0 ; x < arr.length ; x++){
			temp = temp + arr[x];
		}
		return temp;
	}
	
	
	
	
	
	
	
	
	
}
