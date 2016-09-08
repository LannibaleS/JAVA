
public class toHexFinal09041421 {

	
	public static void main(String[] args){
		//十进制 --> 十六进制
				int l = 60;
				String str_hex = toHex(l);
				System.out.println(str_hex);
	}
	
	
	/*
	 * 需求：十进制 --> 十六进制  终极版
	 * 思路：十进制转成十六进制的每一位都是十六进制元素中的某一个
	 * 十六进制的元素有很多固定个数，而且还有对应的编号
	 * 所以可以使用传说中的查表法
	 */
	public static String toHex(int num){
		
		//1、建立表
		char[] chs = {'0','1','2','3','4','5'
				       ,'6','7','8','9','A',
				       'B','C','D','E','F'};
		
		//2、创建临时容器
		char[] arr = new char[8];
		
		//3、创建操作临时容器的角标
		int index = arr.length;
		
		//4、通过循环对num进行 &15  >>>等运算
		while(num != 0){
			//5、对num进行&运算
			int temp = num & 15;
			
			//6、精髓；根据&运算后的结果作为角标查表，获取对应的字符，并将字符存储到临时容器中
		 	arr[--index] = chs[temp];
			
			//7、对num进行>>>运算
		 	num = num >>> 4;
		}
		return "0x"+toString(arr,index);
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
