
public class HexOctDelure09041500 {
	public static void main(String[] args){
		int num = 60;
		
		//十进制 --> 二进制
		String str_bin = toBinary(num);
		System.out.println("Bin:"+str_bin);
		//十进制 --> 八进制
		String str_oct = toOctal(num);
		System.out.println("Oct:"+str_oct);
		
		//十进制 --> 十六进制
		String str_hex =  toHex(num);
		System.out.println("Hex:"+str_hex);
		
		//Java已经提供的功能，开发用这个
		System.out.println(Integer.toBinaryString(60));
		System.out.println(Integer.toOctalString(60));
		System.out.println(Integer.toHexString(60));
		
	}
	
	//十进制 --> 十六进制
	public static String toHex(int num){
		return "0x"+trans(num, 15, 4);
	}
	//十进制 --> 二进制
	public static String toBinary(int num){
		return trans(num, 1, 1);
	}
	//十进制 --> 八进制
	public static String toOctal(int num){
		return "0"+trans(num, 7, 3);
	}
	//进制转换
	public static String trans(int num, int base, int offset){//base 基数，offset 偏移量
		//如果输入的是0
		if(num == 0)
			return "0";
		
		//1、建立表
		char[] chs = {'0','1','2','3','4','5'
			       ,'6','7','8','9','A',
			       'B','C','D','E','F'};
		
		//2、创建临时容器
		char[] arr = new char[32];
		
		//3、创建操作临时容器的角标
		int index = arr.length;
		
		//4、通过循环对num进行 &15  >>>等运算
		while(num != 0){
			//5、对num进行&运算
			int temp = num & base;
			
			//6、精髓；根据&运算后的结果作为角标查表，获取对应的字符，并将字符存储到临时容器中
		 	arr[--index] = chs[temp];
			
			//7、对num进行>>>运算
		 	num = num >>> offset;
		}
		return toString(arr,index);
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
