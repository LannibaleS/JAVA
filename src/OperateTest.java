
public class OperateTest {
	public static void main(String[] args){
		//1、最有效率2*8
		System.out.println(2<<3);
		
		//2、两个整数变量的值进行互换，不要第三方变量
		int a=3 , b=7;
		//通过求和的方式，有个弊端，两个数据较大，会超出int的范围
		a = a + b; //a = 3+7 =10
		b = a - b; //b = 3+7-7 = 3
		a = a - b; //a = 3 + 7 - 3 = 7 
		
		
		//通过位运算
		a = a^b; // a = 3^7
		b = a^b; // b = 3^7^7 = 3
		System.out.println("b="+b);
		a = a^b; // a = 3^7^3 = 7
		System.out.println("a="+a);
		
		//三元运算符，格式：（条件表达式）？表达式1：表达式2
		int x = 2,y;
		y = x>1?100:200;
		System.out.println("y="+y);
		
		//需求：三个数，想知道最大的是哪一个
		int w = 14, e = 456, r = 678, max;
		max = w > e ? (w > r ? w : r) : (e > r ? e : r);
		//a > b ? (a > c ? a : c) : (b > c ? b : c);
		System.out.println("max="+max);
	}
}
