
public class WhileDemo {
	public static void main(String[] args){
		int x = 1;
		while(x < 3)
		{
			System.out.println("x="+x);
			x++;
		}
		
		/*
		 * while语句练习：
		 * 需求1：显示1-10
		 */
		int i = 3;
		while(i<3)
		{
			System.out.println("i="+i);
			i++;
		}
		
		/*
		 * do-while:无论条件是否满足，循环体至少执行一次
		 */
		int j = 3;
		do
		{
			System.out.println("j="+j);
			j++;
		}
		while(j<3);
		
		// 需求2：求1-10的和
		/*
		 * 每次重复的都是和+下一个数
		 * 和是确定的吗？不确定，需要变量
		 * 下一个数是确定的吗？不确定，需要变量
		 * 和+下一个数再重复，说明需要多次执行，用循环
		 * 下一个数，是有规律的，自增
		 */
		int k = 1,sum = 0;
		while(k < 11)
		{
			//System.out.println("sum="+sum);
			sum = sum + k;
			k++;
		}
		System.out.println("sum="+sum);
		
		/*
		 * for(初始表达式；循环条件表达式；循环后的操作表达式)
		 * {
		 * 		执行语句：（循环体）
		 * }
		 */
		for(int s = 1; s < 3; s++)
		{
			System.out.println("s="+s);
		}
		//和while的区别
		//变量的作用域不同；for的变量的作用域仅在循环中
		
		/*
		 * 无限循环
		 * 好资源吗？
		 * 不耗资源：程序会在某个点进行等待，出发了条件才会执行，所以不耗费资源
		 * 最简单的无限循环：
		 * while(true){}
		 * for(; ;){}
		 */
		
		/*
		 * 需求：获取1-100之间6的倍数的个数
		 * 思路：1、个数是未知的，所以定义变量
		 *     2、6的倍数表示：只要是对6能整除，就是6的倍数
		 *     3、需要对1-100之间所有的数都要进行判断，如果是对个数变量进行自增
		 *     4、使用循环
		 *     
		 * 步骤
		       1、定义变量，记录个数
		       2、定义循环，遍历1-100
		       3、再循环中对1-100的数字进行判断
		       4、满足条件，个数变量自增
		 */
		
		//1、定义变量，记录个数
		int count = 0;
		for(int l = 1; l <= 100; l++ )
		{
			//对数值进行判断，是否是6的倍数
			if(l%6 == 0)
			{
				count++;
			}
		}
		System.out.println("6的倍数个数="+count);
		
		//for循环嵌套
		for(int q = 0; q < 3; q++){ //控制行
			for(int w = 0; w < 4; w++){ //控制每一行的个数
				System.out.print("*");
			}
			System.out.println(); //换行			
		}
		System.out.println("--------");
		/*
		 * 需求：在屏幕上显示以下图形
		 * *****
		 * ****
		 * ***
		 * **
		 * *
		 * 思路：1、看起来图形，发现是由5行组成
		 *     2、每一行都有多个星
		 *     3、多行，循环可以搞定。有趣的是，每到一行，里面有多个星。
		 *       循环内，还要循环，负责每一行有多少个*
		 *     4、外循环控制行数，内循环控制每一行有多少个*
		 * 步骤：1、for的嵌套循环
		 */
		
		int t = 5;
		for(int e=1; e <= 5; e++){
			for(int r = 1; r <= t; r++){
				System.out.print("*");
			}
			t--;
			System.out.println();
		}
		System.out.println("--------");
			
		//或者这么做
		//u与o变化一致 --》 u直接写成x
			//int u = 1;
		for(int O=1; O <= 5; O++){
			for(int r = O; r <= 5; r++){
				System.out.print("&");
				}
				//u++;
				System.out.println();
		    }
		System.out.println("--------");
		/*
		 * $
		 * $$
		 * $$$
		 * $$$$
		 * $$$$$
		 */
		//int d = 1;
		for(int a = 1 ;a <= 5;a++){
			for(int s = 1; s <= a ;s++){
				System.out.print("%");
			}
			//d++;
			System.out.println();
		}

		/*
		 * break:作用范围：switch、循环语句
		 */
		for(int g = 0; g<3; g++){
			if(g == 1)
				break;
			System.out.print("%");
		}
		
		outer:for(int h = 0; h<3; h++){
			inner:for(int b = 0;b<4;b++){
				System.out.print("%");
				break outer;
			}
		}
		System.out.println("--------");
		/*
		 * continue:作用范围：循环语句
		 * 作用：结束本次循环，继续下次循环
		 */
		for(int p = 1; p<10; p++){
			if(p%2 == 0)
				continue;
			System.out.println("p="+p);
		}
		System.out.println("--------");
		
		outter:for(int h = 0; h<3; h++){
			innner:for(int b = 0;b<4;b++){
				System.out.println("h="+h);
				continue outter;
			}
		}
			
	}
}
