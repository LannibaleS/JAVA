
public class toHexwhithout009041400 {
	public static void main(String[] args){
		//十进制 --> 十六进制
				int l = 60;
				String str_hex = toHex(l);
				System.out.println(str_hex);
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
	 * 
	 * 2、如何去零
	 * 需要转换的数据会不断右移，如果右移剩余的结果的二进制都是0，也就是没有有效位
	 * 就不需要进行&运算了，也就是不需要再往数组中存储了
	 * 
	 */
	public static String toHex(int num){
		
		//1、定义容器。存储的是字符，长度为8，一个整数最多8个十六进制位
		char[] chs = new char[8]; //一个整数默认是32个二进制位，最多能换出出8个十六进制位
		
		// 2、定义一个用于操作数组的索引
		int index = chs.length;
		
		//for(int x = 0; num!= 00 && x < 8; x++)
		while(num != 0){
			int temp = num & 15;
			
			if(temp > 9)
				chs[--index] = ((char)(temp-10+'A'));
			else
				chs[--index] = (char)(temp+'0');
			
			// 3、让索引自-
			//index--;
			num = num >>> 4;
			//System.out.print(chs[x]);
		}
		System.out.println("index="+index);
		return "0x"+toString(chs,index);
		//return null;
	}
	
	//定义一个功能，将字符数组转成字符串
	public static String toString(char[] arr, int index){
		String temp = "";
		for(int x = index ; x < arr.length ; x++){
			temp = temp + arr[x];
		}
		return temp;
	}
}
